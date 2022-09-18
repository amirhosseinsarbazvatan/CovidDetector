package com.example.coviddetectionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread splashTime = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(2000);
                }catch (Exception e){

                }finally {
                    Intent firstPage = new Intent(MainActivity.this, MainPageActivity.class);
                    startActivity(firstPage);
                }
            }
        };
        splashTime.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}