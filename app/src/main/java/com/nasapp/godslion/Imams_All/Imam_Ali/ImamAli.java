package com.nasapp.godslion.Imams_All.Imam_Ali;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.nasapp.godslion.R;
import com.nasapp.godslion.Main.TransitionSplash;

public class ImamAli extends AppCompatActivity {

    LinearLayout   aliLayout;
    RelativeLayout hadith;
    RelativeLayout history;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imam_ali);
        Intent intent = new Intent(this, TransitionSplash.class);
        startActivity(intent);

        aliLayout = findViewById(R.id.ali_layout);

        hadith = findViewById(R.id.ali_hadith);

        history = findViewById(R.id.ali_history);

        hadith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( v == hadith) {
                    Intent intent = new Intent(getApplicationContext(), Sayings_Ali.class);
                    startActivity(intent);
                }
            }
        });

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v == history) {
                    Intent intent = new Intent(getApplicationContext(),History_Ali.class);
                    startActivity(intent);
                }
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(getApplicationContext(),TransitionSplash.class);
        startActivity(intent);
    }

}
