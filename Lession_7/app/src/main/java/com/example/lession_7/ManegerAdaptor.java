package com.example.lession_7;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ManegerAdaptor extends RecyclerView.Adapter<MestoViewHolder> {
    ArrayList<Okroshka> okrofhki;
   OficiantInterface oficiantInterface;

    public ManegerAdaptor(OficiantInterface oficiantInterface){
        okrofhki = new ArrayList<>();
        this.oficiantInterface = oficiantInterface;
    }

    public void derji(Okroshka okroshka){
        okrofhki.add(okroshka);
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public MestoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.view_holder_mesto, parent, false);
        MestoViewHolder mesto = new MestoViewHolder(v);
        mesto.ofician = oficiantInterface;
        return mesto;
    }

    @Override
    public void onBindViewHolder(@NonNull MestoViewHolder holder, int position) {
        Okroshka okroshka = okrofhki.get(position);
        holder.nazvanie.setText(okroshka.imya);
        holder.okroshka = okroshka;
    }

    @Override
    public int getItemCount() {
        return okrofhki.size();
    }
}
