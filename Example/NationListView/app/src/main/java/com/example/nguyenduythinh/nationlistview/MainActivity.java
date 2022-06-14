package com.example.nguyenduythinh.nationlistview;

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

        List<Country> image_details = getListData();
        final ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new CustomListAdapter(this, image_details));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Object o = listView.getItemAtPosition(i);
                Country country = (Country) o;
                Toast.makeText(MainActivity.this,"Selected: " + country, Toast.LENGTH_LONG).show();
            }
        });
    }

    List<Country> getListData(){
        List<Country> list = new ArrayList<Country>();
        Country vietnam = new Country("Vietnam","vn", 97340000);
        Country thailan = new Country("Thailand", "thailand",69800000);
        Country trungquoc = new Country("China", "china", 1402000000);

        list.add(vietnam);
        list.add(thailan);
        list.add(trungquoc);

        return list;
    }
}