package com.example.max.placeholdr;

public class ListItem {

    ListItem(String f, String l, String type, int rent, String address) //Ideal for looking for roommate
    {
        fname = f;
        lname = l;
        this.rent = rent;
        this.type = type;
        this.address = address;
        lf = 'R';
    }

    ListItem(String f, String l, int a, char g) //Ideal for looking for housing
    {
        fname = f;
        lname = l;
        age = a;
        gender = g;
        lf = 'H';
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
    }

    ListItem(char g) //default for LFH
    {
        fname = "FirstName";
        lname = "LastName";
        age = 18;
        gender = g;
        lf = 'H';
    }

    private String fname;
    private String lname;
    private char gender;
    private int age;
    private String type;
    private int rent;
    private String address;
    private char lf;

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


}
