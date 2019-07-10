package com.team.octa.nu_csecgpacalculator;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class semester2 extends AppCompatActivity {

    private TextView txtDataStructurePoint, txtLabDSPoint, txtElectricPoint, txtLabEEPoint, txtCalculusPoint, txtStatisticsPoint, txtDiscretePoint, txtResult;
    private double dataStructurePoint, labDSPoint, electricPoint, labEEPoint, calculusPoint, statisticsPoint, discretePoint;

    private static final int requestCodeDataStructure = 1;
    private static final int requestCodeLabDS = 2;
    private static final int requestCodeElectric = 3;
    private static final int requestCodeLabEE = 4;
    private static final int requestCodeCalculus = 5;
    private static final int requestCodeStatistics = 6;
    private static final int requestCodeDiscrete = 7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester2);

        init();
    }

    public void init(){
        txtDataStructurePoint = findViewById(R.id.txtDataStructurePoint);
        txtLabDSPoint = findViewById(R.id.txtLabDSPoint);
        txtElectricPoint = findViewById(R.id.txtElectricPoint);
        txtLabEEPoint = findViewById(R.id.txtLabEEPoint);
        txtCalculusPoint = findViewById(R.id.txtCalculusPoint);
        txtStatisticsPoint = findViewById(R.id.txtStatisticsPoint);
        txtDiscretePoint = findViewById(R.id.txtDiscretePoint);
        txtResult = findViewById(R.id.txtResultShow);
    }

    //Method for going to P O I N T   T A B L E intent
    public void pointTableIntent (int requestCode){
        Intent pointTable = new Intent(semester2.this, pointTable.class);
        startActivityForResult(pointTable, requestCode);
    }

    // B U T T O N S
    public void dataStructureClicked(View view) {
        pointTableIntent(requestCodeDataStructure);
    }

    public void labDSClicked(View view) {
        pointTableIntent(requestCodeLabDS);
    }

    public void electricClicked(View view) {
        pointTableIntent(requestCodeElectric);
    }

    public void labEEClicked(View view) {
        pointTableIntent(requestCodeLabEE);
    }

    public void calculusClicked(View view) {
        pointTableIntent(requestCodeCalculus);
    }

    public void statisticsClicked(View view) {
        pointTableIntent(requestCodeStatistics);
    }

    public void discreteClicked(View view) {
        pointTableIntent(requestCodeDiscrete);
    }

    //CALCULATING CGPA
    public void calculateTotal(View view) {
        double value = (dataStructurePoint + labDSPoint + electricPoint + labEEPoint + calculusPoint + statisticsPoint + discretePoint)/18.0;
        String string = new DecimalFormat("##.###").format(value);
        txtResult.setText(string);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        if(resultCode == RESULT_OK){
            if(requestCode == requestCodeDataStructure){
                double value = data.getExtras().getDouble("point");
                dataStructurePoint = value * 3.00; //multiplying the received value with creditPoint
                String string = String.valueOf(value);
                txtDataStructurePoint.setText(string);
            }
            else if(requestCode == requestCodeLabDS){
                double value = data.getExtras().getDouble("point");
                labDSPoint = value * 1.5;
                String string = String.valueOf(value);
                txtLabDSPoint.setText(string);
            }
            else if(requestCode == requestCodeElectric){
                double value = data.getExtras().getDouble("point");
                electricPoint = value * 3.0;
                String string = String.valueOf(value);
                txtElectricPoint.setText(string);
            }
            else if(requestCode == requestCodeLabEE){
                double value = data.getExtras().getDouble("point");
                labEEPoint = value * 1.5;
                String string = String.valueOf(value);
                txtLabEEPoint.setText(string);
            }
            else if(requestCode == requestCodeCalculus){
                double value = data.getExtras().getDouble("point");
                calculusPoint = value * 3.0;
                String string = String.valueOf(value);
                txtCalculusPoint.setText(string);
            }
            else if(requestCode == requestCodeStatistics){
                double value = data.getExtras().getDouble("point");
                statisticsPoint = value * 3.0;
                String string = String.valueOf(value);
                txtStatisticsPoint.setText(string);
            }
            else if(requestCode == requestCodeDiscrete){
                double value = data.getExtras().getDouble("point");
                discretePoint = value * 3.0;
                String string = String.valueOf(value);
                txtDiscretePoint.setText(string);
            }
        }
    }
}
