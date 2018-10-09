package com.example.ridorianto.bangun_datar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class Segitiga extends AppCompatActivity {
    //Deklarasi variabel komponen
    EditText a, t;
    Button cek;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//memanggil file xml
        setContentView(R.layout.activity_segitiga);

//Deklarasi yang dikaitkan dengan ID Komponen
        a = (EditText)findViewById(R.id.alas);
        t = (EditText)findViewById(R.id.tinggi);
        cek = (Button) findViewById(R.id.button_cek);
        hasil = (TextView)findViewById(R.id.hasil);
        cek.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
//jika tidak mengisi panjang dan lebar sekaligus maka akan tampil notifikasi
                if(a.length()==0 && t.length()==0){
                    Toast.makeText(getApplication(),"Alas dan Tinggi masih Kosong, Gan!",Toast.LENGTH_LONG).show();
                }
//notifikasi ini akan muncul jika panjangnya tidak diisi
                else if (a.length()==0){
                    Toast.makeText(getApplication(),"Alasnya lupa di isi ya...", Toast.LENGTH_LONG).show();
                }
//notifikasi jika lebar tidak diisi
                else if (t.length()==0){
                    Toast.makeText(getApplication(),"Tingginya Kosong tuh, Gan...",Toast.LENGTH_LONG).show();
                }
                else{
//Deklarasi variabel perhitungan
                    String isialas = a.getText().toString();
                    String isitinggi = t.getText().toString();
                    double a = Double.parseDouble(isialas);
                    double t = Double.parseDouble(isitinggi);
                    double hs = Segitiga(a,t);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double Segitiga(double a, double t){return a*t/2;}
}