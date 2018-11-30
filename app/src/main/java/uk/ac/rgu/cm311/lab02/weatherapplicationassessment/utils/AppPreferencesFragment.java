package uk.ac.rgu.cm311.lab02.weatherapplicationassessment.utils;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

import uk.ac.rgu.cm311.lab02.weatherapplicationassessment.R;

public class AppPreferencesFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle bundle, String rootKey){
        setPreferencesFromResource(R.xml.preferences, rootKey);
    }
}
