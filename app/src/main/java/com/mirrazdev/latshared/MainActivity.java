package com.mirrazdev.latshared;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button masuk;
    EditText nama, umur;
    SharedPreferences.Editor setData;
    String tx_nama, tx_umur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setData=getSharedPreferences("masuk_nilai", MODE_PRIVATE).edit();
        setContentView(R.layout.activity_main);
        nama=findViewById(R.id.nama);
        umur=findViewById(R.id.umur);
        masuk=findViewById(R.id.masuk);

        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            tx_nama=nama.getText().toString();
            tx_umur=umur.getText().toString();

            setData.putString("nama",tx_nama);
            setData.putString("umur", tx_umur);
            setData.apply();
            startActivity(new Intent(getApplicationContext(), MainActivity2.class));
            finish();
            }
        });
    }
}