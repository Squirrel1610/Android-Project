package com.example.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SubActivityOne extends AppCompatActivity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_one);

        Button nut_quayLaiTrangChu = (Button) findViewById(R.id.btn_view1);

        nut_quayLaiTrangChu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iQuayLai = new Intent(view.getContext(), MainActivity.class);
                startActivity(iQuayLai);
            }
        });
    }
}
