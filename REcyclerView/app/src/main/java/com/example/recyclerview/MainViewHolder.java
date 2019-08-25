package com.example.recyclerview;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.Interfaces.OnTaskClick;
import com.example.recyclerview.Models.Task;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class MainViewHolder extends RecyclerView.ViewHolder {
    private TextView textView;
    private CheckBox cbStatus;
    private TextView tvEndDate;

    private OnTaskClick Listener;
    private Task task;
    
    
   private TextView tvTitle;

    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        tvTitle = itemView.findViewById(R.id.vh_task_title);
        cbStatus = itemView.findViewById(R.id.vh_task_status);
        tvEndDate = itemView.findViewById(R.id.vh_task_end);


    }
    
    public void onBind(Task task, IOnTaskClick Listener) {
        this.Listener = Listener;
    

    }

    public void onBind(String s) {
    }
}
