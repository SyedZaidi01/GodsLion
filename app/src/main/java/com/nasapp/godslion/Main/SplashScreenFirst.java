package com.nasapp.godslion.Main;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

import com.nasapp.godslion.R;

public class SplashScreenFirst extends AppCompatActivity {

    private static int SPLASH_TIME_OUT =10000;

    LinearLayout l1;
    LinearLayout l2;

    Animation uptodown;
    Animation downtoup;

    MediaPlayer lionRoar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        lionRoar = MediaPlayer.create(getApplicationContext(),R.raw.lion_roar);
        lionRoar.start();

        //finding the LinearLayouts
        l1 = (LinearLayout)findViewById(R.id.linearLayout1);
       // l2 = (LinearLayout)findViewById(R.id.linearLayout2);

        //assigning animations to the layouts
        uptodown = AnimationUtils.loadAnimation(this,R.anim.uptodown);
        l1.setAnimation(uptodown);

        //assigning animations to the layouts
    //    downtoup = AnimationUtils.loadAnimation(this,R.anim.downtoup);
       // l2.setAnimation(downtoup);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(SplashScreenFirst.this,HomeActivity.class);
               startActivity(homeIntent);

            }
        },SPLASH_TIME_OUT);

    }

    @Override
    protected void onPause(){
        super.onPause();
        lionRoar.release();
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        System.exit(0);
    }
}
