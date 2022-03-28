package com.example.cntt61_60136982;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ListActivity {
    TextView tv_show;
    List<String> listPhone = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listPhone.add("Intel");
        listPhone.add("Samsung");
        listPhone.add("Nokia");
        listPhone.add("Simen");
        listPhone.add("AMD");
        listPhone.add("KIC");
        listPhone.add("ECD");

         tv_show = (TextView) findViewById(R.id.tv_pos_val);

        ArrayAdapter<String> adapter;

        adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, listPhone
        );
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        tv_show.setText("position: " + position+ "; value: "+ listPhone.get(position));
    }
}