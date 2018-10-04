package com.nasapp.godslion.Options_java.ProphetMuhammad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ViewFlipper;

import com.nasapp.godslion.R;

public class Sayings_Muhammad extends AppCompatActivity {

    private ViewFlipper viewFlipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayings__muhammad);
        viewFlipper = findViewById(R.id.sayings_muhammad_viewFlipper);
    }

    public void previousView(View v){
        viewFlipper.showPrevious();
    }

    public void nextView(View v){
        viewFlipper.showNext();
    }
}
