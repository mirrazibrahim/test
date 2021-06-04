package com.mirrazdev.latshared;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    SharedPreferences getData;
    TextView nama, umur;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getData=getSharedPreferences("masuk_nilai",MODE_PRIVATE);
        setContentView(R.layout.activity_main2);

        nama=findViewById(R.id.nama);
        umur=findViewById(R.id.umur);

        nama.setText(getData.getString("nama", null));
        umur.setText(getData.getString("umur", null));
    }
}