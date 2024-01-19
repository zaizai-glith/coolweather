package com.example.coolweather;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //判断缓存数据
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        //不为null说明之前已经缓存过数据了，无需让用户再次选择城市，直接跳转到WeatherActivity即可。
        if (prefs.getString("weather", null) != null) {
            Log.i(TAG, "onCreate weather is not null, start WeatherActivity");
            Intent intent = new Intent(this, WeatherActivity.class);
            startActivity(intent);
            finish();
        }
    }
}