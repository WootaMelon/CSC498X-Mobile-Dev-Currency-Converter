package com.mehdi.assignment1_currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Convertusd(View view) {
        EditText lbp = (EditText) findViewById(R.id.lbp);
        EditText usd = (EditText) findViewById(R.id.usd);
        double rate = 15000;
        //if statement to prevent app crash
        if (!usd.getText().toString().equals("")) {
            double convertedusd = Double.parseDouble(usd.getText().toString()) * rate;
            lbp.setText(Double.toString(convertedusd));
        }
    }

    public void Convertlbp(View view) {
        EditText lbp = (EditText) findViewById(R.id.lbp);
        EditText usd = (EditText) findViewById(R.id.usd);
        double rate = 15000;
        //if statement to prevent app crash
        if (!lbp.getText().toString().equals("")) {
            double convertedlbp = Double.parseDouble(lbp.getText().toString()) / rate;
            usd.setText(Double.toString(convertedlbp));
        }
    }

}