package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Sysmptoms extends AppCompatActivity {

    TextView view;
    TextView view2;
    TextView view3;
    TextView view4;
    TextView view5;
    TextView view6;
    TextView view7;
    TextView view8;
    TextView view9;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sysmptoms);
        view = findViewById(R.id.view);
        view2 = findViewById(R.id.view2);
        //view3 = findViewById(R.id.view3);
        view4 = findViewById(R.id.view4);
        view5 = findViewById(R.id.view5);
        view6 = findViewById(R.id.view6);
        view7 = findViewById(R.id.view7);
        view8 = findViewById(R.id.view8);
        view9 = findViewById(R.id.view9);

        view.setText("These symptoms may appear 2-14 days after exposure (based on the incubation period of MERS-CoV viruses).\n");



        view2.setText("Fever");
        view4.setText("Cough");

        view5.setText("Shortness of breath");

        view6.setText("When to Seek Medical Attention");

        view7.setText("If you develop emergency warning signs for COVID-19 get medical attention immediately. Emergency warning signs include*:\n" +
                "\n" +
                "Trouble breathing\n" +
                "Persistent pain or pressure in the chest\n" +
                "New confusion or inability to arouse\n" +
                "Bluish lips or face\n" +
                "*This list is not all inclusive. Please consult your medical provider for any other symptoms that are severe or concerning.");




        view8.setText("What are the Symptoms of COVID-19?");

        view9.setText("The most common symptoms of COVID-19 are fever, tiredness, and dry cough. Some patients may have aches and pains, nasal congestion, runny nose, sore throat or diarrhea. These symptoms are usually mild and begin gradually. Some people become infected but don’t develop any symptoms and don't feel unwell. Most people (about 80%) recover from the disease without needing special treatment. Around 1 out of every 6 people who gets COVID-19 becomes seriously ill and develops difficulty breathing. Older people, and those with underlying medical problems like high blood pressure, heart problems or diabetes, are more likely to develop serious illness. People with fever, cough and difficulty breathing should seek medical attention.");





    }
}
