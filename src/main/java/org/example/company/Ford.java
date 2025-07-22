package org.example.company;

public class Ford extends Car{


    public Ford(int cylinders ,String name) {
        super(cylinders, name);
    }



    @Override
    public String startEngine() {
        return getName() + " engine started";
    }

    @Override
    public String accelerate() {
        return getName() + " is accelerating";
    }

    @Override
    public String brake() {
        return getName() + " is braking";
    }
}
