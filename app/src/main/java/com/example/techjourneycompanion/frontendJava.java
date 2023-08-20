package com.example.techjourneycompanion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class frontendJava extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frontend_java);

        setupBackButton();
    }
}