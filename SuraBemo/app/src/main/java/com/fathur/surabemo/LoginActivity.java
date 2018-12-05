package com.fathur.surabemo;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends ActionBarActivity {

    private EditText username;
    private EditText password;
    private Button login;
    String uname, pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        setupVariables();
    }

    public void authenticateLogin(View view) {
        uname = username.getText().toString();
        pwd = password.getText().toString();
        if (uname.equals("hafid") &&
                password.getText().toString().equals("telkom")) {

            Intent intent = new Intent(this, com.fathur.surabemo.MainActivity.class);
            finish();
            startActivity(intent);

            Toast.makeText(getApplicationContext(), "Halo " + uname +" Selamat Datang di Aplikasi SuraBemo!",
                    Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "Silahkan Masukkan username dan Password yang Benar!",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void registerLogin(View view) {
        uname = username.getText().toString();
        pwd = password.getText().toString();
        if (uname.equals("") ||
                pwd.equals("")) {

            Toast.makeText(getApplicationContext(), "Harap Mengisi Semua Data!",
                    Toast.LENGTH_SHORT).show();
        } else {

            Intent intent = new Intent(this, com.fathur.surabemo.MainActivity.class);
            finish();
            startActivity(intent);

            Toast.makeText(getApplicationContext(), "Halo " + uname +" Selamat Bergabung di Aplikasi SuraBemo!",
                    Toast.LENGTH_SHORT).show();
        }
    }

    private void setupVariables() {
        username = (EditText) findViewById(R.id.usernameET);
        password = (EditText) findViewById(R.id.passwordET);
        login = (Button) findViewById(R.id.loginBtn);
    }

}