package com.example.techjourneycompanion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AndroidDev extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_dev);

        setupBackButton();


        Button frontendButton = findViewById(R.id.adfe);
        Button backendButton = findViewById(R.id.adbe);
        Button databaseButton = findViewById(R.id.addi);

        // Set click listeners for the buttons
        frontendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Android Dev activity
                Intent intent = new Intent(AndroidDev.this, AndroideDevFrontEnd.class);
                startActivity(intent);
            }
        });

        backendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Web Dev activity
                Intent intent = new Intent(AndroidDev.this, AndroideDevBackEnd.class);
                startActivity(intent);
            }
        });

        databaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Web Dev activity
                Intent intent = new Intent(AndroidDev.this, AndroideDevDatabase.class);
                startActivity(intent);
            }
        });

    }
}