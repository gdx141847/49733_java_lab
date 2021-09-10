package com.company.devices;
import com.company.Sellable;

abstract public class Device implements Sellable{
    public String producer;
    public String model;
    public Integer yearOfProduction;
    public double value;

    public abstract void turnOn();

    public double getValue() {
        return value;
    }

    public String toString() {
        return producer + " " + model + " " + yearOfProduction;
    }
}




