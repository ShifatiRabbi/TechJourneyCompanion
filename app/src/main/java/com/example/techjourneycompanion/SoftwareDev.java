package com.example.techjourneycompanion;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SoftwareDev extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_dev);

        setupBackButton();
    }
}