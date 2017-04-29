package com.example.bluehat.lifesaver;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.bluehat.lifesaver.floodfragments.guidesfrag;
import com.example.bluehat.lifesaver.floodfragments.statfrag;
import com.example.bluehat.lifesaver.floodfragments.warfrag;

public class MainFlood extends AppCompatActivity{
ImageView war,stat,guides;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flood);
        final ImageView imageView=(ImageView)findViewById(R.id.map);
        final int []imageArray={R.drawable.l_one,R.drawable.l_two};

        war=(ImageView)findViewById(R.id.warnings);
        stat=(ImageView)findViewById(R.id.stat);
        guides=(ImageView)findViewById(R.id.guide);
        war=(ImageView)findViewById(R.id.warnings);

        stat=(ImageView)findViewById(R.id.stat);
        guides=(ImageView)findViewById(R.id.guide);

        stat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
                ft.addToBackStack(null);
                ft.add(R.id.splash, new statfrag());
                ft.commit();


            }
        });
        guides.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
                ft.addToBackStack(null);
                ft.add(R.id.splash, new guidesfrag());
                ft.commit();

            }
        });
        war.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
                ft.addToBackStack(null);
                ft.add(R.id.splash, new warfrag());
                ft.commit();


            }
        });

    final Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        int i=0;
        public void run() {
            imageView.setImageResource(imageArray[i]);
            i++;
            if(i>imageArray.length-1)
            {
                i=0;
            }
            handler.postDelayed(this, 1500);  //for interval...
        }
    };
        handler.postDelayed(runnable, 0); //for initial delay..
}
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(MainFlood.this, MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();
    }

}
