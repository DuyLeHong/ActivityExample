package com.duyle.activityexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    public static String KEY_USERNAME = "user_name";
    public static String KEY_PASSWORD = "password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button btnLogin = findViewById(R.id.btn_login);
        Button btnBack = findViewById(R.id.btn_back);

        EditText edtUsername = findViewById(R.id.edt_username);
        EditText edtPassword = findViewById(R.id.edt_password);
        EditText edtRetypePassword = findViewById(R.id.edt_retype_password);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // validate o nhap trong, password nhap lai dung
                String sUserName = edtUsername.getText().toString();
                String sPassword = edtPassword.getText().toString();
                String sRetypePass = edtRetypePassword.getText().toString();

                if (sUserName == null || sUserName.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "Can nhap Username!", Toast.LENGTH_SHORT).show();
                } else if (sPassword == null || sPassword.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "Can nhap Password!", Toast.LENGTH_SHORT).show();
                } else if (sRetypePass == null || sRetypePass.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "Can nhap lai Password!", Toast.LENGTH_SHORT).show();
                } else if (!sRetypePass.equals(sPassword)) {
                    Toast.makeText(getApplicationContext(), "Password nhap lai chua dung!", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(getApplicationContext(), LoginActivity.class);

                    intent.putExtra(KEY_USERNAME, sUserName);
                    intent.putExtra(KEY_PASSWORD, sPassword);

                    intent.putExtra("number", 18);

                    startActivity(intent);
                }

            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(getApplicationContext(), "Vao onPause Activity 1", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(getApplicationContext(), "Vao onStop Activity 1", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(getApplicationContext(), "Vao onResume Activity 1", Toast.LENGTH_SHORT).show();
    }


}