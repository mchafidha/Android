package com.example.cica.mariberhitung;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Hasil extends Activity implements OnClickListener {

    TextView hasil;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hasil);

        int benar = getIntent().getIntExtra("Benar", 0);
        int salah = getIntent().getIntExtra("Salah",0);

        hasil= (TextView)findViewById(R.id.hsl);
        hasil.setText("Jawaban benar :"+benar+"Jawaban salah :"+salah);
    }
    @Override
    public void onClick(View arg0) {
        //to do auto-generayed method sub
    }
}
