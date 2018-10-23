package com.example.max.placeholdr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {

    private Button submitButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        submitButton = findViewById(R.id.submit);
        submitButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                EditText passwordText = findViewById(R.id.password);
                String password = passwordText.getText().toString();

                EditText confirmText = findViewById(R.id.passwordConfirm);
                String passwordConfirm = confirmText.getText().toString();

                TextView errorMessage = findViewById(R.id.errorMessage);

                if(!password.equals(passwordConfirm) || password.length()<9)
                {
                    errorMessage.setVisibility(View.VISIBLE);
                }
                else
                {
                    openHomeActivity();
                }

            }

        });

    }

    public void openHomeActivity()
    {
        startActivity(new Intent(this, Home.class));
    }








}
