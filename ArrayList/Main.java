package com.company.ArrayList;

public class Main {
    public static void main(String[] args){
        GroceryList growwceryList=new GroceryList();
        growwceryList.addGroceryItem("Apple");
        growwceryList.printGroceryList();
        growwceryList.modifyGroceryItem(0, "Banana");
        growwceryList.printGroceryList();
        growwceryList.removeGroceryItem(0);
        growwceryList.printGroceryList();
    }
}
