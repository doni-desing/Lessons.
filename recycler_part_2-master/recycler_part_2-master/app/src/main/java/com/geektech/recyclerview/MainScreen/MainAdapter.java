package com.geektech.recyclerview.MainScreen;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.recyclerview.Interfaces.IOnTaskClick;
import com.geektech.recyclerview.Models.Task;
import com.geektech.recyclerview.R;

import java.util.ArrayList;
import java.util.Date;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {

    private ArrayList<Task> data;
    private IOnTaskClick listener;

    public MainAdapter(IOnTaskClick listener) {
        this.listener = listener;
        data = new ArrayList<>();


        data.add(new Task("Do something",
                "This is description",
                new Date(),
                new Date(),
                true,
                "GeekTech"));

        data.add(new Task("Do something 2",
                "This is description",
                new Date(),
                new Date(),
                false,
                "GeekTech"));

        data.add(new Task("Do something 3",
                "This is description",
                new Date(),
                new Date(),
                false,
                "GeekTech"));

        data.add(new Task("Do something 4",
                "This is description",
                new Date(),
                new Date(),
                true,
                "GeekTech"));
    }

    public void put(Task task) {
        data.add(task);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.viewholder_main, parent, false);
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
