package com.example.remember;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {

    private ArrayList<String> data;
    public MainAdapter() {
        for (int i = 0; i < 1000; i++) {
            data.add("Element" + i);
        }
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    return MainViewHolder;


    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
