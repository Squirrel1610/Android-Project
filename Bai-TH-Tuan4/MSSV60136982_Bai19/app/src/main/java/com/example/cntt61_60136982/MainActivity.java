package com.example.cntt61_60136982;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv_show = (TextView) findViewById(R.id.tv_pos_val);
        List<Province>  image_details = getListData();
        final ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter((ListAdapter) new CustomListAdapter(this, image_details));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = listView.getItemAtPosition(position);
                Province province = (Province) o;
                tv_show.setText(province.getProvinceName());
            }
        });
    }

    List<Province> getListData(){
        List<Province> list = new ArrayList<Province>();
        Province hanoi = new Province("Ha Noi", "globe");
        Province hue = new Province("Hue", "star");
        Province danang = new Province("Da Nang", "globe");
        Province sapa = new Province("Sapa", "star");

        list.add(hanoi);
        list.add(hue);
        list.add(danang);
        list.add(sapa);

        return list;
    }
}