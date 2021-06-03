package com.company.devices;

abstract public class Device  {
    public String producer;
    public String model;
    public Integer yearOfProduction;

    abstract void turnOn();

    public String toString(){
        return producer+" "+model+" "+yearOfProduction;
    }


}

