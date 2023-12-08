package com.gyanendra.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class players extends AppCompatActivity {

    EditText editText, editText1;
    Button pbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players);
        editText = findViewById(R.id.editText);
        editText1 = findViewById(R.id.editText1);
        pbtn = findViewById(R.id.submitbtn);
        pbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String value = editText.getText().toString();
                String value1 = editText1.getText().toString();
                if (value.length() == 0 && value1.length() == 0) {
                    editText.setError("no value");
                    editText1.setError("no value");
                } else {
                    Intent intent = new Intent(players.this, MainActivity.class);
                    intent.putExtra("name", value);
                    intent.putExtra("name1", value1);
                    startActivity(intent);
                }

            }
        });
    }
}



