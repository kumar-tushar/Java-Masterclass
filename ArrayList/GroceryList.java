package com.company.ArrayList;

import java.util.ArrayList;

public class GroceryList {
    private final ArrayList<String> groceryList=new ArrayList<>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        for (String s : groceryList) {
            System.out.println(s);
        }
    }

    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
    }

    public void removeGroceryItem(int position){
        groceryList.remove(position);
    }

}
