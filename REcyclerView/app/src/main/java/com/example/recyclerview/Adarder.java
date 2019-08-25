package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.Models.Task;

import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Date;

public class Adarder extends RecyclerView.Adapter<MainViewHolder> {

    private ArrayList<Task> data;
    private IOnTaskClick listener;

    public Adarder(IOnTaskClick listener){
        this.listener = listener;
        data = new ArrayList<>();
        data.add(new Task("Do something","Description 1",
                new Date(),
                new Date(),
                true,
                "GeekTech"));


        data.add(new Task("Do something","Description 2",
                new Date(),
                new Date(),
                false,
                "GeekTech 2"));


        data.add(new Task("Do something","Description 3",
                new Date(),
                new Date(),
                false,
                "GeekTech 3"));


        data.add(new Task("Do something","This description 4",
                new Date(),
                new Date(),
                true,
                "GeekTech 4"));



    }


    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.viewholder_main, parent,false);
        return  new MainViewHolder(view);
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