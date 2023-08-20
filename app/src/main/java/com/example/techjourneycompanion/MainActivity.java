package com.example.techjourneycompanion;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public class MainActivity extends AppCompatActivity {

    Button logout;
    GoogleSignInClient gClient;
    GoogleSignInOptions gOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logout = findViewById(R.id.logout);

        gOptions = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        gClient = GoogleSignIn.getClient(this, gOptions);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gClient.signOut().addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        finish();
                        startActivity(new Intent(MainActivity.this, Login.class));
                    }
                });
            }
        });

        // Find the buttons by their IDs
        Button androidDevButton = findViewById(R.id.aadev);
        Button webDevButton = findViewById(R.id.wddev);
        Button softwareDevButton = findViewById(R.id.sedev);
        Button roboticsDevButton = findViewById(R.id.rbdev);
        Button bioinfoDevButton = findViewById(R.id.bidev);
        Button backButton = findViewById(R.id.backButton);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed(); // Call the built-in back navigation method
            }
        });
        // Add more buttons as needed

        // Set click listeners for the buttons
        androidDevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Android Dev activity
                Intent intent = new Intent(MainActivity.this, AndroidDev.class);
                startActivity(intent);
            }
        });

        webDevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Web Dev activity
                Intent intent = new Intent(MainActivity.this, WebDev.class);
                startActivity(intent);
            }
        });

        softwareDevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Android Dev activity
                Intent intent = new Intent(MainActivity.this, SoftwareDev.class);
                startActivity(intent);
            }
        });

        roboticsDevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Web Dev activity
                Intent intent = new Intent(MainActivity.this, RoboticsDev.class);
                startActivity(intent);
            }
        });

        bioinfoDevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Web Dev activity
                Intent intent = new Intent(MainActivity.this, BioinfoDev.class);
                startActivity(intent);
            }
        });

        // Add more click listeners for other buttons
    }
}




