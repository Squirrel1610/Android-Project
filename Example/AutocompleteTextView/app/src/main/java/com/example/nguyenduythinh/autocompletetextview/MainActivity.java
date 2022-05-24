package com.example.nguyenduythinh.autocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private AutoCompleteTextView autoTvNations;
    private ArrayList<String> nationsList;
    private ArrayAdapter<String> adapterNations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nationsList = new ArrayList<String>();

        nationsList.add("Viet Nam");
        nationsList.add("Han Quoc");
        nationsList.add("Nhat Ban");
        nationsList.add("Thai Lan");
        nationsList.add("Nga");
        nationsList.add("Trung Quoc");

        //create adapter
        adapterNations = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, nationsList);

        //get autocomplete
        autoTvNations = (AutoCompleteTextView) findViewById(R.id.autoQuocGia);

        //set adapter
        autoTvNations.setAdapter(adapterNations);
    }
}