package com.example.max.placeholdr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity{

    private Button houseButton2;
    private Button personButton2;
    private Button signOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        personButton2 = findViewById(R.id.personButton);
        personButton2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openListingActivity("LFR");
            }

        });



        houseButton2 = findViewById(R.id.houseButton);
        houseButton2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openListingActivity("LFH");
            }
        });

        signOut = findViewById(R.id.signOut);
        signOut.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openDefaultActivity();
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

    public void openDefaultActivity()
    {
        startActivity(new Intent(this, Default.class));
    }


}
