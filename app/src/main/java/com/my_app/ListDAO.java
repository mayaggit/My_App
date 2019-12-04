package com.my_app;

import android.graphics.Bitmap;

import java.util.ArrayList;
import java.util.List;

public class ListDAO {

    public ListDAO(){
       /* List user_lists = new List <List<Item>>;
        List list_pointer = user_lists;*/
    }

    //מציאת כל הרשימות ששייכות למספר טלפון מסויים.
   /* public list <list<Item>> get_lists (String phoneNumber)
    {
        String number = phoneNumber;
       if( list.number_there())
       {
           list_pointer=list<item>;
       }
    }*/

   //return the grocery list name
   public List<NameIdPair> getGroceryNames()
   {
//הפעולה אמורה להחזיר סטרינג
       List<NameIdPair> list=new ArrayList<NameIdPair>(){{
           add(new NameIdPair("super1", 1));
           add(new NameIdPair("super2", 1));
           add(new NameIdPair("super3", 1));
       }};

       return list;
       // TODO
   }

   // print all items of a specific list
   public List<Item> getItems (int id){
       return  null;
       //ToDo
   }

   // add a new shopping list
   public void addGocery (String name, List<User> users){

   }

   //add an item to a specific list
    public void  addItem (String name, String description, Bitmap photo){

    }

    // display item as strikethrough
    public  void strikthroughItem (){}

    // delete item from a list
    public void deleteItem (){}
}
