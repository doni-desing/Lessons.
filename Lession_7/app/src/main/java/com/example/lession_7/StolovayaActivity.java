package com.example.lession_7;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StolovayaActivity extends AppCompatActivity implements OficiantInterface {

    ManegerAdaptor maneger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stolovaya);
        RecyclerView vitrina  = findViewById(R.id.vitrina);

        maneger = new ManegerAdaptor(this);
        vitrina.setAdapter(maneger);

        RecyclerView.LayoutManager vneshniyVid = new LinearLayoutManager(this);
        vitrina.setLayoutManager(vneshniyVid);
    }

    public void prigotovitSvejuyuOkroshku(View v){
        Intent kurer = new Intent(StolovayaActivity.this, KuhnyaActivity.class);
        startActivityForResult(kurer, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1){
            if(resultCode == RESULT_OK) {
                Okroshka okroshka = (Okroshka) data.getSerializableExtra("tainy_okroshka");
                maneger.derji(okroshka);
            }
        }
    }

    @Override
    public void otdat(Okroshka okroshka) {
        Intent kurier = new Intent(StolovayaActivity.this, StolActivity.class);
        kurier.putExtra("na_stol", okroshka);
        startActivity(kurier);
    }
}
