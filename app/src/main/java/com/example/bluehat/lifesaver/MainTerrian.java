package com.example.bluehat.lifesaver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.bluehat.lifesaver.terrainfragments.geocharacterfrag;
import com.example.bluehat.lifesaver.terrainfragments.riverbedfrag;
import com.example.bluehat.lifesaver.terrainfragments.soilfrag;

public class MainTerrian extends AppCompatActivity {
    ImageView geoCharac,soil,river;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_terrain);

        geoCharac = (ImageView) findViewById(R.id.geoCharac);

        soil = (ImageView) findViewById(R.id.soil);
        river = (ImageView) findViewById(R.id.river);

        geoCharac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
                ft.addToBackStack(null);
                ft.add(R.id.splash, new geocharacterfrag());
                ft.commit();


            }
        });

        soil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
                ft.addToBackStack(null);
                ft.add(R.id.splash, new soilfrag());
                ft.commit();


            }
        });
        river.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
                ft.addToBackStack(null);
                ft.add(R.id.splash, new riverbedfrag());
                ft.commit();

            }
        });

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(MainTerrian.this, MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();
    }

}
