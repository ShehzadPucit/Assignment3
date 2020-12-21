package com.example.drawerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity2 extends AppCompatActivity {

    int marks;
    String[] data;
    int j;

    public int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        data = getResources().getStringArray(R.array.mcq);
        marks = 0;
        j = 5;
        show(0);


        final TextView counttime=findViewById(R.id.counttime);
        new CountDownTimer(50000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                counttime.setText(String.valueOf(counter));
                counter++;
            }
            @Override
            public void onFinish() {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("result",Integer.toString(marks));
                startActivity(intent);
            }
        }.start();
    }


    public void show(int i) {
        TextView textView = findViewById(R.id.textView2);
        textView.setText(data[i]);
        RadioButton b1 = findViewById(R.id.radioButton);
        b1.setText(data[i + 1]);
        RadioButton b2 = findViewById(R.id.radioButton2);
        b2.setText(data[i + 2]);
        RadioButton b3 = findViewById(R.id.radioButton3);
        b3.setText(data[i + 3]);
        RadioButton b4 = findViewById(R.id.radioButton4);
        b4.setText(data[i + 4]);
    }

    public void mcq2(View view) {
        if (j == 59) {
            Intent intent = new Intent(this, MainActivity3.class);
            intent.putExtra("result",Integer.toString(marks));
            startActivity(intent);
        }
        else {
            RadioButton[] opt = new RadioButton[4];
            opt[0] = findViewById(R.id.radioButton);
            opt[1] = findViewById(R.id.radioButton2);
            opt[2] = findViewById(R.id.radioButton3);
            opt[3] = findViewById(R.id.radioButton4);
            for (int i = 0; i < 4; i++)
                if (opt[i].isChecked()) {
                    if (opt[i].getText().equals(data[j]))
                        marks++;
                    RadioGroup rdGrp = (RadioGroup) findViewById(R.id.radioGroup);
                    rdGrp.clearCheck();
                }
            j = j + 6;
            show(j - 5);
        }
    }

    }
