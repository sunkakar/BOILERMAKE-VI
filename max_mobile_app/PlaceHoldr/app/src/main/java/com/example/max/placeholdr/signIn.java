package com.example.max.placeholdr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signIn extends AppCompatActivity {


    private Button submitButton;
    private Button signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        submitButton = findViewById(R.id.submit);
        submitButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //Some form of authentication required.
               openHomeActivity();
            }

        });

        signUpButton = findViewById(R.id.signUp);
        signUpButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                openSignUpActivity();
            }

        });

    }

    public void openSignUpActivity()
    {
        //Intent intent = new Intent();

        Intent intent = new Intent(this, SignUp.class);

        startActivity(intent);
    }

    public void openHomeActivity()
    {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }


}
