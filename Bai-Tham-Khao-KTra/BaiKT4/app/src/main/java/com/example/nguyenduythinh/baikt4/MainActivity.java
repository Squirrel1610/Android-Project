package com.example.nguyenduythinh.baikt4;

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

        List<Animal> image_details = getListData();
        final ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new CustomListAdapter(image_details, this));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Object o = listView.getItemAtPosition(i);
                Animal animal = (Animal) o;
                Toast.makeText(MainActivity.this, "Selected: " + animal, Toast.LENGTH_LONG).show();
            }
        });
    }

    private List<Animal> getListData(){
        List<Animal> list = new ArrayList<Animal>();
        Animal octopus = new Animal("Octopus", "octopus", "8 tentacled monster");
        Animal pig = new Animal("Pig", "pig", "Delicious in rolls");
        Animal rabbit = new Animal("Rabbit", "rabbit", "Nice in a stew");

        list.add(octopus);
        list.add(pig);
        list.add(rabbit);

        return list;
    }
}