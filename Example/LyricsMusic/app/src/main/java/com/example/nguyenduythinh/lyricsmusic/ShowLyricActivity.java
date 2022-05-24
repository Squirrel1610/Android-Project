package com.example.nguyenduythinh.lyricsmusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class ShowLyricActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_lyric);

        Intent showLyric = getIntent();
        String songName = showLyric.getStringExtra("songName");

        Toast toast = Toast.makeText(this, songName, Toast.LENGTH_SHORT);
        toast.show();
    }
}
