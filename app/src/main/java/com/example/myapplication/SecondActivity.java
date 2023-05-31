package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    private EditText musicRating, danceRating, playRating, fashionRating, foodRating;
    private CheckBox musicCheckBox, danceCheckBox, playCheckBox, fashionCheckBox, foodCheckBox;
    private static final String TAG = SecondActivity.class.getSimpleName();
    private Button submitButton, clearButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_a);
        Log.i(TAG, "State of activity " + TAG + " changed from Created to Started");
        Toast.makeText(this, "State of activity " + TAG + " changed from Created to Started", Toast.LENGTH_SHORT).show();

        musicRating = findViewById(R.id.music_rating);
        danceRating = findViewById(R.id.dance_rating);
        playRating = findViewById(R.id.play_rating);
        fashionRating = findViewById(R.id.fashion_rating);
        foodRating = findViewById(R.id.food_rating);
        musicCheckBox = findViewById(R.id.musicCheckBox);
        danceCheckBox = findViewById(R.id.danceCheckBox);
        playCheckBox = findViewById(R.id.playCheckBox);
        fashionCheckBox = findViewById(R.id.fashionCheckBox);
        foodCheckBox = findViewById(R.id.foodCheckBox);
        submitButton = findViewById(R.id.submitButton);
        clearButton = findViewById(R.id.clearButton);


        submitButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (musicCheckBox.isChecked() || danceCheckBox.isChecked() || playCheckBox.isChecked() || fashionCheckBox.isChecked() || foodCheckBox.isChecked()) {
                        StringBuilder events = new StringBuilder();
                        StringBuilder ratings = new StringBuilder();

                        if (musicCheckBox.isChecked()) {
                            events.append("Music ");
                            ratings.append(musicRating.getText().toString()  + "  ");
                        }
                        if (danceCheckBox.isChecked()) {
                            events.append("Dance ");
                            ratings.append(danceRating.getText().toString() + "  ");
                        }
                        if (playCheckBox.isChecked()) {
                            events.append("Play ");
                            ratings.append(playRating.getText().toString()  + "  ");
                        }
                        if (fashionCheckBox.isChecked()) {
                            events.append("Fashion ");
                            ratings.append(fashionRating.getText().toString()  + "  ");
                        }
                        if (foodCheckBox.isChecked()) {
                            events.append("Food ");
                            ratings.append(foodRating.getText().toString() + "  ");
                        }
                        Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                        intent.putExtra("events", events.toString());
                        intent.putExtra("ratings", ratings.toString());
                        startActivity(intent);

                        Toast.makeText(SecondActivity.this, "Submitted Successfully", Toast.LENGTH_SHORT).show();
                    }
                }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicCheckBox.setChecked(false);
                danceCheckBox.setChecked(false);
                playCheckBox.setChecked(false);
                fashionCheckBox.setChecked(false);
                foodCheckBox.setChecked(false);
                musicRating.setText("");
                danceRating.setText("");
                playRating.setText("");
                fashionRating.setText("");
                foodRating.setText("");
                Toast.makeText(SecondActivity.this, "Cleared Successfully", Toast.LENGTH_SHORT).show();
            }
        });
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
