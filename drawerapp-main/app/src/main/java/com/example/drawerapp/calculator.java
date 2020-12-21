package com.example.drawerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class calculator extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6,
            button7, btn8, btn9, Addition, Subtraction, Division,
            Multiply, btn10,
            btnClear, buttonEqual;
    EditText Textdisplay;


    boolean Add, sub, Mult, Div;


    float firstvalue, secondvalue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        btn0 = (Button) findViewById(R.id.button0);
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);
        btn9 = (Button) findViewById(R.id.button9);
        btn10 = (Button) findViewById(R.id.button10);
        Addition = (Button) findViewById(R.id.buttonadd);
        Subtraction = (Button) findViewById(R.id.buttonsub);
        Multiply = (Button) findViewById(R.id.buttonmul);
        Division = (Button) findViewById(R.id.buttondiv);
        btnClear = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        Textdisplay = (EditText) findViewById(R.id.edt1);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Textdisplay.setText(Textdisplay.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Textdisplay.setText(Textdisplay.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Textdisplay.setText(Textdisplay.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Textdisplay.setText(Textdisplay.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Textdisplay.setText(Textdisplay.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Textdisplay.setText(Textdisplay.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Textdisplay.setText(Textdisplay.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Textdisplay.setText(Textdisplay.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Textdisplay.setText(Textdisplay.getText() + "9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Textdisplay.setText(Textdisplay.getText() + "0");
            }
        });


        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Textdisplay.setText("");
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Textdisplay.setText(Textdisplay.getText() + ".");
            }
        });

        Addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Textdisplay == null) {
                    Textdisplay.setText("");
                }
                else {
                    firstvalue = Float.parseFloat(Textdisplay.getText() + "");
                    Add = true;
                    Textdisplay.setText(null);                }
            }
        });

        Subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstvalue = Float.parseFloat(Textdisplay.getText() + "");
                sub = true;
                Textdisplay.setText(null);
            }
        });

        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstvalue = Float.parseFloat(Textdisplay.getText() + "");
                Mult = true;
                Textdisplay.setText(null);
            }
        });

        Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstvalue = Float.parseFloat(Textdisplay.getText() + "");
                Div = true;
                Textdisplay.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondvalue = Float.parseFloat(Textdisplay.getText() + "");

                if (Add == true) {
                    Textdisplay.setText(firstvalue + secondvalue + "");
                    Add = false;
                }

                if (sub == true) {
                    Textdisplay.setText(firstvalue - secondvalue + "");
                    sub = false;
                }

                if (Mult == true) {
                    Textdisplay.setText(firstvalue * secondvalue + "");
                    Mult = false;
                }

                if (Div == true) {
                    Textdisplay.setText(firstvalue / secondvalue + "");
                    Div = false;
                }
            }
        });

    }
}