package com.nasapp.godslion.Main;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

import com.nasapp.godslion.R;

public class TransitionSplash extends AppCompatActivity {

    private static int SPLASH_TIME_OUT =1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                onBackPressed();
            }
        },SPLASH_TIME_OUT);

    }

    @Override
    protected void onPause(){
        super.onPause();
        //lionRoar.release();
        finish();
    }

}
