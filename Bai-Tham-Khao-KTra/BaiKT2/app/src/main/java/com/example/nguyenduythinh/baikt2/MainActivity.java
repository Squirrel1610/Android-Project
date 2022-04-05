package com.example.nguyenduythinh.baikt2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtValue = (EditText) findViewById(R.id.edt_value);
        CheckBox c13 = (CheckBox) findViewById(R.id.c_13);
        CheckBox c15 = (CheckBox) findViewById(R.id.c_15);
        CheckBox c18 = (CheckBox) findViewById(R.id.c_18);
        Button nutTinh = (Button) findViewById(R.id.btn_calculate);
        TextView tvShow = (TextView) findViewById(R.id.tv_show);

        nutTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double tip_value = Double.parseDouble(edtValue.getText().toString());
                if(c13.isChecked() == true){
                    tip_value =  tip_value * 13/100;
                    tvShow.setText(String.valueOf(tip_value));
                }else if (c15.isChecked() == true){
                    tip_value =  tip_value * 15/100;
                    tvShow.setText(String.valueOf(tip_value));
                }else if (c18.isChecked() == true){
                    tip_value =  tip_value * 18/100;
                    tvShow.setText(String.valueOf(tip_value));
                }
            }
        });
    }


}