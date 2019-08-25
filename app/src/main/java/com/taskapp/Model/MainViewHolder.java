package com.taskapp.Model;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.taskapp.Interface.IOnTaskClick;
import com.taskapp.R;
import com.taskapp.Task;

public class MainViewHolder extends RecyclerView.ViewHolder {
    Task task;
    TextView title;
    TextView desc;
    private IOnTaskClick listener;


    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.textViewTitle);
        desc = itemView.findViewById(R.id.textViewDesc);

    }



    public void onBind(Task task, IOnTaskClick listener) {

        title.setText(task.getTitle());
        desc.setText(task.getDeck());


    }
}

