package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextClock;
import android.widget.TextView;

public class thirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        District district = (District) bundle.getSerializable("district");

        TextView text = findViewById(R.id.textView3);
        text.setText(district.getCountryName());
    }
}