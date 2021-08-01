package com.company.OOP.Car;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;


    public Car() {
        this(4,4,"Cayenne", "3996 CC", "white");  // Constructor calling Third constructor with all default parameters
    }

    public Car(String model, String engine, String colour) {
        this(4,4,model, engine, colour);          // Constructor calling Third constructor with two default parameters
    }

    public Car(int doors, int wheels, String model, String engine, String colour) {
        this.doors = doors;
        this.wheels = wheels;
        this.model = model;
        this.engine = engine;
        this.colour = colour;
    }

    public void setModel(String model){
        if( model.equals("Cayenne") || model.equals("Commodore") )
            this.model=model;
        else
            this.model="Unknown Model";
    }

    public String getModel() {
        return this.model;
    }


    public String getColour(){
        return this.colour;
    }

}
