package com.example.dell.ayongaji;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.content.Intent;

/**
 * Created by dell on 7/3/2017.
 */

public class Mari extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mari);
        getSupportActionBar().setTitle("OneDayOneHuruf");
        TextView ff=(TextView)findViewById(R.id.ggg);


        Button metu=(Button)findViewById(R.id.button) ;
        metu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                // TODO Auto-generated method stub
                finish();
                System.exit(0);
            }
        });
    }
}
