package com.company.devices;

public class Diesel extends Car{
    public Diesel(String producer, String model, Double engineCapacity, String color, Double value,Integer yearOfProduction ){
        super(producer,model,engineCapacity,color,value,yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("tankowanie");

    }
}
