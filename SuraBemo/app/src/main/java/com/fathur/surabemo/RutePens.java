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

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class RutePens extends AppCompatActivity {

    TextView penumpangWK, penumpangTT, penumpangPP, penumpangOO, penumpangSS;
    ImageView WKsampai, TTsampai, PPsampai, OOsampai, SSsampai;
    ImageView btnWK, btnTT, btnPP, btnOO, btnSS;

    DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference();
    DatabaseReference mWK = mRootRef.child("wk");
    DatabaseReference mTT = mRootRef.child("tt");
    DatabaseReference mPP = mRootRef.child("pp");
    DatabaseReference mOO = mRootRef.child("oo");
    DatabaseReference mSS = mRootRef.child("ss");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rute_pens);

        penumpangWK = (TextView)findViewById(R.id.penumpangWK);
        penumpangTT = (TextView)findViewById(R.id.penumpangTT);
        penumpangPP = (TextView)findViewById(R.id.penumpangPP);
        penumpangSS = (TextView)findViewById(R.id.penumpangSS);
        penumpangOO = (TextView)findViewById(R.id.penumpangOO);
        btnWK = (ImageView) findViewById(R.id.bemoWK);
        btnTT = (ImageView) findViewById(R.id.bemoTT);
        btnPP = (ImageView) findViewById(R.id.bemoPP);
        btnSS = (ImageView) findViewById(R.id.bemoSS);
        btnOO = (ImageView) findViewById(R.id.bemoOO);
        WKsampai = (ImageView) findViewById(R.id.bemoWKsampai);
        TTsampai = (ImageView) findViewById(R.id.bemoTTsampai);
        PPsampai= (ImageView) findViewById(R.id.bemoPPsampai);
        OOsampai = (ImageView) findViewById(R.id.bemoOOsampai);
        SSsampai = (ImageView) findViewById(R.id.bemoSSsampai);

    }

    @Override
    protected void onStart() {
        super.onStart();

        mWK.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text1 = dataSnapshot.getValue(String.class);
                penumpangWK.setText(text1);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        mTT.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text2 = dataSnapshot.getValue(String.class);
                penumpangTT.setText(text2);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        mPP.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text3 = dataSnapshot.getValue(String.class);
                penumpangPP.setText(text3);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        mOO.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text4 = dataSnapshot.getValue(String.class);
                penumpangOO.setText(text4);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        mSS.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text5 = dataSnapshot.getValue(String.class);
                penumpangSS.setText(text5);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        btnWK.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View view) {
                mWK.setValue("1 penumpang menunggu");
            }
        });

        btnTT.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View view) {
                mTT.setValue("1 penumpang menunggu");
            }
        });

        btnPP.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View view) {
                mPP.setValue("1 penumpang menunggu");
            }
        });

        btnOO.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View view) {
                mOO.setValue("1 penumpang menunggu");
            }
        });

        btnSS.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View view) {
                mSS.setValue("1 penumpang menunggu");
            }
        });

        WKsampai.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View view) {
                mWK.setValue("tidak ada penumpang");
            }
        });

        TTsampai.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View view) {
                mTT.setValue("tidak ada penumpang");
            }
        });

        PPsampai.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View view) {
                mPP.setValue("tidak ada penumpang");
            }
        });

        OOsampai.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View view) {
                mOO.setValue("tidak ada penumpang");
            }
        });

        SSsampai.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View view) {
                mSS.setValue("tidak ada penumpang");
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
