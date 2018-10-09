package com.example.ridorianto.bangun_datar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class BelahKetupat extends AppCompatActivity {
    //Deklarasi variabel komponen
    EditText d1, d2;
    Button cek;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//memanggil file xml
        setContentView(R.layout.activity_belahketupat);

//Deklarasi yang dikaitkan dengan ID Komponen
        d1 = (EditText)findViewById(R.id.diagonal1);
        d2 = (EditText)findViewById(R.id.diagonal2);
        cek = (Button) findViewById(R.id.button_cek);
        hasil = (TextView)findViewById(R.id.hasil);
        cek.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
//jika tidak mengisi panjang dan lebar sekaligus maka akan tampil notifikasi
                if(d1.length()==0 && d2.length()==0){
                    Toast.makeText(getApplication(),"Diagonalnya masih Kosong, Gan!",Toast.LENGTH_LONG).show();
                }
//notifikasi ini akan muncul jika panjangnya tidak diisi
                else if (d1.length()==0){
                    Toast.makeText(getApplication(),"Diagonal 1 nya lupa di isi ya...", Toast.LENGTH_LONG).show();
                }
//notifikasi jika lebar tidak diisi
                else if (d2.length()==0){
                    Toast.makeText(getApplication(),"Diagonal 2 nya Kosong tuh, Gan...",Toast.LENGTH_LONG).show();
                }
                else{
//Deklarasi variabel perhitungan
                    String isidiagonal1 = d1.getText().toString();
                    String isidiagonal2 = d2.getText().toString();
                    double d1 = Double.parseDouble(isidiagonal1);
                    double d2 = Double.parseDouble(isidiagonal2);
                    double hs = BelahKetupat(d1,d2);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double BelahKetupat(double d1, double d2){return d1*d2/2;}
}