package com.example.lesson_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;

    @Override
    public <T extends View> T findViewById(int id) {
        return super.findViewById(id);
    }

    // сегодня жизнь Activity урок
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ololo",  "onCreated");
        editText = findViewById(R.id.edit_text);

        if(savedInstanceState != null) {
            String text = savedInstanceState.getString("key");
            Log.d("ololo", text);
        }

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ololo", "onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ololo", "onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ololo",  "onReuse");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ololo",  "onResarst");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ololo",  "onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ololo",  "onDestroy");

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState );
        Log.d("ololo",  "onSaveInstanceState");
        String text = editText.getText().toString();
        outState.putString("key", text);
    }
}
