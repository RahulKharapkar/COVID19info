package com.rahul.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;


public class meditate_three extends AppCompatActivity {
    /*private MediaPlayer mMediaPlayer, mPlayer;
    private Button mPlay, mPause, mP, mPa;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditate_three);

      /*  mPlay = (Button) findViewById(R.id.play);
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
*/
    }

    public void play_song(View v) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/covid19-66319.appspot.com/o/nintey_sec.mp3?alt=media&token=8bce4735-e551-44dd-8a48-fb513ae41447");
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mp.start();
                }
            });
            mediaPlayer.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void play_song_two(View v) {
        MediaPlayer mediaPlay = new MediaPlayer();
        try {
            mediaPlay.setDataSource("https://firebasestorage.googleapis.com/v0/b/covid19-66319.appspot.com/o/nintey_sec.mp3?alt=media&token=8bce4735-e551-44dd-8a48-fb513ae41447");
            mediaPlay.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mp.start();
                }
            });
            mediaPlay.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}