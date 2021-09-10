package com.company.devices;

public class Electric extends Car implements Comparable{
    public Electric(String producer, String model, double engineCapacity, String color, Double value,Integer yearOfProduction ){
        super(producer,model,engineCapacity,color,value,yearOfProduction);
    }
    @Override
    public void refuel() {
        System.out.println("tankowanie");

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
