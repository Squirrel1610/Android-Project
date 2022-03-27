package com.example.cntt61_60136982;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv_show = (TextView) findViewById(R.id.tv_pos_val);
        String[] listName = getResources().getStringArray(R.array.list_name);
        ListView list_view = (ListView) findViewById(R.id.listView);
        EditText edNhap = (EditText) findViewById(R.id.ed_input);
        Button btnThem = (Button) findViewById(R.id.btn_add);


        List< String > arrayList = new ArrayList< String >
                (Arrays.asList(listName));

        ArrayAdapter<String> adapter;

        adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, arrayList
        );

        list_view.setAdapter(adapter);

        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value = (String) list_view.getItemAtPosition(i);
                tv_show.setText("Position: " + String.valueOf(i) + "; value : " + value);
            }
        });


        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayList.add(edNhap.getText().toString());
                adapter.notifyDataSetChanged();
                edNhap.setText("");
            }
        });
    }


}