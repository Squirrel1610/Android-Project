package com.example.calculatorconstrainlayoutduythinh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edtA;
    private EditText edtB;
    private Button btnCong;
    private Button btnTru;
    private Button btnNhan;
    private Button btnChia;
    private TextView tvKetQua;
    int kq = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUi();

        // set sự kiện cộng
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());
                 kq = a + b;
                tvKetQua.setText(String.valueOf(kq));
            }
        });

        // set sự kiện tru
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());
                 kq = a - b;
                tvKetQua.setText(String.valueOf(kq));
            }
        });
//
//        // set sự kiện nhan
        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double a = Double.parseDouble(edtA.getText().toString());
                Double b = Double.parseDouble(edtB.getText().toString());
                Double kq = a * b;
                tvKetQua.setText(String.valueOf(kq));
            }
        });
//
//        // set sự kiện chia
        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double a = Double.parseDouble(edtA.getText().toString());
                Double b = Double.parseDouble(edtB.getText().toString());
                Double kq = a / b;
                tvKetQua.setText(String.valueOf(kq));
            }
        });


    }

    // hàm khởi tạo, lấy id từ layout truyền vào
    private void initUi() {
        edtA = findViewById(R.id.edt_a);
        edtB = findViewById(R.id.edt_b);
        btnCong = findViewById(R.id.btn_cong);
        btnTru = findViewById(R.id.btn_tru);
        btnNhan = findViewById(R.id.btn_nhan);
        btnChia = findViewById(R.id.btn_chia);
        tvKetQua = findViewById(R.id.tv_ketqua);
    }
}