package com.example.mobus1;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class journey extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show();
        setContentView(R.layout.journey_start);
    }
}
