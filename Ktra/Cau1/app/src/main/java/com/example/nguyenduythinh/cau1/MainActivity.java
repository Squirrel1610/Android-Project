package com.example.nguyenduythinh.cau1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edt_canh_ben;
    private EditText edt_canh_day;
    private EditText edt_chieu_cao;
    private Button btn_chu_vi;
    private Button btn_dien_tich;
    private TextView tv_ket_qua;
    int kq = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUi();

        btn_chu_vi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int canhben = Integer.parseInt(edt_canh_ben.getText().toString());
                int canhday = Integer.parseInt(edt_canh_day.getText().toString());
                kq = 2*(canhben + canhday);
                tv_ket_qua.setText(String.valueOf(kq));
            }
        });

        btn_dien_tich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int canhday = Integer.parseInt(edt_canh_day.getText().toString());
                int chieucao = Integer.parseInt(edt_chieu_cao.getText().toString());
                kq = canhday * chieucao;
                tv_ket_qua.setText(String.valueOf(kq));
            }
        });

    }

    // hàm khởi tạo, lấy id từ layout truyền vào
    private void initUi() {
        edt_canh_ben = findViewById(R.id.edtCanhBen);
        edt_canh_day = findViewById(R.id.edtCanhDay);
        edt_chieu_cao = findViewById(R.id.edtChieuCao);
        btn_chu_vi = findViewById(R.id.btnChuVi);
        btn_dien_tich = findViewById(R.id.btnDienTich);
        tv_ket_qua = findViewById(R.id.tvKetQua);
    }
}