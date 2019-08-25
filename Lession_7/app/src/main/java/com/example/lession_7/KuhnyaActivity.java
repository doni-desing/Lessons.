package com.example.lession_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KuhnyaActivity extends AppCompatActivity {

    EditText vvodImeni;
    Button prigotovit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuhnya);
        vvodImeni = findViewById(R.id.vvod_imeni);
        prigotovit = findViewById(R.id.prigotovit);

        prigotovit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Okroshka okroshka = new Okroshka(vvodImeni.getText().toString());
                Intent kurer = new Intent();
                kurer.putExtra("tainy_okroshka", okroshka);
                finish();
            }
        });
    }
}
