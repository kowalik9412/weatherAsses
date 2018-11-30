package uk.ac.rgu.cm311.lab02.weatherapplicationassessment.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import uk.ac.rgu.cm311.lab02.weatherapplicationassessment.R;

public class CheckWeather extends AppCompatActivity {

    private TextView tvDesc;
    private TextView tvMain;
    private TextView tvCity;
    private TextView tvLoc;
    private TextView tvTemp;
    private TextView tvHum;
    private TextView tvMinMaxTemp;
    private TextView tvWind;
    private TextView tvPressure;

    private String TAG = "test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_weather);

        tvDesc = findViewById(R.id.tv_cond_desc);
        tvMain = findViewById(R.id.tv_condition);
        tvCity = findViewById(R.id.tv_city);
        tvLoc = findViewById(R.id.city_loc_id);
        tvTemp = findViewById(R.id.tv_current_temp);
        tvHum = findViewById(R.id.tv_humidity_desc);
        tvMinMaxTemp = findViewById(R.id.tv_temp_max);
        tvWind = findViewById(R.id.tv_wind_desc);
        tvPressure = findViewById(R.id.tv_pressure_desc);

        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            String main = extras.getString("Main");
            String condition = extras.getString("DescCon");
            String city = extras.getString("MainCity");
            String loc = extras.getString("MainLoc");
            String temp = extras.getString("MainTemp");
            String hum = extras.getString("MainHum");
            String minTemp = extras.getString("MainMinTemp");
            String maxTemp = extras.getString("MainMaxTemp");
            String wind = extras.getString("MainWind");
            String pressure = extras.getString("MainPressure");

            tvDesc.setText("Description: " + condition);
            tvMain.setText("Condition: " + main);
            tvCity.setText("City: " + city);
            tvLoc.setText("ID: " + loc);
            tvTemp.setText(temp + "°C");
            tvHum.setText(hum + "%");
            tvMinMaxTemp.setText("Min/ Max: " + minTemp + "/ " + maxTemp);
            tvWind.setText(wind + " km/h");
            tvPressure.setText(pressure + "hPa");
        }
    }
}
