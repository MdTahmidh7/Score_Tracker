package com.example.scoretracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView aboutDeveloper,developerName,developerDept,developerIns;
    ImageView developerImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        aboutDeveloper = findViewById(R.id.textView_AboutDeveloper);
        developerName = findViewById(R.id.textViewDeveloperName);
        developerDept = findViewById(R.id.textViewDeveloperDept);
        developerIns = findViewById(R.id.textViewDeveloperIns);
        developerImage = findViewById(R.id.imageViewDeveloper);
    }
}
