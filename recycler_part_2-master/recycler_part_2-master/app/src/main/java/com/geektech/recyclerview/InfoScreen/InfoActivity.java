package com.geektech.recyclerview.InfoScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

import com.geektech.recyclerview.Models.Task;
import com.geektech.recyclerview.R;


public class InfoActivity extends AppCompatActivity {

    static public final String TASK_KEY = "task_key";

    TextView tvTitle;
    TextView tvDescription;
    TextView tvOwner;
    TextView tvStartDate;
    TextView tvEndDate;
    CheckBox cbStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        initViews();
        Task task = getTaskFromIntent();
        showTask(task);
    }

    private Task getTaskFromIntent() {
        Intent intent = getIntent();
        Task task = (Task) intent.getSerializableExtra(TASK_KEY);
        return task;
    }

    private void initViews() {
        tvTitle = findViewById(R.id.info_title_val);
        tvDescription = findViewById(R.id.info_desc_val);
        tvOwner = findViewById(R.id.info_owner_val);
        tvStartDate = findViewById(R.id.info_start_date);
        tvEndDate = findViewById(R.id.info_end_date);
        cbStatus = findViewById(R.id.info_status_val);
    }

    private void showTask(Task task) {
        tvTitle.setText(task.title);
        tvDescription.setText(task.description);
        tvOwner.setText(task.owner);
        tvStartDate.setText(task.startDate());
        tvEndDate.setText(task.endDate());
        cbStatus.setChecked(task.status);
    }
}
