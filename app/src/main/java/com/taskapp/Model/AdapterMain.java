package com.taskapp.Model;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.taskapp.Interface.IOnTaskClick;
import com.taskapp.R;
import com.taskapp.Task;

import java.util.ArrayList;

public class AdapterMain extends RecyclerView.Adapter<MainViewHolder> {

    public ArrayList<Task> data;
    IOnTaskClick listener;

    public AdapterMain() {
        data = new ArrayList<>();

    }
    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.viewholder_mail, parent, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.onBind(data.get(position), listener);
    }

    @Override
    public int getItemCount() {

        return data.size();
    }
}
