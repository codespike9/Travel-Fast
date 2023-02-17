package com.example.mobus1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class JoData extends AppCompatActivity {

    private Button startB;
    EditText editText1,editText2,editText3;
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jo_data);

        editText1=findViewById(R.id.fromeF);
        editText2=findViewById(R.id.ToF);
        editText3=findViewById(R.id.editTextTextPersonName);


        startB = findViewById(R.id.start);
        startB.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String value1 = editText1.getText().toString().trim();
                String value2 = editText2.getText().toString().trim();
                String value3 = editText3.getText().toString().trim();

                Intent intent=new Intent(JoData.this, journey.class);
                intent.putExtra("value1name",value1);
                intent.putExtra("value2name",value2);
                intent.putExtra("value3name",value3);
                startActivity(intent);
            }
        });
    }
}
