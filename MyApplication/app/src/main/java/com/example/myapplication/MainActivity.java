package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button saveIntent ;
    Button shareIntent;
    EditText editFirstName;
    EditText editSecondNAme;
    EditText editThirdText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saveIntent = findViewById(R.id.button);
        shareIntent = findViewById(R.id.button2);
        editFirstName = findViewById(R.id.edit_text);
        editSecondNAme = findViewById(R.id.edit_text2);
        editThirdText = findViewById(R.id.edit_text3);

        saveIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstName = editFirstName.getText().toString();
                String secondName = editSecondNAme.getText().toString();
                String thirdName = editThirdText.getText().toString();
            }
        });

        saveIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editFirstName.setText("");
                editSecondNAme.setText("");
                editThirdText.setText("");
            }
        });

        shareIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();

                intent.putExtra(Intent.EXTRA_TEXT,"Geektach");
                intent.setAction(Intent.ACTION_SEND);
                intent.setType("text/plain");

                if (intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }

            }
        });

    }
}