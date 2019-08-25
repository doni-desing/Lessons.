package com.example.fragment.fragmans;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.fragment.MainActivity;
import com.example.fragment.R;
import com.example.fragment.interfaces.IButtonFragment;


public class ButtonFragment extends Fragment {

    Button button1;
    Button button2;





    public ButtonFragment() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_button, container, false);
        button1 = view.findViewById(R.id.button1);
        button2 = view.findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IButtonFragment listener = (IButtonFragment) getActivity();
                listener.showTextFragment();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IButtonFragment listener = (IButtonFragment) getActivity();
                listener.checkboxFragment();
            }
        });
        return view;
    }

}
