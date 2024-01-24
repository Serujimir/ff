package com.isip.serujimir.bestappdeveloper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {



    // Email = example@mail.ru
    // Email = example@mail.ru
    // Email = example@mail.ru
    // Email = example@mail.ru
    // Email = example@mail.ru
    // Email = example@mail.ru
    // Email = example@mail.ru
    // Email = example@mail.ru
    // Email = example@mail.ru
    // Email = example@mail.ru
    // Email = example@mail.ru
    // Email = example@mail.ru
    // Email = example@mail.ru

    EditText edLoginEmail;
    Button btnLogin, btnYandexLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }

    public void init() {
        edLoginEmail = findViewById(R.id.edLoginEmail);
        btnLogin = findViewById(R.id.btnLogin);
        btnYandexLogin = findViewById(R.id.btnLoginYandex);


        edLoginEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (android.util.Patterns.EMAIL_ADDRESS.matcher(edLoginEmail.getText().toString()).matches()) {
                    btnLogin.setEnabled(true);
                    btnLogin.setBackgroundColor(getColor(R.color.button_enabled_true));
                } else {
                    btnLogin.setEnabled(false);
                    btnLogin.setBackgroundColor(getColor(R.color.button_enabled_false));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });

        btnYandexLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "В разработке!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void login() {
        if (edLoginEmail.getText().toString().contains("@") && edLoginEmail.getText().toString().length() > 1) {

            if(edLoginEmail.getText().toString().equals("example@mail.ru")) {
                Intent intent = new Intent(LoginActivity.this, LoginPasswordActivity.class);
                startActivity(intent);
            } else {
                Toast.makeText(this, "Не та почта!", Toast.LENGTH_SHORT).show();
            }


        } else {
            Toast.makeText(this, "Неправильный адрес!", Toast.LENGTH_SHORT).show();
        }
    }
}