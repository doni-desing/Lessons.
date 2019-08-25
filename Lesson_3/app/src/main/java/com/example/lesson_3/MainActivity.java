package com.example.lesson_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button obvIntent;
    Button obvNotIntent;
    TextView textView;
    Button intentForResult = findViewById(R.id.intent_for_result);
    TextView

    @Override
    public <T extends View> T findViewById(int id) {
        return super.findViewById(id);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        obvIntent = findViewById(R.id.obv_intent);
        obvNotIntent = findViewById(R.id.not_obv_intent);

        obvIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ObvActivity.class);
            startActivity(intent)
            }
        });
        obvNotIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra(Intent.EXTRA_TEXT);
                intent.setAction(Intent.ACTION_SEND);
                intent.setType("text/plain");


            }
        });
        intentForResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this);
                startActivityForResult(intent, 202);

            }
        });
        }

    @Override
    public void onActivityReenter(int resultCode, Intent data) {
        super.onActivityReenter(resultCode, data);
        if(resultCode == 202) {
            if(resultCode == RESULT_OK) {
                String text = data.getStringExtra("key");
            }
        }
    }
}

