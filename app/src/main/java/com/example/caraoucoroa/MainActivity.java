package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageButton btnPlay;
    private String[] choice = {"cara", "coroa"};
    private final int choiceLength = choice.length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlay = findViewById(R.id.btnPlay);
        Random random = new Random();
        Intent intent = new Intent(getApplicationContext(), ChoiceActivity.class);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = choice[random.nextInt(choiceLength)];
                intent.putExtra("choice", result);

                startActivity(intent);
            }
        });
    }
}