package com.example.mobus1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class journey extends AppCompatActivity {
    private Button startC;
    TextView  textView,textView1,textView2,textView3;
    int temp;
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.journey_start);

        textView=findViewById(R.id.textView3);
        textView1=findViewById(R.id.textView4);
        textView2=findViewById(R.id.textView8);
        textView3=findViewById(R.id.textView10);
        String value1=getIntent().getStringExtra("value1name");
        String value2=getIntent().getStringExtra("value2name");
        String value3=getIntent().getStringExtra("value3name");
        textView1.setText(value3);
        if(value1.equals("Silicon Hills") && value2.equals("Damana square"))
        {
            textView.setText("4Km");
            temp=Integer.parseInt(value3)*5;
            textView2.setText(String.valueOf(temp));
        }
        else if(value1.equals("Silicon Hills") && value2.equals("Trident"))
        {
            textView.setText("2Km");
            temp=Integer.parseInt(value3)*5;
            textView2.setText(String.valueOf(temp));
        }
        else if(value1.equals("Silicon Hills") && value2.equals("Acharya vihar"))
        {
            textView.setText("8Km");
            temp=Integer.parseInt(value3)*10;
            textView2.setText(String.valueOf(temp));
        }
        textView3.setText(String.valueOf(100-temp));
        startC = findViewById(R.id.button2);
        startC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(journey.this, pay.class));

            }
        });
    }

}
