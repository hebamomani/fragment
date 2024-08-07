package com.example.fragments;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
    Button btn_x,btn_y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btn_x=findViewById(R.id.main_btn_x);
        btn_y=findViewById(R.id.main_btn_y);

        btn_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                XFragment fragment=new XFragment();
                ft.replace(R.id.fragment_container,fragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        btn_y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                YFragment fragment=new YFragment();
                ft.replace(R.id.fragment_container,fragment);
                ft.addToBackStack(null);
                ft.commit();

            }
        });

    }
}