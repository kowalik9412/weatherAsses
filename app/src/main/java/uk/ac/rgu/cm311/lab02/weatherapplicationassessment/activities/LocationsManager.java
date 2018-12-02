package uk.ac.rgu.cm311.lab02.weatherapplicationassessment.activities;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import uk.ac.rgu.cm311.lab02.weatherapplicationassessment.R;


public class LocationsManager extends AppCompatActivity {

    private EditText loc1Name;
    private EditText loc1ID;
    private Button loc1BtnSave;
    private Button loc1BtnDelete;

    private EditText loc2Name;
    private EditText loc2ID;
    private Button loc2BtnSave;
    private Button loc2BtnDelete;

    private EditText loc3Name;
    private EditText loc3ID;
    private Button loc3BtnSave;
    private Button loc3BtnDelete;

    private EditText loc4Name;
    private EditText loc4ID;
    private Button loc4BtnSave;
    private Button loc4BtnDelete;

    private EditText loc5Name;
    private EditText loc5ID;
    private Button loc5BtnSave;
    private Button loc5BtnDelete;

    private EditText loc6Name;
    private EditText loc6ID;
    private Button loc6BtnSave;
    private Button loc6BtnDelete;

    private EditText loc7Name;
    private EditText loc7ID;
    private Button loc7BtnSave;
    private Button loc7BtnDelete;

    private EditText loc8Name;
    private EditText loc8ID;
    private Button loc8BtnSave;
    private Button loc8BtnDelete;

    private EditText loc9Name;
    private EditText loc9ID;
    private Button loc9BtnSave;
    private Button loc9BtnDelete;

    private EditText loc10Name;
    private EditText loc10ID;
    private Button loc10BtnSave;
    private Button loc10BtnDelete;



    private SharedPreferences myPrefs;
    private static final String PREFS_NAME = "savedLocations";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locations_manager);

        loc1Name = findViewById(R.id.loc1Name);
        loc1ID = findViewById(R.id.loc1ID);
        loc1BtnSave = findViewById(R.id.btn_loc1Save);
        loc1BtnDelete = findViewById(R.id.btn_loc1Delete);

        loc2Name = findViewById(R.id.loc2Name);
        loc2ID = findViewById(R.id.loc2ID);
        loc2BtnSave = findViewById(R.id.btn_loc2Save);
        loc2BtnDelete = findViewById(R.id.btn_loc2Delete);

        loc3Name = findViewById(R.id.loc3Name);
        loc3ID = findViewById(R.id.loc3ID);
        loc3BtnSave = findViewById(R.id.btn_loc3Save);
        loc3BtnDelete = findViewById(R.id.btn_loc3Delete);

        loc4Name = findViewById(R.id.loc4Name);
        loc4ID = findViewById(R.id.loc4ID);
        loc4BtnSave = findViewById(R.id.btn_loc4Save);
        loc4BtnDelete = findViewById(R.id.btn_loc4Delete);

        loc5Name = findViewById(R.id.loc5Name);
        loc5ID = findViewById(R.id.loc5ID);
        loc5BtnSave = findViewById(R.id.btn_loc5Save);
        loc5BtnDelete = findViewById(R.id.btn_loc5Delete);

        loc6Name = findViewById(R.id.loc6Name);
        loc6ID = findViewById(R.id.loc6ID);
        loc6BtnSave = findViewById(R.id.btn_loc6Save);
        loc6BtnDelete = findViewById(R.id.btn_loc6Delete);

        loc7Name = findViewById(R.id.loc7Name);
        loc7ID = findViewById(R.id.loc7ID);
        loc7BtnSave = findViewById(R.id.btn_loc7Save);
        loc7BtnDelete = findViewById(R.id.btn_loc7Delete);

        loc8Name = findViewById(R.id.loc8Name);
        loc8ID = findViewById(R.id.loc8ID);
        loc8BtnSave = findViewById(R.id.btn_loc8Save);
        loc8BtnDelete = findViewById(R.id.btn_loc8Delete);

        loc9Name = findViewById(R.id.loc9Name);
        loc9ID = findViewById(R.id.loc9ID);
        loc9BtnSave = findViewById(R.id.btn_loc9Save);
        loc9BtnDelete = findViewById(R.id.btn_loc9Delete);

        loc10Name = findViewById(R.id.loc10Name);
        loc10ID = findViewById(R.id.loc10ID);
        loc10BtnSave = findViewById(R.id.btn_loc10Save);
        loc10BtnDelete = findViewById(R.id.btn_loc10Delete);


//      Listeners for buttons position no.1
        //Save to sharedpreferences
        loc1BtnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPrefs = getSharedPreferences(PREFS_NAME, 0 );
                SharedPreferences.Editor editor = myPrefs.edit();

                if(loc1Name.getText().toString().isEmpty() || loc1ID.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Please fill in text fields before saving", Toast.LENGTH_LONG).show();
                }
                else {
                    editor.putString("loc1Name", loc1Name.getText().toString());
                    editor.putString("loc1Loc", loc1ID.getText().toString());
                    editor.commit();
                    Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_LONG).show();
                }
            }
        });
        //Delete from shared preferences
        loc1BtnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPrefs = getSharedPreferences(PREFS_NAME, 0 );
                SharedPreferences.Editor editor = myPrefs.edit();

                loc1Name.setText("");
                loc1ID.setText("");

                editor.remove("loc1Name").commit();
                editor.remove("loc1Loc").commit();
            }
        });

        //Listeners for buttons position no.2
        //Save to sharedpreferences
        loc2BtnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPrefs = getSharedPreferences(PREFS_NAME, 0 );
                SharedPreferences.Editor editor = myPrefs.edit();

                if(loc2Name.getText().toString().isEmpty() || loc2ID.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Please fill in text fields before saving", Toast.LENGTH_LONG).show();
                }
                else {
                    editor.putString("loc2Name", loc2Name.getText().toString());
                    editor.putString("loc2Loc", loc2ID.getText().toString());
                    editor.commit();
                    Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_LONG).show();
                }
            }
        });
        //Delete from shared preferneces
        loc2BtnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPrefs = getSharedPreferences(PREFS_NAME, 0 );
                SharedPreferences.Editor editor = myPrefs.edit();

                loc2Name.setText("");
                loc2ID.setText("");

                editor.remove("loc2Name").commit();
                editor.remove("loc2Loc").commit();
            }
        });

        //Listeners for buttons position no.3
        //Save to sharedpreferences
        loc3BtnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPrefs = getSharedPreferences(PREFS_NAME, 0 );
                SharedPreferences.Editor editor = myPrefs.edit();

                if(loc3Name.getText().toString().isEmpty() || loc3ID.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Please fill in text fields before saving", Toast.LENGTH_LONG).show();
                }
                else {
                    editor.putString("loc3Name", loc3Name.getText().toString());
                    editor.putString("loc3Loc", loc3ID.getText().toString());
                    editor.commit();
                    Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_LONG).show();
                }
            }
        });
        //Delete from shared preferneces
        loc3BtnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPrefs = getSharedPreferences(PREFS_NAME, 0 );
                SharedPreferences.Editor editor = myPrefs.edit();

                loc3Name.setText("");
                loc3ID.setText("");

                editor.remove("loc3Name").commit();
                editor.remove("loc3Loc").commit();
            }
        });

        //Listeners for buttons position no.4
        //Save to sharedpreferences
        loc4BtnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPrefs = getSharedPreferences(PREFS_NAME, 0 );
                SharedPreferences.Editor editor = myPrefs.edit();

                if(loc4Name.getText().toString().isEmpty() || loc4ID.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Please fill in text fields before saving", Toast.LENGTH_LONG).show();
                }
                else {
                    editor.putString("loc4Name", loc4Name.getText().toString());
                    editor.putString("loc4Loc", loc4ID.getText().toString());
                    editor.commit();
                    Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_LONG).show();
                }
            }
        });
        //Delete from shared preferneces
        loc4BtnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPrefs = getSharedPreferences(PREFS_NAME, 0 );
                SharedPreferences.Editor editor = myPrefs.edit();

                loc4Name.setText("");
                loc4ID.setText("");

                editor.remove("loc4Name").commit();
                editor.remove("loc4Loc").commit();
            }
        });

        //Listeners for buttons position no.5
        //Save to sharedpreferences
        loc5BtnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPrefs = getSharedPreferences(PREFS_NAME, 0 );
                SharedPreferences.Editor editor = myPrefs.edit();

                if(loc5Name.getText().toString().isEmpty() || loc5ID.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Please fill in text fields before saving", Toast.LENGTH_LONG).show();
                }
                else {
                    editor.putString("loc5Name", loc5Name.getText().toString());
                    editor.putString("loc5Loc", loc5ID.getText().toString());
                    editor.commit();
                    Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_LONG).show();
                }
            }
        });
        //Delete from shared preferneces
        loc5BtnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPrefs = getSharedPreferences(PREFS_NAME, 0 );
                SharedPreferences.Editor editor = myPrefs.edit();

                loc5Name.setText("");
                loc5ID.setText("");

                editor.remove("loc5Name").commit();
                editor.remove("loc5Loc").commit();
            }
        });

        //Listeners for buttons position no.6
        //Save to sharedpreferences
        loc6BtnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPrefs = getSharedPreferences(PREFS_NAME, 0 );
                SharedPreferences.Editor editor = myPrefs.edit();

                if(loc6Name.getText().toString().isEmpty() || loc6ID.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Please fill in text fields before saving", Toast.LENGTH_LONG).show();
                }
                else {
                    editor.putString("loc6Name", loc6Name.getText().toString());
                    editor.putString("loc6Loc", loc6ID.getText().toString());
                    editor.commit();
                    Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_LONG).show();
                }
            }
        });
        //Delete from shared preferneces
        loc6BtnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPrefs = getSharedPreferences(PREFS_NAME, 0 );
                SharedPreferences.Editor editor = myPrefs.edit();

                loc6Name.setText("");
                loc6ID.setText("");

                editor.remove("loc6Name").commit();
                editor.remove("loc6Loc").commit();
            }
        });

        //Listeners for buttons position no.7
        //Save to sharedpreferences
        loc7BtnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPrefs = getSharedPreferences(PREFS_NAME, 0 );
                SharedPreferences.Editor editor = myPrefs.edit();

                if(loc7Name.getText().toString().isEmpty() || loc7ID.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Please fill in text fields before saving", Toast.LENGTH_LONG).show();
                }
                else {
                    editor.putString("loc7Name", loc7Name.getText().toString());
                    editor.putString("loc7Loc", loc7ID.getText().toString());
                    editor.commit();
                    Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_LONG).show();
                }
            }
        });
        //Delete from shared preferneces
        loc7BtnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPrefs = getSharedPreferences(PREFS_NAME, 0 );
                SharedPreferences.Editor editor = myPrefs.edit();

                loc7Name.setText("");
                loc7ID.setText("");

                editor.remove("loc7Name").commit();
                editor.remove("loc7Loc").commit();
            }
        });

        //Listeners for buttons position no.8
        //Save to sharedpreferences
        loc8BtnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPrefs = getSharedPreferences(PREFS_NAME, 0 );
                SharedPreferences.Editor editor = myPrefs.edit();

                if(loc8Name.getText().toString().isEmpty() || loc8ID.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Please fill in text fields before saving", Toast.LENGTH_LONG).show();
                }
                else {
                    editor.putString("loc8Name", loc8Name.getText().toString());
                    editor.putString("loc8Loc", loc8ID.getText().toString());
                    editor.commit();
                    Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_LONG).show();
                }
            }
        });
        //Delete from shared preferneces
        loc8BtnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPrefs = getSharedPreferences(PREFS_NAME, 0 );
                SharedPreferences.Editor editor = myPrefs.edit();

                loc8Name.setText("");
                loc8ID.setText("");

                editor.remove("loc8Name").commit();
                editor.remove("loc8Loc").commit();
            }
        });

        //Listeners for buttons position no.9
        //Save to sharedpreferences
        loc9BtnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPrefs = getSharedPreferences(PREFS_NAME, 0 );
                SharedPreferences.Editor editor = myPrefs.edit();

                if(loc9Name.getText().toString().isEmpty() || loc9ID.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Please fill in text fields before saving", Toast.LENGTH_LONG).show();
                }
                else {
                    editor.putString("loc9Name", loc9Name.getText().toString());
                    editor.putString("loc9Loc", loc9ID.getText().toString());
                    editor.commit();
                    Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_LONG).show();
                }
            }
        });
        //Delete from shared preferneces
        loc9BtnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPrefs = getSharedPreferences(PREFS_NAME, 0 );
                SharedPreferences.Editor editor = myPrefs.edit();

                loc9Name.setText("");
                loc9ID.setText("");

                editor.remove("loc9Name").commit();
                editor.remove("loc9Loc").commit();
            }
        });


        //Listeners for buttons position no.10
        //Save to sharedpreferences
        loc10BtnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPrefs = getSharedPreferences(PREFS_NAME, 0 );
                SharedPreferences.Editor editor = myPrefs.edit();

                if(loc10Name.getText().toString().isEmpty() || loc10ID.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Please fill in text fields before saving", Toast.LENGTH_LONG).show();
                }
                else {
                    editor.putString("loc10Name", loc10Name.getText().toString());
                    editor.putString("loc10Loc", loc10ID.getText().toString());
                    editor.commit();
                    Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_LONG).show();
                }
            }
        });
        //Delete from shared preferneces
        loc10BtnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPrefs = getSharedPreferences(PREFS_NAME, 0 );
                SharedPreferences.Editor editor = myPrefs.edit();

                loc10Name.setText("");
                loc10ID.setText("");

                editor.remove("loc10Name").commit();
                editor.remove("loc10Loc").commit();
            }
        });

        //Read saved data from PREFS_NAME file

        SharedPreferences prefs = getSharedPreferences(PREFS_NAME, 0);

        //No.1
        if (prefs.contains("loc1Name") & prefs.contains("loc1Loc")){
            String name = prefs.getString("loc1Name", "not found");
            String location = prefs.getString("loc1Loc", "not found");

            loc1Name.setText(name);
            loc1ID.setText(location);
        }
        //No.2
        if (prefs.contains("loc2Name") & prefs.contains("loc2Loc")){
            String name = prefs.getString("loc2Name", "not found");
            String location = prefs.getString("loc2Loc", "not found");

            loc2Name.setText(name);
            loc2ID.setText(location);
        }
        //No.3
        if (prefs.contains("loc3Name") & prefs.contains("loc3Loc")){
            String name = prefs.getString("loc3Name", "not found");
            String location = prefs.getString("loc3Loc", "not found");

            loc3Name.setText(name);
            loc3ID.setText(location);
        }
        //No.4
        if (prefs.contains("loc4Name") & prefs.contains("loc4Loc")){
            String name = prefs.getString("loc4Name", "not found");
            String location = prefs.getString("loc4Loc", "not found");

            loc4Name.setText(name);
            loc4ID.setText(location);
        }
        //No.5
        if (prefs.contains("loc5Name") & prefs.contains("loc5Loc")){
            String name = prefs.getString("loc5Name", "not found");
            String location = prefs.getString("loc5Loc", "not found");

            loc5Name.setText(name);
            loc5ID.setText(location);
        }
        //No.6
        if (prefs.contains("loc6Name") & prefs.contains("loc6Loc")){
            String name = prefs.getString("loc6Name", "not found");
            String location = prefs.getString("loc6Loc", "not found");

            loc6Name.setText(name);
            loc6ID.setText(location);
        }
        //No.7
        if (prefs.contains("loc7Name") & prefs.contains("loc7Loc")){
            String name = prefs.getString("loc7Name", "not found");
            String location = prefs.getString("loc7Loc", "not found");

            loc7Name.setText(name);
            loc7ID.setText(location);
        }
        //No.8
        if (prefs.contains("loc8Name") & prefs.contains("loc8Loc")){
            String name = prefs.getString("loc8Name", "not found");
            String location = prefs.getString("loc8Loc", "not found");

            loc8Name.setText(name);
            loc8ID.setText(location);
        }//No.9
        if (prefs.contains("loc9Name") & prefs.contains("loc9Loc")){
            String name = prefs.getString("loc9Name", "not found");
            String location = prefs.getString("loc9Loc", "not found");

            loc9Name.setText(name);
            loc9ID.setText(location);
        }
        //No.10
        if (prefs.contains("loc10Name") & prefs.contains("loc10Loc")){
            String name = prefs.getString("loc10Name", "not found");
            String location = prefs.getString("loc10Loc", "not found");

            loc10Name.setText(name);
            loc10ID.setText(location);
        }

    }
}