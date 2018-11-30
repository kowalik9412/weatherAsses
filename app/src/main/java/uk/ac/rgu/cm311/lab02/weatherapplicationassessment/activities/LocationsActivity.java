/**package uk.ac.rgu.cm311.lab02.weatherapplicationassessment.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import uk.ac.rgu.cm311.lab02.weatherapplicationassessment.R;
import uk.ac.rgu.cm311.lab02.weatherapplicationassessment.utils.AppPreferencesFragment;

public class LocationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_locations);

        //Display the fragment as the main content
        getSupportFragmentManager().beginTransaction()
                .replace(android.R.id.content, new AppPreferencesFragment())
                .commit();
    }
}*/
