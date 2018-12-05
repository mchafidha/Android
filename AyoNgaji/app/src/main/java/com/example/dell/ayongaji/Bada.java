package com.example.dell.ayongaji;


import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.content.Intent;

/**
 * Created by dell on 7/3/2017.
 */

public class Bada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bada);
        getSupportActionBar().setTitle("OneDayOneHuruf");
        TextView ff=(TextView)findViewById(R.id.textView2);
        Button gg=(Button)findViewById(R.id.start);
        ImageView hh=(ImageView)findViewById(R.id.imageView4);

        gg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(Bada.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
