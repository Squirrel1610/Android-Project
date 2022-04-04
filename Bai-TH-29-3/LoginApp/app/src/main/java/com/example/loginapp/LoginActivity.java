package com.example.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button nut_xacnhan = (Button) findViewById(R.id.btn_ok);
        EditText editText_username = (EditText) findViewById(R.id.ed_username);
        EditText editText_password = (EditText) findViewById(R.id.ed_password);
        EditText editText_email = (EditText) findViewById(R.id.ed_email);


        nut_xacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = editText_username.getText().toString();
                String email = editText_email.getText().toString();
                String password = editText_password.getText().toString();
                if(username.equals("Duythinh") && email.equals("Slthinhtu2@gmail.com") && password.equals("Dthinh1610")){
                    Intent iManHinhChinh = new Intent(LoginActivity.this, HomeActivity.class);
                    iManHinhChinh.putExtra("Username", username);
                    startActivity(iManHinhChinh);
                }
                else{
                    Toast.makeText(LoginActivity.this, "Thông tin bạn nhập không đúng, vui lòng nhập lại!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
