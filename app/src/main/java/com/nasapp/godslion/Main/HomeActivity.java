package com.nasapp.godslion.Main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

import com.nasapp.godslion.Options_java.Fatima;
import com.nasapp.godslion.Imams_All.Imam_Ali.ImamAli;
import com.nasapp.godslion.Options_java.ProphetMuhammad.ProphetMuhammad;
import com.nasapp.godslion.Options_java.Sayings.Sayings;
import com.nasapp.godslion.Options_java.Settings;
import com.nasapp.godslion.Options_java.TwelveImams;
import com.nasapp.godslion.R;

public class HomeActivity extends AppCompatActivity {

    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toast.makeText(HomeActivity.this,"Made by: Syed Muhammad Ali Raza Zaidi",Toast.LENGTH_LONG).show();
        mainGrid = (GridLayout) findViewById(R.id.grid_layout);

        setSingleEvent(mainGrid);
    }

    private void setSingleEvent(final GridLayout mainGrid){
        for(int i=0; i<mainGrid.getChildCount();i++)
        {
            CardView cardView = (CardView)mainGrid.getChildAt(i);
            final int finalI = i;

            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(finalI == 0){
                        Intent intent = new Intent(getApplicationContext(),ProphetMuhammad.class);
                        startActivity(intent);
                       // finish();
                    }
                    else if(finalI == 1){
                        Intent intent = new Intent(getApplicationContext(),ImamAli.class);
                        startActivity(intent);
                       // finish();
                    }
                    else if(finalI == 2){
                        Intent intent = new Intent(getApplicationContext(),TwelveImams.class);
                        startActivity(intent);
                        finish();
                    }
                    else if(finalI == 3){
                        Intent intent = new Intent(getApplicationContext(),Fatima.class);
                        startActivity(intent);
                        finish();
                    }
                    else if(finalI == 4){
                        Intent intent = new Intent(getApplicationContext(),Sayings.class);
                        startActivity(intent);
                        finish();
                    }
                    else if(finalI == 5){
                        Intent intent = new Intent(getApplicationContext(),Settings.class);
                        startActivity(intent);
                        finish();
                    }
                }
            });
        }
    }
}
