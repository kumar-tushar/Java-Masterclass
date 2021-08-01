package com.company.OOP.Car;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model){
        if( model.equals("Cayenne") || model.equals("Commodore") )
            this.model=model;
        else
            this.model="Unknown Model";
    }


    public String getModel() {
        return this.model;
    }

}
