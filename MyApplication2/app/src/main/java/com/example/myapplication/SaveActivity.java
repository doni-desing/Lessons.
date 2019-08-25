package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SaveActivity extends AppCompatActivity {
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.activity_save);
        intent.putExtra(intent.EXTRA_TEXT,);
        TextView.setText();
        startActivity(Intent intent);

    }
}
