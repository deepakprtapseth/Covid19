package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity implements View.OnClickListener {

    CardView precation;
    CardView symptoms;
    CardView help;
    CardView test;
    CardView checker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        precation = findViewById(R.id.precaution);
        symptoms = findViewById(R.id.symptoms);
        help = findViewById(R.id.help);
        test=findViewById(R.id.update);
        checker=findViewById(R.id.checker);


        precation.setOnClickListener(this);
        symptoms.setOnClickListener(this);
        help.setOnClickListener(this);
        test.setOnClickListener(this);
        checker.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        Intent i;

        switch (view.getId()) {
            case R.id.precaution:
                i = new Intent(this, Precaution.class);
                startActivity(i);
                break;

            case R.id.symptoms:
             i = new Intent(this,Sysmptoms.class);
             startActivity(i);
             break;

            case R.id.help:
                i=new Intent(this,Help.class);
                startActivity(i);
                break;

            case R.id.update:
                i=new Intent(this,TestCenter.class);
                startActivity(i);
                break;

            case R.id.checker:
                i=new Intent(this,SyptomsChecker.class);
                startActivity(i);
                break;
        }
    }
}