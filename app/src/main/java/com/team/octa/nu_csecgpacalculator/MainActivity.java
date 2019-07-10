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

    public void semester1Clicked(View v){
        Intent semester1 = new Intent(MainActivity.this,semester1.class);
        startActivity(semester1);
    }


    public void semester2Clicked(View view) {
        Intent semester2 = new Intent(this, semester2.class);
        startActivity(semester2);
    }
}
