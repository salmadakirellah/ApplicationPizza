package com.ensa.pizzaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    ImageView image;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread splashThread = new Thread() {
            @Override
            public void run(){
                try{
                sleep(2000);
                Intent intent = new Intent(SplashActivity.this, ListPizzaActivityy.class);
                startActivity(intent);
                finish();


            }
        catch(
            InterruptedException e)

            {
                e.printStackTrace();
            }
        }
    }

    ;
    splashThread.start();
}




    }

