package com.nasapp.godslion.Options_java.Sayings;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.nasapp.godslion.R;

public class Duas_Activity extends AppCompatActivity {


    public static ImageView image1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duas);

        image1 = findViewById(R.id.duas_image1);


        Bundle bundle = getIntent().getExtras();

        if( bundle != null) {
            int resid = bundle.getInt("resId");
            image1.setImageResource(resid);
        }
    }

}

