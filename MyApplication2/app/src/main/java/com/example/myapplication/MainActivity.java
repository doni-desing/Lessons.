package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText name;
    EditText fname;
    EditText sname;
    Button save;
    Button shave;
     Object View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        fname = findViewById(R.id.fname);
        sname = findViewById(R.id.sname);
        save = findViewById(R.id.save);
        shave = findViewById(R.id.shave);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                name.getText().toString();
                getIntent().putExtra(Intent.EXTRA_TEXT,"Geektach");
            }
        });
    }
}

