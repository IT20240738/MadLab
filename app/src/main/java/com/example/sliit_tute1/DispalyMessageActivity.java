package com.example.sliit_tute1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DispalyMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dispaly_message);


        // Get the Intent that started this activity and extract the string

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //capture the layout's TextView and set the string as its text
        TextView  displayMessage = findViewById(R.id.displayMessage);
        displayMessage.setText(message);
    }
}