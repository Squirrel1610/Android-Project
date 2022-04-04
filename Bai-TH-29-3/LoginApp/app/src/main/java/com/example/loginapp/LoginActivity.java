package com.example.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button nut_xacnhan = (Button) findViewById(R.id.btn_ok);

        nut_xacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iManHinhChinh = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(iManHinhChinh);
            }
        });
    }
}
