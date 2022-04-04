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

        Button nut_dangnhap = (Button) findViewById(R.id.btn_viewLogin);

        nut_dangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iViewLogin = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(iViewLogin);
            }
        });
    }

}