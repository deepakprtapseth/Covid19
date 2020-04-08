package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TestCenter extends AppCompatActivity implements View.OnClickListener {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19;
    Button btn20,btn21,btn22,btn23,btn24,btn25,btn26,btn27,btn28,btn29,btn30,btn31,btn32,btn33,btn34,btn35,btn36,btn37;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_center);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        btn10 = findViewById(R.id.button10);
        btn11 = findViewById(R.id.button11);
        btn12 = findViewById(R.id.button12);
        btn13 = findViewById(R.id.button13);
        btn14 = findViewById(R.id.button14);
        btn15 = findViewById(R.id.button15);
        btn16 = findViewById(R.id.button16);
        btn17 = findViewById(R.id.button17);btn35 = findViewById(R.id.button35);
        btn18 = findViewById(R.id.button18);btn36 = findViewById(R.id.button36);
        btn19 = findViewById(R.id.button19);
        btn20 = findViewById(R.id.button20);
        btn21 = findViewById(R.id.button21);
        btn22 = findViewById(R.id.button22);btn37 = findViewById(R.id.button37);
        btn23 = findViewById(R.id.button23);
        btn24 = findViewById(R.id.button24);//btn38 = findViewById(R.id.button1);
        btn25 = findViewById(R.id.button25);
        btn26 = findViewById(R.id.button26);
        btn27 = findViewById(R.id.button27);
        btn28 = findViewById(R.id.button28);
        btn29 = findViewById(R.id.button29);
        btn30 = findViewById(R.id.button30);
        btn31 = findViewById(R.id.button31);
        btn32 = findViewById(R.id.button32);
        btn33 = findViewById(R.id.button33);
        btn34 = findViewById(R.id.button34);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btn13.setOnClickListener(this);
        btn14.setOnClickListener(this);
        btn15.setOnClickListener(this);
        btn16.setOnClickListener(this);
        btn17.setOnClickListener(this);
        btn18.setOnClickListener(this);
        btn19.setOnClickListener(this);
        btn20.setOnClickListener(this);
        btn21.setOnClickListener(this);
        btn22.setOnClickListener(this);
        btn23.setOnClickListener(this);

        btn24.setOnClickListener(this);

        btn25.setOnClickListener(this);
        btn26.setOnClickListener(this);
        btn27.setOnClickListener(this);
        btn28.setOnClickListener(this);
        btn29.setOnClickListener(this);
        btn30.setOnClickListener(this);
        btn31.setOnClickListener(this);
        btn32.setOnClickListener(this);
        btn33.setOnClickListener(this);
        btn34.setOnClickListener(this);
        btn35.setOnClickListener(this);
        btn36.setOnClickListener(this);
        btn37.setOnClickListener(this);
        //btn38.setOnClickListener(this);




    }


    public void center(View view)
    {

    }

    @Override
    public void onClick(View view) {

        Intent i;

        switch (view.getId()) {
            case R.id.button1:
                i = new Intent(this, Andhra.class);
                startActivity(i);
                break;

            case R.id.button2:
                i = new Intent(this, Arunachal.class);
                startActivity(i);
                break;


           case R.id.button3:
                i = new Intent(this, Assam.class);
                startActivity(i);
                break;
            case R.id.button4:
                i = new Intent(this, Bihar.class);
                startActivity(i);
                break;
            case R.id.button5:
                i = new Intent(this, Chhattisgarh.class);
                startActivity(i);
                break;
          /*  case R.id.button6:
                i = new Intent(this, Andhra.class);
                startActivity(i);
                break;

            */
          case R.id.button7:
                i = new Intent(this, Gujarat.class);
                startActivity(i);
                break;
            case R.id.button8:
                i = new Intent(this, Haryana.class);
                startActivity(i);
                break;
            case R.id.button9:
                i = new Intent(this, Himachal.class);
                startActivity(i);
                break;
            case R.id.button10:
                i = new Intent(this, Jharkhand.class);
                startActivity(i);
                break;
            case R.id.button11:
                i = new Intent(this, Karnataka.class);
                startActivity(i);
                break;
            case R.id.button12:
                i = new Intent(this, Kerala.class);
                startActivity(i);
                break;
            case R.id.button13:
                i = new Intent(this, Madhya.class);
                startActivity(i);
                break;
            case R.id.button14:
                i = new Intent(this, Maharashtra.class);
                startActivity(i);
                break;
            case R.id.button15:
                i = new Intent(this, Manipur.class);
                startActivity(i);
                break;
            case R.id.button16:
                i = new Intent(this, Meghalaya.class);
                startActivity(i);
                break;
            case R.id.button17:
                i = new Intent(this, Mizoram.class);
                startActivity(i);
                break;



           case R.id.button18:
                i = new Intent(this, NagaLand.class);
                startActivity(i);
                break;


           case R.id.button19:
                i = new Intent(this, Odisha.class);
                startActivity(i);
                break;
            case R.id.button20:
                i = new Intent(this, Punjab.class);
                startActivity(i);
                break;
            case R.id.button21:
                i = new Intent(this, Rajasthan.class);
                startActivity(i);
                break;
                /*
            case R.id.button22:
                i = new Intent(this, Andhra.class);
                startActivity(i);
                break;
                */
            case R.id.button23:
                i = new Intent(this, Tamil.class);
                startActivity(i);
                break;
            case R.id.button24:
                i = new Intent(this, Telangana.class);
                startActivity(i);
                break;
            case R.id.button25:
                i = new Intent(this, Tripura.class);
                startActivity(i);
                break;
            case R.id.button26:
                i = new Intent(this, Uttarakhand.class);
                startActivity(i);
                break;
            case R.id.button27:
                i = new Intent(this, UP.class);
                startActivity(i);
                break;
            case R.id.button28:
                i = new Intent(this, WestBengal.class);
                startActivity(i);
                break;
            case R.id.button29:
                i = new Intent(this, Andaman.class);
                startActivity(i);
                break;
            case R.id.button30:
                i = new Intent(this, Chandigarh.class);
                startActivity(i);
                break;

            case R.id.button31:
                i = new Intent(this, Dadra.class);
                startActivity(i);
                break;


            case R.id.button32:
              i = new Intent(this, Daman.class);
            startActivity(i);
            break;

            case R.id.button33:
                i = new Intent(this, Delhi.class);
                startActivity(i);
                break;
            case R.id.button34:
                i = new Intent(this, Jammu.class);
                startActivity(i);
                break;

            case R.id.button35:
                i = new Intent(this, Ladakha.class);
                startActivity(i);
                break;

            case R.id.button36:
                i = new Intent(this, Lakshadweep.class);
                startActivity(i);
                break;


                case R.id.button37:
                i = new Intent(this, Puducherry.class);
                startActivity(i);
                break;

        }

    }
}
