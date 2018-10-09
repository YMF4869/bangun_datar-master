package com.example.ridorianto.bangun_datar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void btn_psg(View view) {
        Intent psg = new Intent(Dashboard.this, Persegi.class);
        startActivity(psg);
    }

    public void btn_sgt(View view) {
        Intent sgt = new Intent(Dashboard.this, Segitiga.class);
        startActivity(sgt);
    }

    public void btn_bek(View view) {
        Intent bek = new Intent(Dashboard.this, BelahKetupat.class);
        startActivity(bek);
    }
    public void btn_jjg(View view) {
        Intent jjg = new Intent(Dashboard.this, JajarGenjang.class);
        startActivity(jjg);
    }
    public void btn_lyg(View view) {
        Intent lyg = new Intent(Dashboard.this, LayangLayang.class);
        startActivity(lyg);
    }
    public void btn_tng(View view) {
        Intent tng = new Intent(Dashboard.this, Tentang.class);
        startActivity(tng);
    }
}
