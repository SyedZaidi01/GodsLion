package com.nasapp.godslion.Options_java.Sayings;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import com.nasapp.godslion.R;
import com.nasapp.godslion.Main.TransitionSplash;

import java.util.ArrayList;

public class Sayings extends AppCompatActivity {

     ListView                      listView;
     ArrayList list  =      new ArrayList();
     ArrayAdapter                   adapter;
     ImageView image = Duas_Activity.image1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayings);

        image    =      findViewById(R.id.duas_image1);

        listView = findViewById(R.id.listview_sayings);

        list.add("Ayat-ul-Kursi")         ;                            //position 0
        list.add("Nad-e-Ali")             ;                            //position 1
        list.add("Ziarat-e-Imam Hussain") ;                            //position 2
        list.add("Ziarat Hazrat Abbas")   ;                            //position 3
        list.add("Imam Muhammad Baqir")   ;                            //position 4
        list.add("Imam Ja'far as-Sadiq")  ;                            //position 5
        list.add("Imam Musa Al-Kazim")    ;                            //position 6
        list.add("Imam Ali Raza")         ;                            //position 7
        list.add("Imam Ali Taqi")         ;                            //position 8
        list.add("Imam Ali Naqi")         ;                            //position 9
        list.add("Imam Hasan Al Askari")  ;                            //position 10
        list.add("Imam Muhammad Al Mahdi");                            //position 11
        list.add("Imam Muhammad Al Mahdi");                            //position 12
        list.add("Imam Muhammad Al Mahdi");                            //position 13
        list.add("Imam Muhammad Al Mahdi");                            //position 14
        list.add("Imam Muhammad Al Mahdi");                            //position 15
        list.add("Imam Muhammad Al Mahdi");                            //position 16
        list.add("Imam Muhammad Al Mahdi");                            //position 17
        list.add("Imam Muhammad Al Mahdi");                            //position 18

        adapter = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent intent1 = new Intent(getApplicationContext(),Duas_Activity.class);
                    intent1.putExtra("resId",R.drawable.fatima1);
                    startActivity(intent1);
                }

                if (position == 1){
                    Intent intent1 = new Intent(getApplicationContext(),Duas_Activity.class);
                    intent1.putExtra("resId",R.drawable.fatima1);
                    startActivity(intent1);
                }

                if (position == 2){
                    Intent intent1 = new Intent(getApplicationContext(),Duas_Activity.class);
                    intent1.putExtra("resId",R.drawable.fatima1);
                    startActivity(intent1);
                }

                if (position == 3){
                    Intent intent1 = new Intent(getApplicationContext(),Duas_Activity.class);
                    intent1.putExtra("resId",R.drawable.fatima1);
                    startActivity(intent1);
                }

                if (position == 4){
                    Intent intent1 = new Intent(getApplicationContext(),Duas_Activity.class);
                    intent1.putExtra("resId",R.drawable.fatima1);
                    startActivity(intent1);
                }

                if (position == 5){
                    Intent intent1 = new Intent(getApplicationContext(),Duas_Activity.class);
                    intent1.putExtra("resId",R.drawable.fatima1);
                    startActivity(intent1);
                }

                if (position == 6){
                    Intent intent1 = new Intent(getApplicationContext(),Duas_Activity.class);
                    intent1.putExtra("resId",R.drawable.fatima1);
                    startActivity(intent1);
                }

                if (position == 7){
                    Intent intent1 = new Intent(getApplicationContext(),Duas_Activity.class);
                    intent1.putExtra("resId",R.drawable.fatima1);
                    startActivity(intent1);
                }

                if (position == 8){
                    Intent intent1 = new Intent(getApplicationContext(),Duas_Activity.class);
                    intent1.putExtra("resId",R.drawable.fatima1);
                    startActivity(intent1);
                }

                if (position == 9){
                    Intent intent1 = new Intent(getApplicationContext(),Duas_Activity.class);
                    intent1.putExtra("resId",R.drawable.fatima1);
                    startActivity(intent1);
                }

                if (position == 10){
                    Intent intent1 = new Intent(getApplicationContext(),Duas_Activity.class);
                    intent1.putExtra("resId",R.drawable.fatima1);
                    startActivity(intent1);
                }
                if (position == 11){
                    Intent intent1 = new Intent(getApplicationContext(),Duas_Activity.class);
                    intent1.putExtra("resId",R.drawable.fatima1);
                    startActivity(intent1);
                }

                if (position ==12){
                    Intent intent1 = new Intent(getApplicationContext(),Duas_Activity.class);
                    intent1.putExtra("resId",R.drawable.fatima1);
                    startActivity(intent1);
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
