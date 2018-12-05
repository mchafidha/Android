package com.fathur.surabemo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class RuteKhusus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rute_khusus);
    }


    public void menujuPENSi(View view) {

        Intent intent = new Intent(this, com.fathur.surabemo.RutePens.class);
        startActivity(intent);
    }

    public void menujuTugu(View view) {

        Toast.makeText(getApplicationContext(), "Rute Belum Tersedia", Toast.LENGTH_SHORT).show();
    }
    public void menujuGubeng(View view) {

        Toast.makeText(getApplicationContext(), "Rute Belum Tersedia", Toast.LENGTH_SHORT).show();
    }
    public void menujuTuri(View view) {

        Toast.makeText(getApplicationContext(), "Rute Belum Tersedia", Toast.LENGTH_SHORT).show();
    }
    public void menujuWono(View view) {

        Toast.makeText(getApplicationContext(), "Rute Belum Tersedia", Toast.LENGTH_SHORT).show();
    }
    public void menujuBungur(View view) {

        Toast.makeText(getApplicationContext(), "Rute Belum Tersedia", Toast.LENGTH_SHORT).show();
    }
    public void menujuBratang(View view) {

        Toast.makeText(getApplicationContext(), "Rute Belum Tersedia", Toast.LENGTH_SHORT).show();
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
