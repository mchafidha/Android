package com.example.cica.mariberhitung;

import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;


public class lay1 extends AppCompatActivity implements OnClickListener
{
    Button but_next;
    ImageButton pilih_a,pilih_b,pilih_c;
    TextView salahbenar;
    ImageView soal;
    int []pertanyaan =
            {R.drawable.gb1, R.drawable.gb2, R.drawable.gb3, R.drawable.gb4};

    int [] pilihan_a =
            {R.drawable.delapan, R.drawable.satu, R.drawable.sepuluh, R.drawable.three};

    int [] pilihan_b =
            {R.drawable.nol, R.drawable.lima, R.drawable.enam, R.drawable.dua};

    int [] pilihan_c =
            {R.drawable.tiga, R.drawable.empat, R.drawable.tujuh, R.drawable.four};

    String [] jawaban = {"C", "C", "B", "B"};
    int indeks=0;
    int salah = 0, benar = 0, skor = 0;

    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay1);

        soal=(ImageView)findViewById(R.id.soal1);
        soal.setImageResource(pertanyaan[0]);

        salahbenar=(TextView)findViewById(R.id.salahbenar);

        pilih_a=(ImageButton)findViewById(R.id.ib_8);
        pilih_a.setImageResource(pilihan_a[0]);
        pilih_a.setOnClickListener(this);

        pilih_b=(ImageButton)findViewById(R.id.ib_0);
        pilih_b.setImageResource(pilihan_b[0]);
        pilih_b.setOnClickListener(this);

        pilih_c=(ImageButton)findViewById(R.id.ib_tiga);
        pilih_c.setImageResource((pilihan_c[0]));
        pilih_c.setOnClickListener(this);

        but_next=(Button)findViewById(R.id.but_next);
        but_next.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.lay1, menu);
        return true;
    }

    @Override
    public void onClick(View v) {
        if (v == pilih_a) {
            if (jawaban[indeks].equals("A")) {
                salahbenar.setText("benar");
                benar++;
            } else {
                salahbenar.setText("salah");
                salah++;
            }
        } else if (v == pilih_b) {
            if (jawaban[indeks].equals("B")) {
                salahbenar.setText("benar");
                benar++;
            } else {
                salahbenar.setText("salah");
                salah++;
            }
        } else if (v == pilih_c) {
            if (jawaban[indeks].equals("C")) {
                salahbenar.setText("benar");
                benar++;
            } else {
                salahbenar.setText("salah");
                salah++;
            }
        } else if (v == but_next) {
            if (indeks < jawaban.length - 1) {
                indeks++;
                soal.setImageResource(pertanyaan[indeks]);

                pilih_a.setImageResource(pilihan_a[indeks]);

                pilih_b.setImageResource(pilihan_b[indeks]);

                pilih_c.setImageResource(pilihan_c[indeks]);
                salahbenar.setText("");
            } else {
                Intent i = new Intent
                        (lay1.this,Hasil.class);

                i.putExtra("Benar", benar);
                i.putExtra("Salah", salah);
                startActivity(i);
            }
        }

    }

}
