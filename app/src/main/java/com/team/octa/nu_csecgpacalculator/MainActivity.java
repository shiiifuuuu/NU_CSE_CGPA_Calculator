package com.team.octa.nu_csecgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void semester1Clicked(View view){
        Intent semester1 = new Intent(MainActivity.this,semester1.class);
        startActivity(semester1);
    }


    public void semester2Clicked(View view) {
        Intent semester2 = new Intent(MainActivity.this, semester2.class);
        startActivity(semester2);
    }

    public void semester3Clicked(View view) {
        Intent semester3 = new Intent(MainActivity.this, semester3.class);
        startActivity(semester3);
    }

    public void semester4Clicked(View view) {
        Intent semester4 = new Intent(MainActivity.this, semester4.class);
        startActivity(semester4);
    }

    public void semester5Clicked(View view) {
        Intent semester5 = new Intent(MainActivity.this, semester5.class);
        startActivity(semester5);
    }

    public void semester6Clicked(View view) {
        Intent semester6 = new Intent(MainActivity.this, semester6.class);
        startActivity(semester6);
    }

    public void semester7Clicked(View view) {
        Intent semester7 = new Intent(MainActivity.this, semester7.class);
        startActivity(semester7);
    }

    public void semester8CLicked(View view) {
        Intent semester8 = new Intent(MainActivity.this, semester8.class);
        startActivity(semester8);
    }
}
