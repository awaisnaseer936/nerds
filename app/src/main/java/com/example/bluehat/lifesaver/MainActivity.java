package com.example.bluehat.lifesaver;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView terrian, flood, rain, density, areas, logo;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView aboutUS=(TextView)findViewById(R.id.aboutUs);
        terrian = (ImageView)findViewById(R.id.terrain);
        logo = (ImageView)findViewById(R.id.logo);
        flood = (ImageView)findViewById(R.id.flood);
        rain = (ImageView)findViewById(R.id.forecast);
        density = (ImageView)findViewById(R.id.density);
        areas= (ImageView)findViewById(R.id.areas);
        action();

        terrian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainTerrian.class);
                startActivity(intent);
                finish();
            }
        });
        flood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), MainFlood.class);
                    finish();
                    startActivity(intent);


            }
        });
        rain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), WeatherActivity.class);
                    startActivity(intent);
                    finish();
            }


        });
        density.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), MainDensity.class);
                    startActivity(intent);
                    finish();

            }

        });

        areas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new  Intent(getApplicationContext(),MainPrecaution.class);
                finish();
                startActivity(intent);

            }
        });

        aboutUS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AboutUs.class);
                startActivity(intent);
                finish();
            }
        });


    }
    public void action() {


        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.up);//for appointment
        final Animation animation1 = AnimationUtils.loadAnimation(this,  R.anim.up1);//for medication
        final Animation animation2 = AnimationUtils.loadAnimation(this,  R.anim.up2);//for cycle
        final Animation animation3 = AnimationUtils.loadAnimation(this,  R.anim.up3);
        final Animation animation4 = AnimationUtils.loadAnimation(this,  R.anim.up4);
        final Animation animation5 = AnimationUtils.loadAnimation(this,  R.anim.up5);
        final Animation animation6 = AnimationUtils.loadAnimation(this,  R.anim.up6);
        android.os.Handler handler1 = new android.os.Handler();
        android.os.Handler handler2 = new android.os.Handler();
        android.os.Handler handler3 = new android.os.Handler();
        android.os.Handler handler4 = new android.os.Handler();
        android.os.Handler handler5 = new android.os.Handler();
        android.os.Handler handler6 = new android.os.Handler();
        android.os.Handler handler7 = new android.os.Handler();
        handler1.postDelayed(new Runnable() {
            @Override
            public void run() {
                terrian.setVisibility(View.VISIBLE);
                terrian.startAnimation(animation1);
                //  terrian.setVisibility((View.INVISIBLE));
            }
        }, 150);
        handler2.postDelayed(new Runnable() {
            @Override
            public void run() {
                flood.setVisibility(View.VISIBLE);
                flood.startAnimation(animation);
            }
        }, 375);

        handler3.postDelayed(new Runnable() {
            @Override
            public void run() {
//                delivery.setVisibility(View.VISIBLE);
//                delivery.startAnimation(animation6);
            }
        }, 525);
        handler4.postDelayed(new Runnable() {
            @Override
            public void run() {
                rain.setVisibility(View.VISIBLE);
                rain.startAnimation(animation2);
            }
        }, 675);
        handler5.postDelayed(new Runnable() {
            @Override
            public void run() {
//                catering.setVisibility(View.VISIBLE);
//                catering.startAnimation(animation3);
            }
        }, 825);
        handler6.postDelayed(new Runnable() {
            @Override
            public void run() {
                density.setVisibility(View.VISIBLE);
                density.startAnimation(animation4);
            }
        }, 975);
        handler7.postDelayed(new Runnable() {
            @Override
            public void run() {
                areas.setVisibility(View.VISIBLE);
                areas.startAnimation(animation5);
            }
        },1125);

    }

    private void createAndShowAlertDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Are you sure you want to exit?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                finish();
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                //TODO
                dialog.dismiss();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    @Override
    public void onBackPressed() {
        createAndShowAlertDialog();
    }


}
