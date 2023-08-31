package com.example.colorsoundsystem;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button blackButton, greenButton, purpleButton, redButton, yellowButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blackButton = findViewById(R.id.buttonBlack);
        MediaPlayer mpBlack = MediaPlayer.create(this, R.raw.black);
        blackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpBlack.start();
            }
        });
        greenButton = findViewById(R.id.buttonGreen);
        MediaPlayer mpGreen = MediaPlayer.create(this, R.raw.green);
        blackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpGreen.start();
            }
        });


    }
}