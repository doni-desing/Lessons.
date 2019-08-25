package com.geektech.recyclerview.MainScreen;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.recyclerview.Interfaces.IOnTaskClick;
import com.geektech.recyclerview.Models.Task;
import com.geektech.recyclerview.R;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class MainViewHolder extends RecyclerView.ViewHolder {

    private TextView tvTitle;
    private CheckBox cbStatus;
    private TextView tvEndDate;

    private IOnTaskClick listener;
    private Task task;

    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        tvTitle = itemView.findViewById(R.id.vh_task_title);
        cbStatus = itemView.findViewById(R.id.vh_task_status);
        tvEndDate = itemView.findViewById(R.id.vh_task_end);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.openTask(task);
            }
        });
    }

    public void onBind(Task task, IOnTaskClick listener) {
        this.listener = listener;
        this.task = task;
        tvTitle.setText(task.title);
        cbStatus.setChecked(task.status);
        tvEndDate.setText(task.endDate());



    }
}
