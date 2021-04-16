package com.example.app12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class habitrec extends AppCompatActivity {

    RecyclerView habitrec;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_habitrec);
        
        habitrec = findViewById(R.id.habitrec);
    }
}