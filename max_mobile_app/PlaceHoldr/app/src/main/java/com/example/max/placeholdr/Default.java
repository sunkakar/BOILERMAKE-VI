package com.example.max.placeholdr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Default extends AppCompatActivity{

    private Button houseButton;
    private Button personButton;
    private Button signInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default);


        personButton = findViewById(R.id.personButton);
        personButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openListingActivity("LFR");
            }

        });

        signInButton = findViewById(R.id.signIn);
        signInButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openSignInActivity();
            }

        });


        houseButton = findViewById(R.id.houseButton);
        houseButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openListingActivity("LFH");
            }
        });
    }

    public void openListingActivity(String lf)
    {
       Intent intent = new Intent();
        if(lf.equals("LFH"))
        {
            intent = new Intent(this, Listings.class);
        }
        else if(lf.equals("LFR"))
        {
            intent = new Intent(this, Listings2.class);
        }
        startActivity(intent);
    }

    public void openSignInActivity()
    {
        Intent intent = new Intent();


            intent = new Intent(this, signIn.class);

        startActivity(intent);
    }

}
