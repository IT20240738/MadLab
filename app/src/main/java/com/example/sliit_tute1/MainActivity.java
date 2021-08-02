package com.example.sliit_tute1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "aaa";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   public void sendMessage(View view){
       Intent intent = new Intent(this, DispalyMessageActivity.class);
       EditText tx_message =(EditText) findViewById(R.id.tx_message);
       String message = tx_message.getText().toString();
       intent.putExtra(EXTRA_MESSAGE, message);
       startActivity(intent);

   }
}