package com.example.ridorianto.bangun_datar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class Persegi extends AppCompatActivity {
    //Deklarasi variabel komponen
    EditText p, l;
    Button cek;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//memanggil file xml
        setContentView(R.layout.activity_persegi);

//Deklarasi yang dikaitkan dengan ID Komponen
        p = (EditText)findViewById(R.id.panjang);
        l = (EditText)findViewById(R.id.lebar);
        cek = (Button) findViewById(R.id.button_cek);
        hasil = (TextView)findViewById(R.id.hasil);
        cek.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
//jika tidak mengisi panjang dan lebar sekaligus maka akan tampil notifikasi
                if(p.length()==0 && l.length()==0){
                    Toast.makeText(getApplication(),"Panjang dan Lebar masih Kosong, Gan!",Toast.LENGTH_LONG).show();
                }
//notifikasi ini akan muncul jika panjangnya tidak diisi
                else if (p.length()==0){
                    Toast.makeText(getApplication(),"Panjangnya lupa di isi ya...", Toast.LENGTH_LONG).show();
                }
//notifikasi jika lebar tidak diisi
                else if (l.length()==0){
                    Toast.makeText(getApplication(),"Lebarnya Kosong tuh, Gan...",Toast.LENGTH_LONG).show();
                }
                else{
//Deklarasi variabel perhitungan
                    String isipanjang = p.getText().toString();
                    String isilebar = l.getText().toString();
                    double p = Double.parseDouble(isipanjang);
                    double l = Double.parseDouble(isilebar);
                    double hs = Persegi(p,l);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double Persegi(double p, double l){return p*l;}
}