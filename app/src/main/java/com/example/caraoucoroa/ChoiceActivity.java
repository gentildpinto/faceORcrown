package com.example.caraoucoroa;

import static java.util.ResourceBundle.getBundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ChoiceActivity extends AppCompatActivity {
    private ImageButton btnReturn;
    private ImageView imageChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        btnReturn = findViewById(R.id.btnReturn);
        imageChoice = findViewById(R.id.imageChoice);

        Intent data = getIntent();
        if(data.getStringExtra("choice").equals("cara")) {
            imageChoice.setImageResource(R.drawable.face_coin);
        } else if (data.getStringExtra("choice").equals("coroa")) {
            imageChoice.setImageResource(R.drawable.crown_coin);
        }

        Intent intent = new Intent(getApplicationContext(), MainActivity.class);

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
    }
}