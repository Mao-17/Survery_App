package com.example.myapplication;
import android.util.Log;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    private TextView mEventsTextView;
    private static final String TAG = ThirdActivity.class.getSimpleName();
    private TextView mRatingsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_a);
        Log.i(TAG, "State of activity " + TAG + " changed from Created to Started");
        Toast.makeText(this, "State of activity " + TAG + " changed from Created to Started", Toast.LENGTH_SHORT).show();
        mEventsTextView = findViewById(R.id.tv_events);
        mRatingsTextView = findViewById(R.id.tv_rating);

        Intent intent = getIntent();
        String events = intent.getStringExtra("events");
        String ratings = intent.getStringExtra("ratings");

        mEventsTextView.setText(events);
        mRatingsTextView.setText(ratings);

        Toast.makeText(this, "Information submitted successfully!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "State of activity " + TAG + " changed from Started to Resumed");
        Toast.makeText(this, "State of activity " + TAG + " changed from Started to Resumed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "State of activity " + TAG + " changed from Resumed to Paused");
        Toast.makeText(this, "State of activity " + TAG + " changed from Resumed to Paused", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "State of activity " + TAG + " changed from Paused to Stopped");
        Toast.makeText(this, "State of activity " + TAG + " changed from Paused to Stopped", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "State of activity " + TAG + " changed from Stopped to Destroyed");
        Toast.makeText(this, "State of activity " + TAG + " changed from Stopped to Destroyed", Toast.LENGTH_SHORT).show();
    }
}