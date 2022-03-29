package com.example.cntt61_60136982;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv_show = (TextView) findViewById(R.id.tv_pos_val);
        String[] listName = getResources().getStringArray(R.array.list_name);
        ListView list_view = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> adapter;


        adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, listName
        );

        list_view.setAdapter(adapter);

       list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int pos, long id) {
               String val = (String) list_view.getItemAtPosition(pos);
               tv_show.setText("position: " + pos + " ; value = " + val);
           }
       });
    }
}