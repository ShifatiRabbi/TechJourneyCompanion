package com.example.techjourneycompanion;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StopWatch extends AppCompatActivity {

    private TextView timerTextView;
    private Button startButton;
    private Button stopButton;
    private Button resetButton;
    private boolean isRunning = false;
    private int elapsedTime = 0;
    private Handler handler = new Handler();
    private Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop_watch);

        timerTextView = findViewById(R.id.timerTextView);
        startButton = findViewById(R.id.startButton);
        stopButton = findViewById(R.id.stopButton);
        resetButton = findViewById(R.id.resetButton);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTimer();
            }
        });

        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer();
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetTimer();
            }
        });
    }

    private void startTimer() {
        if (!isRunning) {
            isRunning = true;
            final long startTime = System.currentTimeMillis() - elapsedTime;

            runnable = new Runnable() {
                @Override
                public void run() {
                    long currentMillis = System.currentTimeMillis() - startTime;
                    int hours = (int) (currentMillis / 3600000);
                    int minutes = (int) ((currentMillis % 3600000) / 60000);
                    int seconds = (int) ((currentMillis % 60000) / 1000);
                    int millis = (int) (currentMillis % 1000);

                    String time = String.format("%02d:%02d:%02d.%03d", hours, minutes, seconds, millis);
                    timerTextView.setText(time);
                    handler.postDelayed(this, 10); // Update every 10 milliseconds
                }
            };
            handler.postDelayed(runnable, 10); // Start with 10 milliseconds delay
        }
    }

    private void stopTimer() {
        if (isRunning) {
            isRunning = false;
            handler.removeCallbacks(runnable);
            elapsedTime = (int) (System.currentTimeMillis() - (System.currentTimeMillis() - elapsedTime));
        }
    }

    private void resetTimer() {
        stopTimer();
        elapsedTime = 0;
        timerTextView.setText("00:00:00.000");
    }
}