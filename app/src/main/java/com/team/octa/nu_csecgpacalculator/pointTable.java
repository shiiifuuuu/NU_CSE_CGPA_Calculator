package com.team.octa.nu_csecgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pointTable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_point_table);
    }

    public void aPlusClicked(View v){
        Intent intent = new Intent();
        intent.putExtra("point", 4.00);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void aClicked(View view) {
        Intent intent = new Intent();
        intent.putExtra("point", 3.75);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void aMinusClicked(View view) {
        Intent intent = new Intent();
        intent.putExtra("point", 3.50);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void bPlusClicked(View view) {
        Intent intent = new Intent();
        intent.putExtra("point", 3.25);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void bClicked(View view) {
        Intent intent = new Intent();
        intent.putExtra("point", 3.00);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void bMinusClicked(View view) {
        Intent intent = new Intent();
        intent.putExtra("point", 2.75);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void cPlusClicked(View view) {
        Intent intent = new Intent();
        intent.putExtra("point", 2.50);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void cClicked(View view) {
        Intent intent = new Intent();
        intent.putExtra("point", 2.25);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void dClicked(View view) {
        Intent intent = new Intent();
        intent.putExtra("point", 2.00);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void fClicked(View view) {
        Intent intent = new Intent();
        intent.putExtra("point", 0.00);
        setResult(RESULT_OK, intent);
        finish();
    }
}
