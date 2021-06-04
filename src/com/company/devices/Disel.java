package com.company.devices;

public class Disel extends Car{
    public Disel(String producer, String model, Double engineCapacity, String color, Double value,Integer yearOfProduction ){
        super(producer,model,engineCapacity,color,value,yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("tankowanie");

    }
}
