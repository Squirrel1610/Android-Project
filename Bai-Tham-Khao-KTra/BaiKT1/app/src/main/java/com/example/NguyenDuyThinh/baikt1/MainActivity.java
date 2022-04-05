package com.example.NguyenDuyThinh.baikt1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edUsername = (EditText) findViewById(R.id.edt_username);
        EditText edPassword = (EditText) findViewById(R.id.edt_password);
        Button btnLogin = (Button) findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = edUsername.getText().toString();
                String password = edPassword.getText().toString();
                if(username.equals("maicuongtho") && password.equals("Cntt60ntu!")){
                    Toast.makeText(MainActivity.this, "Login success!", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Incorrect username or password!", Toast.LENGTH_SHORT).show();
                }
            }
        });
     }
}