package com.example.lesson_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean isFText = false;
    String fText;
    String sText;


    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button.setOnClicListener(new View.OnClickListener()) {
            @Override
                    public void onClicListener(new View.OnClickListener()){
                if(fText == null) {
                    fText = editText.getText().toString();
                } else if(sText == null) {
                    fText = editText.getText().toString();


                }
            }
        }
    }
}
