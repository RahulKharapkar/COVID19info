package com.rahul.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class meditate_three extends AppCompatActivity {
    private MediaPlayer mMediaPlayer, mPlayer;
    private Button mPlay, mPause, mP, mPa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditate_three);

        mPlay = (Button) findViewById(R.id.play);
        mPause = (Button) findViewById((R.id.pause));
        mP = (Button) findViewById((R.id.button4));
        mPa = (Button) findViewById((R.id.button5));
        mMediaPlayer = MediaPlayer.create(this, R.raw.song);
        mPlayer = MediaPlayer.create(this, R.raw.nintey_sec);

        mP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlayer.start();
            }
        });

        mPa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlayer.pause();
            }
        });

        mPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMediaPlayer.start();
            }
        });

        mPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMediaPlayer.pause();
            }
        });

    }

}
