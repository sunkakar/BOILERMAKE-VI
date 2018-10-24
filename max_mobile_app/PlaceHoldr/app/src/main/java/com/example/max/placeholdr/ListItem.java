package com.example.max.placeholdr;

import android.media.Image;
import android.support.annotation.NonNull;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.io.File;
import java.io.IOException;

public class ListItem implements Serializable {

    ListItem(String f, String l, String type, int rent, String address) //Ideal for looking for roommate
    {
        fname = f;
        lname = l;
        this.rent = rent;
        this.type = type;
        this.address = address;
        lf = 'R';
        email = null;
        password = null;
        File test = new File("drawable/beo.jpg");
       // image = test;
       // iv.setImageResource(R.drawable.apple);

    }

    ListItem(String f, String l, int a, char g) //Ideal for looking for housing
    {
        fname = f;
        lname = l;
        age = a;
        gender = g;
        lf = 'H';
        email = null;
        password = null;
    }

    ListItem(String f, String l, String e, String p, char g, int a) //For fresh sign-ups
    {
        fname = f;
        lname = l;
        email = e;
        password = p;
        gender = g;
        age = a;
        email = null;
        password = null;
    }


    ListItem(int j) //default for LFR
    {
        fname = "FirstName";
        lname = "LastName";
        type = "Apartment";
        rent = 1000;
        address = "456 Generic Dr.";
        lf = 'R';
        age = 20;
        email = null;
        password = null;
    }

    ListItem(char g) //default for LFH
    {
        fname = "FirstName";
        lname = "LastName";
        age = 18;
        gender = g;
        lf = 'H';
        email = null;
        password = null;
    }

    private String fname;
    private String lname;
    private char gender;
    private int age;
    private String type;
    private int rent;
    private String address;
    private char lf;
    private String email;
    private String password;
    private Image image;


    public String toString()
    {
        if(lf == 'R')
        {
            return type + "\n\n" + "$/month: $" + rent + "\n\n" + address;
        }
        else
        {
            return fname + " " + lname + "\n\n" + age + ", " + gender;
        }
    }

    public void setPassword(String p)
    {
        this.password = p;
    }

    public void setEmail(String e)
    {
        this.email = e;
    }

    public String getName()
    {
        return fname + " " + lname;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPassword()
    {
        return password;
    }

    public Image getImage()
    {
        return image;
    }

}
