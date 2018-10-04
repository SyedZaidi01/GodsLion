package com.nasapp.godslion.Options_java.ProphetMuhammad;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.nasapp.godslion.Imams_All.Imam_Ali.History_Ali;
import com.nasapp.godslion.Imams_All.Imam_Ali.Sayings_Ali;
import com.nasapp.godslion.R;
import com.nasapp.godslion.Main.TransitionSplash;

public class ProphetMuhammad extends AppCompatActivity {

    LinearLayout   aliLayout;
    RelativeLayout hadith;
    RelativeLayout history;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prophet_muhammad);
        Intent intent = new Intent(this, TransitionSplash.class);
        startActivity(intent);

        aliLayout = findViewById(R.id.ali_layout);

        hadith = findViewById(R.id.muhammad_hadith);

        history = findViewById(R.id.muhammad_history);

        hadith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( v == hadith) {
                    Intent intent = new Intent(getApplicationContext(), Sayings_Muhammad.class);
                    startActivity(intent);
                }
            }
        });

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v == history) {
                    Intent intent = new Intent(getApplicationContext(),History_Muhammad.class);
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
