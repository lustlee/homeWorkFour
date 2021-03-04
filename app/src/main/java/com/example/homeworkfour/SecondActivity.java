package com.example.homeworkfour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        img = findViewById(R.id.img_btn2);

        img.setOnClickListener(v -> {
            Intent intentBack = new Intent(SecondActivity.this, MainActivity.class);
            startActivity(intentBack);
            finish();
        });

    }
}