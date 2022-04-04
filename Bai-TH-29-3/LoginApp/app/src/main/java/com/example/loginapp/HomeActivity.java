package com.example.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent iManHinhChinh = getIntent();
        TextView textView_Username = (TextView) findViewById(R.id.tv_username1);
        textView_Username.setText(iManHinhChinh.getStringExtra("Username"));
        Button nut_thoat = (Button) findViewById(R.id.btn_quitapp);
        Button nut_dangxuat = (Button) findViewById(R.id.btn_logout);

        nut_dangxuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iQuayLai = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(iQuayLai);
            }
        });

        nut_thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });

    }
}
