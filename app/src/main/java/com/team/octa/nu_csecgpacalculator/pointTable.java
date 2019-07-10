package com.team.octa.nu_csecgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;

public class pointTable extends AppCompatActivity {

    private Vibrator vibrator;
    private int millisecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_point_table);
        init();
    }

    public void init(){
        vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        millisecond = 10;
    }

    public void aPlusClicked(View v){
        vibrator.vibrate(millisecond);
        Intent intent = new Intent();
        intent.putExtra("point", 4.00);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void aClicked(View view) {
        vibrator.vibrate(millisecond);
        Intent intent = new Intent();
        intent.putExtra("point", 3.75);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void aMinusClicked(View view) {
        vibrator.vibrate(millisecond);
        Intent intent = new Intent();
        intent.putExtra("point", 3.50);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void bPlusClicked(View view) {
        vibrator.vibrate(millisecond);
        Intent intent = new Intent();
        intent.putExtra("point", 3.25);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void bClicked(View view) {
        vibrator.vibrate(millisecond);
        Intent intent = new Intent();
        intent.putExtra("point", 3.00);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void bMinusClicked(View view) {
        vibrator.vibrate(millisecond);
        Intent intent = new Intent();
        intent.putExtra("point", 2.75);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void cPlusClicked(View view) {
        vibrator.vibrate(millisecond);
        Intent intent = new Intent();
        intent.putExtra("point", 2.50);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void cClicked(View view) {
        vibrator.vibrate(millisecond);
        Intent intent = new Intent();
        intent.putExtra("point", 2.25);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void dClicked(View view) {
        vibrator.vibrate(millisecond);
        Intent intent = new Intent();
        intent.putExtra("point", 2.00);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void fClicked(View view) {
        vibrator.vibrate(millisecond);
        Intent intent = new Intent();
        intent.putExtra("point", 0.00);
        setResult(RESULT_OK, intent);
        finish();
    }
}
