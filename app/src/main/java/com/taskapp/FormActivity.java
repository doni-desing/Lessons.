package com.taskapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FormActivity extends AppCompatActivity {
    private  EditText editTitile;
    private  EditText editDesc;

    public static String RESULT_KEY = "task";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        editDesc = findViewById(R.id.edit_Deck);
        editTitile = findViewById(R.id.edit_title);

    }

    public void OnSave(View view) {
        Intent intent = new Intent();

        String title = editTitile.getText().toString();
        String deck = editDesc.getText().toString();

        Task task = new Task(title, deck);

        intent.putExtra(RESULT_KEY, task);
        setResult(RESULT_OK, intent);
        finish();
    }
}
