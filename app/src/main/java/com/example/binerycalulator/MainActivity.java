package com.example.binerycalulator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import static java.sql.Types.NULL;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    TextView t1,t2;
    float num;
    int a;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)  findViewById(R.id.button);
        b2=(Button)  findViewById(R.id.button1);
        b3=(Button)  findViewById(R.id.button2);
        b4=(Button)  findViewById(R.id.button3);
        b5=(Button)  findViewById(R.id.button4);
        b6=(Button)  findViewById(R.id.button5);
        b7=(Button)  findViewById(R.id.button6);
        b8=(Button)  findViewById(R.id.button7);
        b9=(Button)  findViewById(R.id.button8);
        b10=(Button)  findViewById(R.id.button9);
        b11=(Button)  findViewById(R.id.button10);
        b12=(Button) findViewById(R.id.button11);

        t1=(TextView) findViewById(R.id.textView2);
        t2=(TextView) findViewById(R.id.textView);


        b1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"9");
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"0");
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
               t2.setText(" ");
               t1.setText(" ");

            }
        });

        b12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (t1 == null) {
                    t2.setText(null);
                }
                else {
                    String s=" ";
                    String s1=" ";
                    t2.setText(" ");
                    num = Float.parseFloat(t1.getText()+" ");
                //  t1.setText(null);
                    a = (int) num;
                    int i = 0;
                    while (a > 0) {
                        int b = a % 2;
                        if (b == 0)
                            s = s.substring(0, i)
                                    + "0";
                        else
                            s = s.substring(0, i)
                                    + "1";
                        a = a / 2;
                        i++;
                    }

                    for (int j = s.length() - 1; j >= 0; j--)
                        s1 = s1 + s.charAt(j);

                    t2.setText(t2.getText()+s1);
                }
            }

        });
    }
}
