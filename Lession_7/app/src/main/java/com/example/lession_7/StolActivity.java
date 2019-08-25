package com.example.lession_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class StolActivity extends AppCompatActivity {
    TextView nazvanieOkroshki;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stol);
        nazvanieOkroshki = findViewById(R.id.nazvanir_okroshki);
        Intent kurier = getIntent();
        Okroshka okroshka = (Okroshka) kurier.getSerializableExtra("na_stol");

    }
}
