package com.example.nguyenduythinh.cau2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv_show = (TextView) findViewById(R.id.tv_pos_val);
        ListView list_view = (ListView) findViewById(R.id.listView);
        EditText edNhap = (EditText) findViewById(R.id.ed_input);
        Button btnThem = (Button) findViewById(R.id.btn_add);
        Button btnSua = (Button) findViewById(R.id.btn_update);
        Button btnXoa = (Button) findViewById(R.id.btn_delete);
        ArrayList< String > listPoem = new ArrayList<String>();

        listPoem.add("Đất nước");
        listPoem.add("Việt Nam quê hương ta");
        listPoem.add("Thơ tình người lính biển");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listPoem);

        list_view.setAdapter(adapter);

        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value = (String) list_view.getItemAtPosition(i);
                tv_show.setText(String.valueOf(i));
            }
        });

        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listPoem.add(edNhap.getText().toString());
                adapter.notifyDataSetChanged();
                edNhap.setText("");
            }
        });

        btnSua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int index = Integer.parseInt(tv_show.getText().toString());
                String value = edNhap.getText().toString();
                listPoem.set(index, value);
                adapter.notifyDataSetChanged();
                edNhap.setText("");
            }
        });

        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int index = Integer.parseInt(tv_show.getText().toString());
                listPoem.remove(index);
                adapter.notifyDataSetChanged();
            }
        });


    }
}