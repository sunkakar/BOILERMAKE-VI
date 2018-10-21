package com.example.max.placeholdr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Listings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listings);

        ListItem user1 = new ListItem("John", "Doe","Apartment", 250, "1234 Happy St.");
        ListItem user2 = new ListItem("Jane", "Smith","House", 500, "4321 Sad St.");
        ListItem user3 = new ListItem("Mick", "Jones","Closet", 15, "4545 Lonely Ln.");
        ListItem user4 = new ListItem("Bob", "Ross","Apartment", 385, "205 S Martin Jischke Dr");
        ListItem user5 = new ListItem(1);
        ListItem user6 = new ListItem(1);
        ListItem user7 = new ListItem(1);
        ListItem user8 = new ListItem(1);

        ListItem[] mainList = {user1, user2, user3, user4, user5, user6, user7, user8};

        ListAdapter mainAdapter = new ArrayAdapter<ListItem>(this, android.R.layout.simple_list_item_1, mainList);
        ListView mainListView = (ListView) findViewById(R.id.mainList);
        mainListView.setAdapter(mainAdapter);


    }
}
