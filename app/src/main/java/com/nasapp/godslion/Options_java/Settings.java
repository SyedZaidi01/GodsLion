package com.nasapp.godslion.Options_java;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.nasapp.godslion.R;
import com.nasapp.godslion.Main.TransitionSplash;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Intent intent = new Intent(this, TransitionSplash.class);
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(getApplicationContext(),TransitionSplash.class);
        startActivity(intent);
    }
}
