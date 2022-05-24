package com.example.nguyenduythinh.bookmanagerapp;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SuaActivity extends AppCompatActivity {
    SQLiteDatabase databaseBook;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sua);


        EditText edt_ma_sach = (EditText) findViewById(R.id.edtMaSach);
        EditText edt_ten_sach = (EditText) findViewById(R.id.edtTenSach);
        EditText edt_so_trang = (EditText) findViewById(R.id.edtSoTrang);
        EditText edt_gia_sach = (EditText) findViewById(R.id.edtGiaSach);
        EditText edt_mo_ta_sach = (EditText) findViewById(R.id.edtMoTaSach);
        Button btn_cap_nhap = (Button) findViewById(R.id.btnCapNhap);
        Button btn_quay_lai = (Button) findViewById(R.id.btnQuayLai);



        databaseBook = SQLiteDatabase.openOrCreateDatabase("/data/data/com.example.nguyenduythinh.bookmanagerapp/MyBook.db", null);

        Bundle b = new Bundle();
        b = getIntent().getExtras();
        String maSach = b.getString("maSach");

        edt_ma_sach.setText(maSach);

        //Lấy ra dữ liệu đã gói thông qua key là maSach
//        int maSachSua = Integer.parseInt(maSach);
//
//        //Lấy các thông tin hiện tại, fill vào các điều khiển
//        String[] thamsoTruyen = {String.valueOf(maSachSua)};
//        Cursor cs = databaseBook.rawQuery("SELECT * FROM BOOKS where BookID=?", thamsoTruyen);
//        int ma = cs.getInt(0);
//        String ten = cs.getString(1);
//        int soTrang = cs.getInt(2);
//        Float gia = cs.getFloat(3);
//        String moTa = cs.getString(4);
//
//
//
//        edt_ma_sach.setText(String.valueOf(ma));
//        edt_ten_sach.setText(ten);
//        edt_so_trang.setText(String.valueOf(soTrang));
//        edt_gia_sach.setText(String.valueOf(gia));
//        edt_mo_ta_sach.setText(moTa);


        //Lấy thông tin từ điều khiển, truyền vào cho hàm cập nhập

        btn_cap_nhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btn_quay_lai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iQuayLaiDS = new Intent(SuaActivity.this, MainActivity.class);
                startActivity(iQuayLaiDS);
            }
        });
    }

    void CapNhap(int maGoc, String tenMoi, int soTrangMoi, float giaMoi, String motaMoi ){
        String[] thamsoTruyen = {String.valueOf(maGoc)};

        ContentValues row = new ContentValues();
        //put(key, value) key: ten cot; value: gia tri
        row.put("BookName", tenMoi);
        row.put("Page", soTrangMoi);
        row.put("Price", giaMoi);
        row.put("Description", motaMoi);

        int kq = databaseBook.update("BOOKS", row, "BookID=?", thamsoTruyen);
        if(kq == 0){
            Toast.makeText(this, "Không cập nhập được", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "Cập nhật thành công",Toast.LENGTH_LONG).show();
        }

    }
}
