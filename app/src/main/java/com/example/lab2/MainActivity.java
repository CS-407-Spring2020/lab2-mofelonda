package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void nameButtonClick(View view) {
        EditText nameField = findViewById(R.id.nameField);
        String str = nameField.getText().toString();

//      Toast.makeText(MainActivity.this, nameField.getText().toString(), Toast.LENGTH_LONG).show();

        goToActivity2(str);
    }

    public void goToActivity2(String s) {
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
