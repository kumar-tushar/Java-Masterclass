package com.company.OOP.ClassAndConstructor;

public class Main {

    public static void main(String[] args){

        Car porsche=new Car();
        System.out.println(porsche.getModel());
        System.out.println(porsche.getColour());
        porsche.setModel("Commodore");
        System.out.println(porsche.getModel());
    }
}
