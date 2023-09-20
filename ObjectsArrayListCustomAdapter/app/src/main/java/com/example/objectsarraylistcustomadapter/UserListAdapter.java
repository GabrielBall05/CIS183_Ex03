package com.example.objectsarraylistcustomadapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class UserListAdapter extends BaseAdapter
{
    Context context;
    ArrayList<User> listOfUsers;

    //Overloaded Constructor
    public UserListAdapter(Context c, ArrayList<User> ls)
    {
        //Passed to the class from MainActivity.java
        context = c;
        listOfUsers = ls;
    }

    //Prebuilt functions that you need to change to do what you want it to do
    @Override
    public int getCount()
    {
        //Return size of the arrayList
        return listOfUsers.size();
    }

    @Override
    public Object getItem(int i)
    {
        return listOfUsers.get(i);
    }

    @Override
    public long getItemId(int i)
    {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        if(view == null)
        {
            LayoutInflater mInflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            view = mInflater.inflate(R.layout.custom_cell, null);
        }

        //Find the GUI elements in my custom_cell
        //Must have view.find... here
        TextView name = view.findViewById(R.id.tv_v_customCell_name);
        TextView email = view.findViewById(R.id.tv_v_customCell_email);

        //Get the user at position i (i is passed to this function)
        User user = listOfUsers.get(i);

        //Set the GUI for the custom_cell.xml
        name.setText(user.getlName() + ", " + user.getfName());
        email.setText(user.getEmail());

        //Return the view we created
        return view;
    }
}
