package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Help extends AppCompatActivity {
    TextView view1;

    TextView view2;
    TextView view3;
    TextView view4;
    TextView view5;
    TextView view6;
    TextView view7;
    TextView view8;
    TextView view9;
    TextView view10;
    TextView view11;
    TextView view12;
    TextView view13;
    TextView view14;
    TextView view15;
    TextView view16;
    TextView view17;
    TextView view18;
    TextView view19;
    TextView view20;
    TextView view21;
    TextView view22;
    TextView view23;
    TextView view24;
    TextView view25;
    TextView view26;
    TextView view27;
    TextView view28;
    TextView view29;
    TextView view30;
    TextView view31;
    TextView view32;
    TextView view33;
    TextView view34;
    TextView view35;
    TextView view36,view37;
    ImageButton dtn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18;
    ImageButton btn19,btn20,btn21,btn22,btn23,btn24,btn25,btn26,btn27,btn28,btn29,btn30,btn31,btn32,btn33,btn34;
    ImageButton btn35,btn36,btn37;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        view1=findViewById(R.id.view1);

        view2=findViewById(R.id.view2);

        view3=findViewById(R.id.view3);
        view4=findViewById(R.id.view4);
        view5=findViewById(R.id.view5);
        view6=findViewById(R.id.view6);
        view7=findViewById(R.id.view7);
        view8=findViewById(R.id.view8);
        view9=findViewById(R.id.view9);
        view10=findViewById(R.id.view10);
        view11=findViewById(R.id.view11);
        view12=findViewById(R.id.view12);
        view13=findViewById(R.id.view13);
        view14=findViewById(R.id.view14);
        view15=findViewById(R.id.view15);
        view16=findViewById(R.id.view16);
        view17=findViewById(R.id.view17);
        view18=findViewById(R.id.view18);
        view19=findViewById(R.id.view19);
        view20=findViewById(R.id.view20);
        view21=findViewById(R.id.view21);
        view22=findViewById(R.id.view22);
        view23=findViewById(R.id.view23);
        view24=findViewById(R.id.view24);
        view25=findViewById(R.id.view25);
        view26=findViewById(R.id.view26);
        view27=findViewById(R.id.view27);
        view28=findViewById(R.id.view28);
        view29=findViewById(R.id.view29);
        view30=findViewById(R.id.view30);
        view31=findViewById(R.id.view31);
        view32=findViewById(R.id.view32);
        view33=findViewById(R.id.view33);
        view34=findViewById(R.id.view34);
        view35=findViewById(R.id.view35);
        view36=findViewById(R.id.view36);
        view37=findViewById(R.id.view37);


        dtn1=findViewById(R.id.dtn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btn10=findViewById(R.id.btn10);
        btn11=findViewById(R.id.btn11);
        btn12=findViewById(R.id.btn12);
        btn13=findViewById(R.id.btn13);
        btn14=findViewById(R.id.btn14);
        btn15=findViewById(R.id.btn15);
        btn16=findViewById(R.id.btn16);
        btn17=findViewById(R.id.btn17);
        btn18=findViewById(R.id.btn18);
        btn19=findViewById(R.id.btn19);
        btn20=findViewById(R.id.btn20);
        btn21=findViewById(R.id.btn21);
        btn22=findViewById(R.id.btn22);
        btn23=findViewById(R.id.btn23);
        btn24=findViewById(R.id.btn24);
        btn25=findViewById(R.id.btn25);
        btn26=findViewById(R.id.btn26);
        btn27=findViewById(R.id.btn27);
        btn28=findViewById(R.id.btn28);
        btn29=findViewById(R.id.btn29);

        btn30=findViewById(R.id.btn30);
        btn31=findViewById(R.id.btn31);
        btn32=findViewById(R.id.btn32);
        btn33=findViewById(R.id.btn33);
        btn34=findViewById(R.id.btn34);
        btn35=findViewById(R.id.btn35);
        btn36=findViewById(R.id.btn36);
        btn37=findViewById(R.id.btn37);



        dtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b1=view1.getText().toString().trim();
                Intent intentcall = new Intent();
                intentcall.setAction(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:" + b1));
                startActivity(intentcall);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b1=view2.getText().toString().trim();
                Intent intentcall = new Intent();
                intentcall.setAction(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:" + b1));
                startActivity(intentcall);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b1=view3.getText().toString().trim();
                Intent intentcall = new Intent();
                intentcall.setAction(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:" + b1));
                startActivity(intentcall);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b1=view4.getText().toString().trim();
                Intent intentcall = new Intent();
                intentcall.setAction(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:" + b1));
                startActivity(intentcall);

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b1=view5.getText().toString().trim();
                Intent intentcall = new Intent();
                intentcall.setAction(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:" + b1));
                startActivity(intentcall);

            }
        });  btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b1=view6.getText().toString().trim();
                Intent intentcall = new Intent();
                intentcall.setAction(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:" + b1));
                startActivity(intentcall);

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b1=view7.getText().toString().trim();
                Intent intentcall = new Intent();
                intentcall.setAction(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:" + b1));
                startActivity(intentcall);

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b1=view8.getText().toString().trim();
                Intent intentcall = new Intent();
                intentcall.setAction(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:" + b1));
                startActivity(intentcall);

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b1=view9.getText().toString().trim();
                Intent intentcall = new Intent();
                intentcall.setAction(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:" + b1));
                startActivity(intentcall);

            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b1=view10.getText().toString().trim();
                Intent intentcall = new Intent();
                intentcall.setAction(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:" + b1));

                startActivity(intentcall);

            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b1=view11.getText().toString().trim();
                Intent intentcall = new Intent();
                intentcall.setAction(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:" + b1));
                startActivity(intentcall);

            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b1=view12.getText().toString().trim();
                Intent intentcall = new Intent();
                intentcall.setAction(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:" + b1));
                startActivity(intentcall);

            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b1=view13.getText().toString().trim();
                Intent intentcall = new Intent();
                intentcall.setAction(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:" + b1));
                startActivity(intentcall);

            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b1=view14.getText().toString().trim();
                Intent intentcall = new Intent();
                intentcall.setAction(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:" + b1));
                startActivity(intentcall);

            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b1=view15.getText().toString().trim();
                Intent intentcall = new Intent();
                intentcall.setAction(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:" + b1));
                startActivity(intentcall);

            }
        });
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b1=view16.getText().toString().trim();
                Intent intentcall = new Intent();
                intentcall.setAction(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:" + b1));
                startActivity(intentcall);

            }
        });
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b1=view17.getText().toString().trim();
                Intent intentcall = new Intent();
                intentcall.setAction(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:" + b1));
                startActivity(intentcall);

            }
        });
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b1=view18.getText().toString().trim();
                Intent intentcall = new Intent();
                intentcall.setAction(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:" + b1));
                startActivity(intentcall);

            }
        });
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b1=view19.getText().toString().trim();
                Intent intentcall = new Intent();
                intentcall.setAction(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:" + b1));
                startActivity(intentcall);

            }
        });
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b1=view20.getText().toString().trim();
                Intent intentcall = new Intent();
                intentcall.setAction(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:" + b1));
                startActivity(intentcall);

            }
        });
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b1=view21.getText().toString().trim();
                Intent intentcall = new Intent();
                intentcall.setAction(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:" + b1));
                startActivity(intentcall);

            }
        });
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b1=view22.getText().toString().trim();
                Intent intentcall = new Intent();
                intentcall.setAction(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:" + b1));
                startActivity(intentcall);

            }
        });
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b1=view23.getText().toString().trim();
                Intent intentcall = new Intent();
                intentcall.setAction(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:" + b1));
                startActivity(intentcall);

            }
        });
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b1=view24.getText().toString().trim();
                Intent intentcall = new Intent();
                intentcall.setAction(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:" + b1));
                startActivity(intentcall);

            }
        });
        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b1=view25.getText().toString().trim();
                Intent intentcall = new Intent();
                intentcall.setAction(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:" + b1));
                startActivity(intentcall);

            }
        });
        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b1=view26.getText().toString().trim();
                Intent intentcall = new Intent();
                intentcall.setAction(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:" + b1));
                startActivity(intentcall);

            }
        });
        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b1=view27.getText().toString().trim();
                Intent intentcall = new Intent();
                intentcall.setAction(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:" + b1));
                startActivity(intentcall);

            }
        });
        btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b1=view28.getText().toString().trim();
                Intent intentcall = new Intent();
                intentcall.setAction(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:" + b1));
                startActivity(intentcall);

            }
        });
        btn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b1=view29.getText().toString().trim();
                Intent intentcall = new Intent();
                intentcall.setAction(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:" + b1));
                startActivity(intentcall);

            }
        });

        btn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b1=view30.getText().toString().trim();
                Intent intentcall = new Intent();
                intentcall.setAction(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:" + b1));
                startActivity(intentcall);

            }
        });
        btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b1=view31.getText().toString().trim();
                Intent intentcall = new Intent();
                intentcall.setAction(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:" + b1));
                startActivity(intentcall);

            }
        });
        btn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b1=view32.getText().toString().trim();
                Intent intentcall = new Intent();
                intentcall.setAction(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:" + b1));
                startActivity(intentcall);

            }
        });
        btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b1=view33.getText().toString().trim();
                Intent intentcall = new Intent();
                intentcall.setAction(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:" + b1));
                startActivity(intentcall);

            }
        });
        btn34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b1=view34.getText().toString().trim();
                Intent intentcall = new Intent();
                intentcall.setAction(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:" + b1));
                startActivity(intentcall);

            }
        });
        btn35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b1=view35.getText().toString().trim();
                Intent intentcall = new Intent();
                intentcall.setAction(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:" + b1));
                startActivity(intentcall);

            }
        });

        btn36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b1=view36.getText().toString().trim();
                Intent intentcall = new Intent();
                intentcall.setAction(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:" + b1));
                startActivity(intentcall);

            }
        });
        btn37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b1=view37.getText().toString().trim();
                Intent intentcall = new Intent();
                intentcall.setAction(Intent.ACTION_DIAL);
                intentcall.setData(Uri.parse("tel:" + b1));
                startActivity(intentcall);

            }
        });



    }
}
