package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.fragment.fragmans.CheckBoxFragment;
import com.example.fragment.fragmans.TextFragment;
import com.example.fragment.interfaces.IButtonFragment;

public class MainActivity extends FragmentActivity implements IButtonFragment {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showTextFragment(){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container, new TextFragment());
        transaction.commit();
    }

    @Override
    public void checkboxFragment() {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container, new CheckBoxFragment());
        transaction.commit();

    }

    public  void showCheckBoxFragment(){

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
