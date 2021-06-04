package com.company.devices;

public class LPG extends Car{
    public LPG(String producer, String model, Double engineCapacity, String color, Double value,Integer yearOfProduction ){
        super(producer,model,engineCapacity,color,value,yearOfProduction);
    }
    @Override
    public void refuel() {
        System.out.println("tankowanie");

    }
}
