package com.geektech.recyclerview.AddTask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.geektech.recyclerview.Models.Task;
import com.geektech.recyclerview.R;

import java.util.Date;

public class AddTaskActivity extends AppCompatActivity {

    Button saveBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);
        saveBtn = findViewById(R.id.save_btn);
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Task task = new Task("Do something 4",
                        "This is description",
                        new Date(),
                        new Date(),
                        true,
                        "GeekTech");

                Intent intent = new Intent();
                intent.putExtra("key", task);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
