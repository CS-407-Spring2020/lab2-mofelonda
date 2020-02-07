package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView textFromMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        textFromMain = findViewById(R.id.textFromMain);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        textFromMain.setText("Your name is " + str + ". You just typed it in.");
    }
}
