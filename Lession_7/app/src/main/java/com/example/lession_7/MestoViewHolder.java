package com.example.lession_7;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MestoViewHolder extends RecyclerView.ViewHolder {
    OficiantInterface ofician;
    TextView nazvanie;
    Okroshka okroshka;

    public MestoViewHolder(@NonNull View itemView) {
        super(itemView);
        nazvanie = itemView.findViewById(R.id.nazvanie);


        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}