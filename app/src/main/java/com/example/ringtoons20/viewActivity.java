package com.example.ringtoons20;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class viewActivity extends AppCompatActivity {

    Button play1,play2,play3,play4,play5,play6,play7,play8,share1,share2,share3,share4,share5,share6,share7,share8,blue1,blue2,blue3,blue4,blue5,blue6,blue7,blue8;
    MediaPlayer mp1,mp2,mp3,mp4,mp5,mp6,mp7,mp8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        play1 = (Button)findViewById(R.id.play1);
        play2 = (Button)findViewById(R.id.play2);
        play3 = (Button)findViewById(R.id.play3);
        play4 = (Button)findViewById(R.id.play4);
        play5 = (Button)findViewById(R.id.play5);
        play6 = (Button)findViewById(R.id.play6);
        play7 = (Button)findViewById(R.id.play7);
        play8 = (Button)findViewById(R.id.play8);

        share1 = (Button)findViewById(R.id.share1);
        share2 = (Button)findViewById(R.id.share2);
        share3 = (Button)findViewById(R.id.share3);
        share4 = (Button)findViewById(R.id.share4);
        share5 = (Button)findViewById(R.id.share5);
        share6 = (Button)findViewById(R.id.share6);
        share7 = (Button)findViewById(R.id.share7);
        share8 = (Button)findViewById(R.id.share8);

        blue1 = (Button)findViewById(R.id.blue1);
        blue2 = (Button)findViewById(R.id.blue2);
        blue3 = (Button)findViewById(R.id.blue3);
        blue4 = (Button)findViewById(R.id.blue4);
        blue5 = (Button)findViewById(R.id.blue5);
        blue6 = (Button)findViewById(R.id.blue6);
        blue7 = (Button)findViewById(R.id.blue7);
        blue8 = (Button)findViewById(R.id.blue8);

        mp1 = MediaPlayer.create(this, R.raw.correcaminos);
        mp2 = MediaPlayer.create(this, R.raw.gameo_of_trones);
        mp3 = MediaPlayer.create(this, R.raw.llamada_de_homero);
        mp4 = MediaPlayer.create(this, R.raw.mario_bros_died);
        mp5 = MediaPlayer.create(this, R.raw.militar_trompeta);
        mp6 = MediaPlayer.create(this, R.raw.mision_imposible);
        mp7 = MediaPlayer.create(this, R.raw.old_telephone);
        mp8 = MediaPlayer.create(this, R.raw.pink_panther);

        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp1.isPlaying()) {
                    mp1.pause();
                    Toast.makeText(viewActivity.this, "pausa", Toast.LENGTH_SHORT).show();
                }else {
                    mp1.start();
                    Toast.makeText(viewActivity.this, "play", Toast.LENGTH_SHORT).show();

                }
            }
        });

        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp2.isPlaying()) {
                    mp2.pause();
                    Toast.makeText(viewActivity.this, "pausa", Toast.LENGTH_SHORT).show();
                }else {
                    mp2.start();
                    Toast.makeText(viewActivity.this, "play", Toast.LENGTH_SHORT).show();

                }
            }
        });

        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp3.isPlaying()) {
                    mp3.pause();
                    Toast.makeText(viewActivity.this, "pausa", Toast.LENGTH_SHORT).show();
                }else {
                    mp3.start();
                    Toast.makeText(viewActivity.this, "play", Toast.LENGTH_SHORT).show();

                }
            }
        });

        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp3.isPlaying()) {
                    mp3.pause();
                    Toast.makeText(viewActivity.this, "pausa", Toast.LENGTH_SHORT).show();
                }else {
                    mp3.start();
                    Toast.makeText(viewActivity.this, "play", Toast.LENGTH_SHORT).show();

                }
            }
        });

        play4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp4.isPlaying()) {
                    mp4.pause();
                    Toast.makeText(viewActivity.this, "pausa", Toast.LENGTH_SHORT).show();
                }else {
                    mp4.start();
                    Toast.makeText(viewActivity.this, "play", Toast.LENGTH_SHORT).show();

                }
            }
        });

        play5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp5.isPlaying()) {
                    mp5.pause();
                    Toast.makeText(viewActivity.this, "pausa", Toast.LENGTH_SHORT).show();
                }else {
                    mp5.start();
                    Toast.makeText(viewActivity.this, "play", Toast.LENGTH_SHORT).show();

                }
            }
        });

        play6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp6.isPlaying()) {
                    mp6.pause();
                    Toast.makeText(viewActivity.this, "pausa", Toast.LENGTH_SHORT).show();
                }else {
                    mp6.start();
                    Toast.makeText(viewActivity.this, "play", Toast.LENGTH_SHORT).show();

                }
            }
        });

        play7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp7.isPlaying()) {
                    mp7.pause();
                    Toast.makeText(viewActivity.this, "pausa", Toast.LENGTH_SHORT).show();
                }else {
                    mp7.start();
                    Toast.makeText(viewActivity.this, "play", Toast.LENGTH_SHORT).show();

                }
            }
        });

        play8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp8.isPlaying()) {
                    mp8.pause();
                    Toast.makeText(viewActivity.this, "pausa", Toast.LENGTH_SHORT).show();
                }else {
                    mp8.start();
                    Toast.makeText(viewActivity.this, "play", Toast.LENGTH_SHORT).show();

                }
            }
        });




    }
}