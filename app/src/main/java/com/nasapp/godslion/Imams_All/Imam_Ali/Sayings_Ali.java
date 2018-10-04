package com.nasapp.godslion.Imams_All.Imam_Ali;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ViewFlipper;

import com.nasapp.godslion.R;

public class Sayings_Ali extends AppCompatActivity {

    private ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayings__ali);

        viewFlipper = findViewById(R.id.sayings_ali_viewFlipper);
    }

    public void previousView(View v){
        viewFlipper.showPrevious();
    }

    public void nextView(View v){
        viewFlipper.showNext();
    }
}
