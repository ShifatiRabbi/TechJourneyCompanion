package com.example.techjourneycompanion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OtherApps extends AppCompatActivity implements View.OnClickListener{
    private CardView CV1,CV2;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_apps);
        CV1=(CardView) findViewById(R.id.cv1);
        CV2=(CardView) findViewById(R.id.cv2);
        CV1.setOnClickListener(this);
        CV2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.cv1)
        {
            Intent intent= new Intent(OtherApps.this, StopWatch.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.cv2)
        {
            Intent intent= new Intent(OtherApps.this, CurrencyConverter.class);
            startActivity(intent);
        }

    }
}