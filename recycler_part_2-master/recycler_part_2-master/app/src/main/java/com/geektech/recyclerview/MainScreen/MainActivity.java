package com.geektech.recyclerview.MainScreen;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.geektech.recyclerview.AddTask.AddTaskActivity;
import com.geektech.recyclerview.InfoScreen.InfoActivity;
import com.geektech.recyclerview.Interfaces.IOnTaskClick;
import com.geektech.recyclerview.Models.Task;
import com.geektech.recyclerview.R;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements IOnTaskClick {

    RecyclerView recyclerView;
    MainAdapter adapter;
    Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

        addButton = findViewById(R.id.add_btn);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddTaskActivity.class);
                startActivityForResult(intent, 2);
            }
        });

        adapter = new MainAdapter(this);
        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
    }

    @Override
    public void openTask(Task task) {
        Intent intent = new Intent(this, InfoActivity.class);
        intent.putExtra(InfoActivity.TASK_KEY, task);
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 2) {
            if (resultCode == RESULT_OK) {
                Task task = (Task) data.getSerializableExtra("key");
                adapter.put(task);
            }
        }
    }
}
