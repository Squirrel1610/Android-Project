package com.example.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button nut_chuyenManHinhKhac = (Button) findViewById(R.id.btn_view2);

        nut_chuyenManHinhKhac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(getBaseContext(), SubActivityOne.class);
                Intent iChuyenTrang = new Intent(view.getContext(), SubActivityOne.class);
                startActivity(iChuyenTrang);
            }
        });
    }

}