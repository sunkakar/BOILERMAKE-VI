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


        ListItem user1 = new ListItem("Max", "Hansen", "hansenmax@live.com", "12341234", 'M', 20);
        ListItem user2 = new ListItem("Jane", "Smith","email1@email.com", "12341234", 'F',22);
        ListItem user3 = new ListItem("Mick", "Jones","email2@email.com", "12341234", 'M', 19);
        ListItem user4 = new ListItem("Bob", "Ross","email3@email.com", "12341234", 'M', 54);

        final ListItem[] allUsers = {user1, user2, user3, user4};







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
                openSignInActivity(allUsers);
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

    public void openSignInActivity(ListItem[] allUsers)
    {
        Intent intent = new Intent();

            intent.putExtra("userList", allUsers);

            intent = new Intent(this, signIn.class);

        startActivity(intent);
    }

}
