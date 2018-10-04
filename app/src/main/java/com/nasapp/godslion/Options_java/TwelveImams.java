package com.nasapp.godslion.Options_java;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;

import com.nasapp.godslion.Imams_All.Imam_Ali.ImamAli;
import com.nasapp.godslion.Options_java.ProphetMuhammad.ProphetMuhammad;
import com.nasapp.godslion.Options_java.Sayings.Sayings;
import com.nasapp.godslion.R;
import com.nasapp.godslion.Main.TransitionSplash;

public class TwelveImams extends AppCompatActivity {

   // ListView listView;
  //  ArrayList list = new ArrayList();
   // ArrayAdapter adapter;
    GridLayout mainGrid;
   // ArrayList pics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twelve_imams);
        Intent intent = new Intent(this, TransitionSplash.class);
        startActivity(intent);

       // pics.add(res.im)
        mainGrid = (GridLayout) findViewById(R.id.grid_layout1);

        setSingleEvent(mainGrid);
      //  listView = (ListView) findViewById(R.id.list_view);

       // list.add("Imam Ali")              ;
       // list.add("Imam Hassan")           ;
       // list.add("Imam Hussain")          ;
       // list.add("Imam Zayn Al-Abidin")   ;
       // list.add("Imam Muhammad Baqir")   ;
       // list.add("Imam Ja'far as-Sadiq")  ;
       // list.add("Imam Musa Al-Kazim")    ;
        //list.add("Imam Ali Raza")         ;
       // list.add("Imam Ali Taqi")         ;
       // list.add("Imam Ali Naqi")         ;
       // list.add("Imam Hasan Al Askari")  ;
       // list.add("Imam Muhammad Al Mahdi");




       // adapter = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,list);
     //   listView.setAdapter(adapter);




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
                        Intent intent = new Intent(getApplicationContext(),ImamAli.class);
                        startActivity(intent);
                        //finish();
                    }
                    else if(finalI == 1){
                        Intent intent = new Intent(getApplicationContext(),ImamAli.class);
                        startActivity(intent);
                       // finish();
                    }
                    else if(finalI == 2){
                        Intent intent = new Intent(getApplicationContext(),ProphetMuhammad.class);
                        startActivity(intent);
                       // finish();
                    }
                    else if(finalI == 3){
                        Intent intent = new Intent(getApplicationContext(),Fatima.class);
                        startActivity(intent);
                        //finish();
                    }
                    else if(finalI == 4){
                        Intent intent = new Intent(getApplicationContext(),Sayings.class);
                        startActivity(intent);
                        //finish();
                    }
                    else if(finalI == 5){
                        Intent intent = new Intent(getApplicationContext(),Settings.class);
                        startActivity(intent);
                       // finish();
                    }
                    else if(finalI == 6){
                        Intent intent = new Intent(getApplicationContext(),Settings.class);
                        startActivity(intent);
                     //   finish();
                    }
                    else if(finalI == 7){
                        Intent intent = new Intent(getApplicationContext(),Settings.class);
                        startActivity(intent);
                       // finish();
                    }
                    else if(finalI == 8){
                        Intent intent = new Intent(getApplicationContext(),Settings.class);
                        startActivity(intent);
                        //finish();
                    }
                    else if(finalI == 9){
                        Intent intent = new Intent(getApplicationContext(),Settings.class);
                        startActivity(intent);
                        //finish();
                    }
                    else if(finalI == 10){
                        Intent intent = new Intent(getApplicationContext(),Settings.class);
                        startActivity(intent);
                       //finish();
                    }
                    else if(finalI == 11){
                        Intent intent = new Intent(getApplicationContext(),Settings.class);
                        startActivity(intent);
                       // finish();
                    }
                }
            });
        }
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(getApplicationContext(),TransitionSplash.class);
        startActivity(intent);
    }
}
