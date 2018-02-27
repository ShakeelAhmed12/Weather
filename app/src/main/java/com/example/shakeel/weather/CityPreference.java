package com.example.shakeel.weather;

import android.app.Activity;
import android.content.SharedPreferences;

/**
 * Created by Shakeel on 25/02/2018.
 */

public class CityPreference {

    SharedPreferences prefs;

    public CityPreference(Activity activity){
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    String getCity(){
        return prefs.getString("city", "England, UK");
    }

    void setCity(String city){
        prefs.edit().putString("city", city).apply();
    }
}
