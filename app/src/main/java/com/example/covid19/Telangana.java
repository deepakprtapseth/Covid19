package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Telangana extends AppCompatActivity {

    TextView t1,t2,t3;
    Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telangana);
        t1=findViewById(R.id.t1);
        b1=findViewById(R.id.b1);
        t2=findViewById(R.id.t2);
        b2=findViewById(R.id.b2);

        t3=findViewById(R.id.t3);
        b3=findViewById(R.id.b3);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String location = t1.getText().toString();
                location = location.replace(" ", "+");

                Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=" + location));
                startActivity(i);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String location = t2.getText().toString();
                location = location.replace(" ", "+");

                Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=" + location));
                startActivity(i);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String location = t3.getText().toString();
                location = location.replace(" ", "+");

                Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=" + location));
                startActivity(i);

            }
        });



    }
}
