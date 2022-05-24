package com.example.nguyenduythinh.lyricsmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //data
        ArrayList<String> listSong = new ArrayList<String>();
        listSong.add("Sinh ra da la thu doi lap");
        listSong.add("Vung ky uc");
        listSong.add("Em dung khoc");

        //init adapter
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listSong);

        ListView lv = (ListView) findViewById(R.id.listView_song);

        //set adapter
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String song_name = listSong.get(i);
                // chuyen activity
                Intent intentShowLyric = new Intent(MainActivity.this, ShowLyricActivity.class);

                //gan bien de chuyen sang trang show lyric
                intentShowLyric.putExtra("songName", song_name);
                startActivity(intentShowLyric);
            }
        });
    }
}