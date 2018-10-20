package com.example.max.placeholdr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Listings2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listings2);

        ListItem user1 = new ListItem("John", "Doe",23, 'M');
        ListItem user2 = new ListItem("Max", "Hansen",20, 'M');
        ListItem user3 = new ListItem("Jane", "Doe",19, 'F');
        ListItem user4 = new ListItem("Mary", "Twen",25, 'M');

        ListItem user5 = new ListItem('F');
        ListItem user6 = new ListItem('F');
        ListItem user7 = new ListItem('M');
        ListItem user8 = new ListItem('M');

        ListItem[] mainList = {user1, user2, user3, user4, user5, user6, user7, user8};

        ListAdapter mainAdapter = new ArrayAdapter<ListItem>(this, android.R.layout.simple_list_item_1, mainList);
        ListView mainListView = (ListView) findViewById(R.id.mainList2);
        mainListView.setAdapter(mainAdapter);





    }
}
