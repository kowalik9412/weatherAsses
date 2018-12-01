/**package uk.ac.rgu.cm311.lab02.weatherapplicationassessment.utils;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.preference.CheckBoxPreference;
import android.support.v7.preference.EditTextPreference;
import android.support.v7.preference.Preference;
import android.support.v7.preference.PreferenceFragmentCompat;
import android.support.v7.preference.PreferenceManager;

import uk.ac.rgu.cm311.lab02.weatherapplicationassessment.R;

public class AppPreferencesFragment extends PreferenceFragmentCompat implements Preference.OnPreferenceChangeListener {


    @Override
    public void onCreatePreferences(Bundle bundle, String rootKey){
        setPreferencesFromResource(R.xml.preferences, rootKey);

        final CheckBoxPreference checkBox1 = (CheckBoxPreference) getPreferenceManager().findPreference();

        if ()

        EditTextPreference location1Name = (EditTextPreference)findPreference(getString(R.string.pref_location_name1));
        location1Name.setOnPreferenceChangeListener(this);

        //if the address preference has been set, then set that value to be the summary
        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(getActivity().getApplicationContext());
        String defaultLocation1Name = getString(R.string.pref_location_name1_default);
        String changeLocation1Summary = sharedPrefs.getString(getString(R.string.pref_location_name1), defaultLocation1Name);
        // if changeLocation1Summary is the default value, then make sure the default summary text is shown
        if (defaultLocation1Name.equals(changeLocation1Summary)){
            String defaultLocation1Summary = getString(R.string.pref_location_name1_default);
            location1Name.setSummary(defaultLocation1Summary);
        }
        else{
            location1Name.setSummary(changeLocation1Summary);
        }

    }

    @Override
    public boolean onPreferenceChange(Preference preference, Object o) {
        return false;
    }
}
*/