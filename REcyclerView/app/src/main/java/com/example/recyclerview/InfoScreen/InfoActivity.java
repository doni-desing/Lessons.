package com.example.recyclerview.InfoScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.recyclerview.Models.Task;
import com.example.recyclerview.R;

public class InfoActivity extends AppCompatActivity {
    static public final String TASK_KEY = "task_key";
    TextView tvtitle = null;
    TextView tvdesc;
    TextView owner;
    TextView start_date;
    TextView end_date;
    CheckBox cbStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        initViews();
       Task task  = getTaskFromIntent();
       showTask(task);
    }
    private Task getTaskFromIntent(){
        Intent intent = getIntent();
        Task task =(Task) intent.getSerializableExtra(TASK_KEY);
        return task;
    }

    private void initViews(){
        tvdesc = findViewById(R.id.info_desc_val);
        owner = findViewById(R.id.info_owner_val);
        start_date = findViewById(R.id.info_start_date);
        end_date = findViewById(R.id.info_end_date);
        cbStatus = findViewById(R.id.info_status_val);

    }
    private void showTask(Task task) {
        tvtitle.setText(task.title);
        tvdesc.setText(task.descrition);
        start_date.setText(task.startDate());
        end_date.setText(task.endDate());
        cbStatus.setText(task.status);
    }
}
