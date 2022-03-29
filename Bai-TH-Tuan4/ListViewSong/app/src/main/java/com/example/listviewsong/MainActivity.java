package com.example.listviewsong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Song> image_details = getListData();
        final ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new CustomListAdapter(image_details, this));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Object o = listView.getItemAtPosition(i);
                Song song = (Song) o;
                Toast.makeText(MainActivity.this, "Selected: " + song, Toast.LENGTH_LONG ).show();
            }
        });
    }

    private List<Song> getListData(){
        List<Song> list = new ArrayList<Song>();
        Song muonroimasaocon = new Song("Muộn rồi mà sao còn", "Sơn Tùng", "mrmsc");
        Song cochacyeuladay = new Song("Có chắc yêu là đây", "Sơn Tùng", "ccyld");

        list.add(muonroimasaocon);
        list.add(cochacyeuladay);

        return list;
    }
}