package com.example.objectsarraylistcustomadapter;

public class User
{
    //First name, last name, email
    private String fName;
    private String lName;
    private String email;


    //Constructor
    public User()
    {

    }

    //Overloaded Constructor
    public User(String f, String l, String e)
    {
        fName = f;
        lName = l;
        email = e;
    }

    //Getters and Setters
    public String getfName()
    {
        return fName;
    }

    public void setfName(String f)
    {
        fName = f;
    }

    public String getlName()
    {
        return lName;
    }

    public void setlName(String l)
    {
        this.lName = l;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String e)
    {
        this.email = e;
    }
}
