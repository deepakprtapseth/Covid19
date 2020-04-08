package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Precaution extends AppCompatActivity {

    TextView view;
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_precaution);
        view = findViewById(R.id.view);
        view2 = findViewById(R.id.view2);
        //view3 = findViewById(R.id.view3);
        view4 = findViewById(R.id.view4);
        view5 = findViewById(R.id.view5);
        view6 = findViewById(R.id.view6);
        view7 = findViewById(R.id.view7);
        view8 = findViewById(R.id.view8);
        view9 = findViewById(R.id.view9);
        view10 = findViewById(R.id.view10);
        view11 = findViewById(R.id.view11);
        view12 = findViewById(R.id.view12);
        view13 = findViewById(R.id.view13);
        view14 = findViewById(R.id.view14);
        view15 = findViewById(R.id.view15);
        view16 = findViewById(R.id.view16);
        view17 = findViewById(R.id.view17);
        view.setText("Stay aware of the latest information on the COVID-19 outbreak, available on the WHO website and through your national and local public health authority. Most people who become infected experience mild illness and recover, but it can be more severe for others. Take care of your health and protect others by doing the following:\n" +
                "\n");
        view2.setText("Wash your hands frequently");
        view4.setText("Regularly and thoroughly clean your hands with an alcohol-based hand rub or wash them with soap and water.\n" +
                "\n" +
                "Why? Washing your hands with soap and water or using alcohol-based hand rub kills viruses that may be on your hands.");

         view5.setText("Maintain social distancing");
         view6.setText("Maintain at least 1 metre (3 feet) distance between yourself and anyone who is coughing or sneezing.\n" +
                 "\n" +
                 "Why? When someone coughs or sneezes they spray small liquid droplets from their nose or mouth which may contain virus. If you are too close, you can breathe in the droplets, including the COVID-19 virus if the person coughing has the disease.");

         view7.setText("Avoid touching eyes, nose and mouth");
         view8.setText("Why? Hands touch many surfaces and can pick up viruses. Once contaminated, hands can transfer the virus to your eyes, nose or mouth. From there, the virus can enter your body and can make you sick.");

         view9.setText("Practice respiratory hygiene");
         view10.setText("Make sure you, and the people around you, follow good respiratory hygiene. This means covering your mouth and nose with your bent elbow or tissue when you cough or sneeze. Then dispose of the used tissue immediately.\n" +
                 "\n" +
                 "Why? Droplets spread virus. By following good respiratory hygiene you protect the people around you from viruses such as cold, flu and COVID-19.");

         view11.setText("If you have fever, cough and difficulty breathing, seek medical care early");
         view12.setText("Stay home if you feel unwell. If you have a fever, cough and difficulty breathing, seek medical attention and call in advance. Follow the directions of your local health authority.\n" +
                 "\n" +
                 "Why? National and local authorities will have the most up to date information on the situation in your area. Calling in advance will allow your health care provider to quickly direct you to the right health facility. This will also protect you and help prevent spread of viruses and other infections.");

         view13.setText("Stay informed and follow advice given by your healthcare provider");
         view14.setText("Stay informed on the latest developments about COVID-19. Follow advice given by your healthcare provider, your national and local public health authority or your employer on how to protect yourself and others from COVID-19.\n" +
                 "\n" +
                 "Why? National and local authorities will have the most up to date information on whether COVID-19 is spreading in your area. They are best placed to advise on what people in your area should be doing to protect themselves.");

          view15.setText("# Protection measures for persons who are in or have recently visited (past 14 days) areas where COVID-19 is spreading");
          view16.setText("1.)Follow the guidance outlined above.\n" +
                  "\n" +
                  "\n" +
                  "2.)Stay at home if you begin to feel unwell, even with mild symptoms such as headache and slight runny nose, until you recover. Why? Avoiding contact with others and visits to medical facilities will allow these facilities to operate more effectively and help protect you and others from possible COVID-19 and other viruses.\n" +
                  "\n" +
                  "\n" +
                  "3.)If you develop fever, cough and difficulty breathing, seek medical advice promptly as this may be due to a respiratory infection or other serious condition. Call in advance and tell your provider of any recent travel or contact with travelers. Why? Calling in advance will allow your health care provider to quickly direct you to the right health facility. This will also help to prevent possible spread of COVID-19 and other viruses.");
          view17.setText("Be Ready for coronavirus");

    }
}
