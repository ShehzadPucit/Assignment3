package com.example.drawerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        String a = getIntent().getStringExtra("result");
        TextView t = findViewById(R.id.textView3);
        t.setText(a);
        int b= Integer.parseInt(a);
        int c=10-b;
        String d=String.valueOf(c);
        TextView t1=findViewById(R.id.textView5);
        t1.setText(d);
    }

    public void home(View view) {
        Intent intent = new Intent(this, quiz.class);
        startActivity(intent);
    }
}