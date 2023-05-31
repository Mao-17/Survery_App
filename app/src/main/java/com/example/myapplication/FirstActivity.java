package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {
    private EditText name, role;
    private static final String TAG = FirstActivity.class.getSimpleName();
    private Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_a);
        Log.i(TAG, "State of activity " + TAG + " changed from Created to Started");
        Toast.makeText(this, "State of activity " + TAG + " changed from Created to Started", Toast.LENGTH_SHORT).show();
        name = findViewById(R.id.name_input);
        role = findViewById(R.id.role_input);
        nextButton = findViewById(R.id.next_button);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.getText().toString().isEmpty() || role.getText().toString().isEmpty()) {
                    Toast.makeText(FirstActivity.this, "Please fill all the fields", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                    intent.putExtra("name", name.getText().toString());
                    intent.putExtra("role", role.getText().toString());
                    startActivity(intent);
                }
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