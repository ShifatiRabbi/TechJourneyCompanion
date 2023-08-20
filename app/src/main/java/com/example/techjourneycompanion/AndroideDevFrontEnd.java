package com.example.techjourneycompanion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AndroideDevFrontEnd extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_androide_dev_front_end);

        setupBackButton();


        Button frontendJava = findViewById(R.id.fejava);
        Button frontendKotlin = findViewById(R.id.fekotlin);
        Button frontendHybrid = findViewById(R.id.fehybrid);
        Button frontendXML = findViewById(R.id.fexml);
        Button frontendAnko = findViewById(R.id.feanko);
        Button frontendFlutter = findViewById(R.id.feflutter);
        Button frontendJetpack = findViewById(R.id.fejetpack);
        Button frontendNDK = findViewById(R.id.fendk);

        // Set click listeners for the buttons
        frontendJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Android Dev activity
                Intent intent = new Intent(AndroideDevFrontEnd.this, frontendJava.class);
                startActivity(intent);
            }
        });

        frontendKotlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Web Dev activity
                Intent intent = new Intent(AndroideDevFrontEnd.this, frontendKotlin.class);
                startActivity(intent);
            }
        });

        frontendHybrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Web Dev activity
                Intent intent = new Intent(AndroideDevFrontEnd.this, frontendHybrid.class);
                startActivity(intent);
            }
        });

        frontendXML.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Android Dev activity
                Intent intent = new Intent(AndroideDevFrontEnd.this, frontendXML.class);
                startActivity(intent);
            }
        });

        frontendAnko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Web Dev activity
                Intent intent = new Intent(AndroideDevFrontEnd.this, frontendAnko.class);
                startActivity(intent);
            }
        });

        frontendFlutter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Web Dev activity
                Intent intent = new Intent(AndroideDevFrontEnd.this, frontendFlutter.class);
                startActivity(intent);
            }
        });

        frontendJetpack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Android Dev activity
                Intent intent = new Intent(AndroideDevFrontEnd.this, frontendJetpack.class);
                startActivity(intent);
            }
        });

        frontendNDK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Web Dev activity
                Intent intent = new Intent(AndroideDevFrontEnd.this, frontendNDK.class);
                startActivity(intent);
            }
        });



    }
}