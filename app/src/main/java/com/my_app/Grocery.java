package com.my_app;

import java.util.List;

public class Grocery {
   private List<Item> items;
   private String name;
   private List<User> users;
   private int id;

    public Grocery( String name, List<User> users) {
        this.name = name;
        this.users = users;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
