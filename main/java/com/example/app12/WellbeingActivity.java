package com.TeamBee.WellbeingTracker.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.TeamBee.WellbeingTracker.R;
import com.TeamBee.WellbeingTracker.adapters.gridAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class WellbeingActivity extends AppCompatActivity {
    //ui components
    TextView happyText, sadText, sickText, angryText;
    ImageButton smile, sad, sick, angry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wellbeing);

        //init ui components
        smile = findViewById(R.id.imageButton5);
        sad = findViewById(R.id.imageButton6);
        sick = findViewById(R.id.imageButton15);
        angry = findViewById(R.id.imageButton16);

        happyText = findViewById(R.id.textView6);
        sadText = findViewById(R.id.textView7);
        sickText = findViewById(R.id.textView16);
        angryText = findViewById(R.id.textView17);

        happyText.setText(R.string.happy);
        sadText.setText(R.string.sad);
        sickText.setText(R.string.sick);
        angryText.setText(R.string.angry);

        smile.setOnClickListener(v -> {
            Toast.makeText(getApplicationContext(),"Have a great day!!", Toast.LENGTH_LONG).show();
        });

        sad.setOnClickListener(v -> {
            Toast.makeText(getApplicationContext(),"What is going on?", Toast.LENGTH_LONG).show();
        });

        sick.setOnClickListener(v -> {
            Toast.makeText(getApplicationContext(),"We hope you get well soon!!", Toast.LENGTH_LONG).show();
        });

        angry.setOnClickListener(v -> {
            Toast.makeText(getApplicationContext(),"Whats wrong?", Toast.LENGTH_LONG).show();
        });


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);

        //setting Wellbeing as selected
        bottomNavigationView.setSelectedItemId(R.id.Wellbeing);

        //Item Selected Listener
        bottomNavigationView.setOnNavigationItemSelectedListener( new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                //Switch statement that creates intent for each activity when the button is selected
                switch (item.getItemId()){
                    case R.id.Calendar:
                        startActivity(new Intent(getApplicationContext(),
                                CalendarActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.Home:
                        startActivity(new Intent(getApplicationContext(),
                                MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.Wellbeing:
                        return true;
                    case R.id.Tracker:
                        startActivity(new Intent(getApplicationContext(),
                                HabitActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.Help:
                        startActivity(new Intent(getApplicationContext(),
                                HelpActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                }
                return false;
            }
        });

    }

}