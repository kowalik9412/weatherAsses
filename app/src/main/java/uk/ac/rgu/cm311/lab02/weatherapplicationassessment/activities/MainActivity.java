package uk.ac.rgu.cm311.lab02.weatherapplicationassessment.activities;

import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import uk.ac.rgu.cm311.lab02.weatherapplicationassessment.R;
import uk.ac.rgu.cm311.lab02.weatherapplicationassessment.model.CurrentCondition;
import uk.ac.rgu.cm311.lab02.weatherapplicationassessment.utils.Constants;

public class MainActivity extends AppCompatActivity {

    //Declare other classes
    Constants constants;
    CurrentCondition currentCondition = new CurrentCondition();

    //Declare buttons
    private Button checkWeatherButton;
    private Button checkLocationsButton;

    //Declare edit texts
    private EditText findLocationId;

    //Declare strings
    private String loc = "";
    private String fullURL;

    private RequestQueue queue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        queue = Volley.newRequestQueue(this);

        checkLocationsButton = findViewById(R.id.btn_manage_locations);
        checkLocationsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LocationsActivity.class);
                startActivity(intent);
            }
        });

        checkWeatherButton = findViewById(R.id.btn_check_weather);
        checkWeatherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Get users input from edit text & save it to String loc
                findLocationId = findViewById(R.id.et_find_loc);
                loc = findLocationId.getText().toString();
                Log.d("loc ", loc);

                if (loc.matches("")){
                    Toast.makeText(getApplicationContext(), "Please enter location ID", Toast.LENGTH_LONG).show();
                    return;
                }
                else {
                    //Build full API url & include string from String loc
                    getURL(constants.URL_LEFT, loc, constants.URL_RIGHT);
                    Log.d("loc", fullURL);

                    //Run getCurrentWeather function
                    getCurrentWeather();

                    new CountDownTimer(4000,1000){
                        public void onTick(long milisUntilFinished){
                            long timeLeft =  milisUntilFinished / 1000;
                            Toast.makeText(getApplicationContext(), "Time left: " + timeLeft, Toast.LENGTH_SHORT).show();
                        }
                        public void onFinish(){
                            //Build intent and pass data
                            Intent intent = new Intent(MainActivity.this, CheckWeather.class);
                            intent.putExtra("Main", currentCondition.getCondition());
                            intent.putExtra("DescCon", currentCondition.getDescription());
                            intent.putExtra("MainCity", currentCondition.getCity());
                            intent.putExtra("MainLoc", currentCondition.getLocationId());
                            intent.putExtra("MainTemp", currentCondition.getTemperature());
                            intent.putExtra("MainHum", currentCondition.getHumidity());
                            intent.putExtra("MainMinTemp", currentCondition.getMinTemp());
                            intent.putExtra("MainMaxTemp", currentCondition.getMaxTemp());
                            intent.putExtra("MainWind", currentCondition.getWindSpeed());
                            intent.putExtra("MainPressure", currentCondition.getPressure());
                            startActivity(intent);
                        }
                    }.start();
                }
            }
        });

    }

    //Build FULL URL
    private String getURL(String url1, String locID, String url2) {
        fullURL = url1 + locID + url2;
        return fullURL;
    }

    //Get current weather conditions
    private void getCurrentWeather(){
        final JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET,
                fullURL, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONArray weather = response.getJSONArray("weather");

                    for (int i = 0; i < weather.length(); i++){
                        JSONObject propertiesObj = weather.getJSONObject(i);

                        currentCondition.setCondition(propertiesObj.getString("main"));
                        currentCondition.setDescription(propertiesObj.getString("description"));
                    }

                    JSONObject main = response.getJSONObject("main");
                    currentCondition.setTemperature(main.getString("temp"));
                    currentCondition.setPressure(main.getString("pressure"));
                    currentCondition.setHumidity(main.getString("humidity"));
                    currentCondition.setMinTemp(main.getString("temp_min"));
                    currentCondition.setMaxTemp(main.getString("temp_max"));

                    JSONObject windobj = response.getJSONObject("wind");
                    currentCondition.setWindSpeed(windobj.getString("speed"));

                    currentCondition.setCity(response.getString("name"));
                    currentCondition.setLocationId(response.getString("id"));

                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });
        queue.add(jsonObjectRequest);
    }
}
