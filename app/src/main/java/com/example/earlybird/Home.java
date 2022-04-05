package com.example.earlybird;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button setalarm = findViewById(R.id.setalarm);
        Button timer = findViewById(R.id.timer);
        Button stopwatch = findViewById(R.id.stopwatch);
        Button about = findViewById(R.id.about);

        setalarm.setOnClickListener(this);
        timer.setOnClickListener(this);
        stopwatch.setOnClickListener(this);
        about.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.setalarm:
                Intent intent1 = new Intent(this, SetAlarm.class);
                startActivity(intent1);
                break;

            case R.id.timer:
                Intent intent2 = new Intent(this, Timer.class);
                startActivity(intent2);
                break;

            case R.id.stopwatch:
                Intent intent3 = new Intent(this, StopWatch.class);
                startActivity(intent3);
                break;

            case R.id.note:
                Intent intent4 = new Intent(this, Note.class);
                startActivity(intent4);
                break;

            case R.id.about:
                Toast.makeText(this,"Button 4 clicked",Toast.LENGTH_SHORT).show();
                break;
        }

    }
}