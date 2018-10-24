package com.example.max.placeholdr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class signIn extends AppCompatActivity {


    private Button submitButton;
    private Button signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        final ListItem[] allUsers = (ListItem[]) getIntent().getSerializableExtra("userList");


        submitButton = findViewById(R.id.submit);
        submitButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                TextView email1 = findViewById(R.id.email);
                TextView password1 = findViewById(R.id.password);
                TextView error1 = findViewById(R.id.error1);

                String email = email1.getText().toString();
                String password = password1.getText().toString();


                //Some form of authentication required.

               /* for(int i = 0; i < allUsers.length; i++)
                {
                    if(email.equals(allUsers[i].getEmail()) && password.equals(allUsers[i].getPassword()))
                    {
                        openHomeActivity(allUsers[i]);
                    }
                }*/

                error1.setVisibility(View.VISIBLE);
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

    public void openHomeActivity(ListItem user)
    {
        Intent i = new Intent(this, Home.class);

       i.putExtra("user", user);

        startActivity(i);
    }


}
