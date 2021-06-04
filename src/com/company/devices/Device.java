package com.company.devices;

import com.company.Sellable;

abstract public class Device implements Sellable {
    public String producer;
    public String model;
    public Integer yearOfProduction;

    abstract void turnOn();

    public String toString(){
        return producer+" "+model+" "+yearOfProduction;
    }


}

