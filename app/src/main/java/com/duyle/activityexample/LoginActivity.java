package com.duyle.activityexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText edtUsername = findViewById(R.id.edt_username);
        EditText edtPassword = findViewById(R.id.edt_password);

        String sUserName = getIntent().getStringExtra(RegisterActivity.KEY_USERNAME);
        String sPassword = getIntent().getStringExtra(RegisterActivity.KEY_PASSWORD);

        edtUsername.setText(sUserName);
        edtPassword.setText(sPassword);

        int number = getIntent().getIntExtra("number", 0);
        Toast.makeText(this, number + "", Toast.LENGTH_SHORT).show();

        Button btnRegister = findViewById(R.id.btn_register);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}