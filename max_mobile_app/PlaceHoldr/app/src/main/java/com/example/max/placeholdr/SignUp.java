package com.example.max.placeholdr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.regex.Pattern;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

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

                EditText firstName = findViewById(R.id.firstName);
                String fname = firstName.getText().toString();

                EditText lastName = findViewById(R.id.lastName);
                String lname = lastName.getText().toString();

                EditText e = findViewById(R.id.email);
                String email = e.getText().toString();

                TextView errorMessage = findViewById(R.id.errorMessage);
                TextView errorMessage2 = findViewById(R.id.errorMessage2);
                TextView errorMessage3 = findViewById(R.id.errorMessage3);
                TextView errorMessage4 = findViewById(R.id.errorMessage4);

                if(!password.equals(passwordConfirm))
                {
                    errorMessage2.setVisibility(View.INVISIBLE);
                    errorMessage3.setVisibility(View.INVISIBLE);
                    errorMessage4.setVisibility(View.INVISIBLE);
                    errorMessage.setVisibility(View.VISIBLE); //Passwords must match
                }
                else if(password.length()<8)
                {
                    errorMessage.setVisibility(View.INVISIBLE);
                    errorMessage3.setVisibility(View.INVISIBLE);
                    errorMessage4.setVisibility(View.INVISIBLE);
                    errorMessage2.setVisibility(View.VISIBLE); //Password must be at least 8 characters
                }
                else if(fname.isEmpty() || lname.isEmpty())
                {
                    errorMessage.setVisibility(View.INVISIBLE);
                    errorMessage2.setVisibility(View.INVISIBLE);
                    errorMessage4.setVisibility(View.INVISIBLE);
                    errorMessage3.setVisibility(View.VISIBLE); //First and last name fields are required.
                }
                else if(!isValidEmailAddress(email))
                {
                    errorMessage.setVisibility(View.INVISIBLE);
                    errorMessage2.setVisibility(View.INVISIBLE);
                    errorMessage3.setVisibility(View.INVISIBLE);
                    errorMessage4.setVisibility(View.VISIBLE); //Must be a valid email address
                }
                else
                {
                    errorMessage.setVisibility(View.INVISIBLE);
                    errorMessage2.setVisibility(View.INVISIBLE);

                    ListItem newUser = new ListItem(fname, lname, email, password, 'M', 20);


                    openHomeActivity(newUser);
                }

            }

        });

    }

    public void openHomeActivity(ListItem newUser)
    {
        Intent i = new Intent(this, Home.class);

        i.putExtra("user", newUser);

        startActivity(i);
    }


     public static boolean isValidEmailAddress(String email) {
        boolean result = true;
        try {
            InternetAddress emailAddr = new InternetAddress(email);
            emailAddr.validate();
        } catch (AddressException ex) {
            result = false;
        }
        return result;
    }





}
