/*
 *     Tanggal Pengerjaan : 18/5/2021
 *     Nim : 10118056
 *     Nama : Mirraz Ibrahim
 *     email : mirrazibrahim@gmail.com
 *     Copyright © 2021 Mirraz Ibrahim. All rights reserved.
 */

package com.mirrazdev.latshared;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //menghilangkan ActionBar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        // membuat transparan notifikasi
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }
        setContentView(R.layout.activity_splash_screen);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), Welcome.class));
                finish();
            }
        }, 3000L); //3000 L = 3 detik
    }
}