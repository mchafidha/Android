package com.fathur.surabemo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class RutePensS extends AppCompatActivity {

    TextView penumpangWKs, penumpangTTs, penumpangPPs, penumpangOOs, penumpangSSs;
    ImageView WKsampais, TTsampais, PPsampais, OOsampais, SSsampais;

    DatabaseReference mRootRefS = FirebaseDatabase.getInstance().getReference();
    DatabaseReference mWKs = mRootRefS.child("wk");
    DatabaseReference mTTs = mRootRefS.child("tt");
    DatabaseReference mPPs = mRootRefS.child("pp");
    DatabaseReference mOOs = mRootRefS.child("oo");
    DatabaseReference mSSs = mRootRefS.child("ss");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rute_pens_s);

        penumpangWKs = (TextView)findViewById(R.id.penumpangWKs);
        penumpangTTs = (TextView)findViewById(R.id.penumpangTTs);
        penumpangPPs = (TextView)findViewById(R.id.penumpangPPs);
        penumpangSSs = (TextView)findViewById(R.id.penumpangSSs);
        penumpangOOs = (TextView)findViewById(R.id.penumpangOOs);
        WKsampais = (ImageView) findViewById(R.id.bemoWKsampaiSs);
        TTsampais = (ImageView) findViewById(R.id.bemoTTsampaiSs);
        PPsampais = (ImageView) findViewById(R.id.bemoPPsampaiSs);
        OOsampais = (ImageView) findViewById(R.id.bemoOOsampaiSs);
        SSsampais = (ImageView) findViewById(R.id.bemoSSsampaiSs);

    }

    @Override
    protected void onStart() {
        super.onStart();

        mWKs.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text1 = dataSnapshot.getValue(String.class);
                penumpangWKs.setText(text1);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        mTTs.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text2 = dataSnapshot.getValue(String.class);
                penumpangTTs.setText(text2);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        mPPs.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text3 = dataSnapshot.getValue(String.class);
                penumpangPPs.setText(text3);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        mOOs.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text4 = dataSnapshot.getValue(String.class);
                penumpangOOs.setText(text4);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        mSSs.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text5 = dataSnapshot.getValue(String.class);
                penumpangSSs.setText(text5);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        WKsampais.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View view) {
                mWKs.setValue("tidak ada penumpang");
            }
        });

        TTsampais.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View view) {
                mTTs.setValue("tidak ada penumpang");
            }
        });

        PPsampais.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View view) {
                mPPs.setValue("tidak ada penumpang");
            }
        });

        OOsampais.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View view) {
                mOOs.setValue("tidak ada penumpang");
            }
        });

        SSsampais.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View view) {
                mSSs.setValue("tidak ada penumpang");
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar actions click
        int id = item.getItemId();
        switch (id) {
            case R.id.help:

                Intent intens = new Intent(Intent.ACTION_VIEW);

                intens.setData(Uri.parse("http://fb.me/mchafidha"));
                if(intens.resolveActivity(getPackageManager()) != null) {
                    startActivity(intens);
                }

                break;
        }
        return super.onOptionsItemSelected(item);

    }
}
