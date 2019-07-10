package com.team.octa.nu_csecgpacalculator;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.TextView;

import java.text.DecimalFormat;

public class semester1 extends AppCompatActivity {

    private TextView txtComputerSystemPoint, txtProgrammingLangPoint, txtLabCPoint, txtPhysicsPoint, txtCalculusPoint, txtEnglishPoint, txtCalculateSemester1;
    private double computerSystemPoint, programmingLangPoint, labCPoint, physicsPoint, calculusPoint, englishPoint;
    private Vibrator vibrator;
    private int millisecond;

    private final static int computerSystemRequestCode=1;
    private final static int programmingLangRequestCode=2;
    private final static int labCRequestCode=3;
    private final static int physicsRequestCode=4;
    private final static int calculusRequestCode=5;
    private final static int englishRequestCode=6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester1);
        init();
    }

    //INITIALIZING
    public void init(){
        txtComputerSystemPoint = findViewById(R.id.txtComputerSystemPoint);
        txtProgrammingLangPoint = findViewById(R.id.txtProgrammingLangPoint);
        txtLabCPoint = findViewById(R.id.txtLabCPoint);
        txtPhysicsPoint = findViewById(R.id.txtPhysicsPoint);
        txtCalculusPoint = findViewById(R.id.txtCalculusPoint);
        txtEnglishPoint = findViewById(R.id.txtEnglishPoint);
        txtCalculateSemester1 = findViewById(R.id.txtResultShow);

        //initializing vibrator service
        vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        millisecond = 10;
    }


    //BUTTONS STARTED FROM HERE
    public void computerSystemClicked(View v){
        vibrator.vibrate(millisecond);
        Intent pointTable = new Intent(semester1.this, pointTable.class);
        startActivityForResult(pointTable, computerSystemRequestCode);
    }

    public void programmingLangClicked(View v){
        vibrator.vibrate(millisecond);
        Intent pointTable = new Intent(semester1.this, pointTable.class);
        startActivityForResult(pointTable, programmingLangRequestCode);
    }

    public void labCClicked(View v){
        vibrator.vibrate(millisecond);
        Intent pointTable = new Intent(semester1.this, pointTable.class);
        startActivityForResult(pointTable, labCRequestCode);
    }

    public void physicsClicked(View v){
        vibrator.vibrate(millisecond);
        Intent pointTable = new Intent(semester1.this, pointTable.class);
        startActivityForResult(pointTable, physicsRequestCode);
    }

    public void calculusClicked(View v){
        vibrator.vibrate(millisecond);
        Intent pointTable = new Intent(semester1.this, pointTable.class);
        startActivityForResult(pointTable, calculusRequestCode);
    }

    public void englishClicked(View v){
        vibrator.vibrate(millisecond);
        Intent pointTable = new Intent(semester1.this, pointTable.class);
        startActivityForResult(pointTable, englishRequestCode);
    }

    public void calculateTotal(View view) {
        vibrator.vibrate(millisecond);
        double total = (computerSystemPoint + programmingLangPoint + labCPoint + physicsPoint + calculusPoint + englishPoint) / 16.5;
        String string = new DecimalFormat("##.###").format(total);
        txtCalculateSemester1.setText(string);
    }

    //GETTING THE RESULT BACK FROM POINT TABLE ACTIVITY
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(resultCode == RESULT_OK){
            if(requestCode == computerSystemRequestCode){
                double value = data.getExtras().getDouble("point");
                computerSystemPoint = value * 3.0;
                String string = String.valueOf(value);
                txtComputerSystemPoint.setText(string);
            }

            else if(requestCode == programmingLangRequestCode){
                double value = data.getExtras().getDouble("point");
                programmingLangPoint = value * 3.0;
                String string = String.valueOf(value);
                txtProgrammingLangPoint.setText(string);
            }

            else if(requestCode == labCRequestCode){
                double value = data.getExtras().getDouble("point");
                labCPoint = value * 1.5;
                String string = String.valueOf(value);
                txtLabCPoint.setText(string);
            }

            else if(requestCode == physicsRequestCode){
                double value = data.getExtras().getDouble("point");
                physicsPoint = value * 3.0;
                String string = String.valueOf(value);
                txtPhysicsPoint.setText(string);
            }

            else if(requestCode == calculusRequestCode){
                double value = data.getExtras().getDouble("point");
                calculusPoint = value * 3.0;
                String string = String.valueOf(value);
                txtCalculusPoint.setText(string);
            }

            else if(requestCode == englishRequestCode){
                double value = data.getExtras().getDouble("point");
                englishPoint = value * 3.0;
                String string = String.valueOf(value);
                txtEnglishPoint.setText(string);
            }
        }
    }

}
