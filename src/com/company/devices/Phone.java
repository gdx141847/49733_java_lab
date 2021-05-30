package com.company.devices;

public class Phone {
    public String producer;
    public String model;
    String operationSystem;
    Double screenSize;


    String getOSVersion() {
        return "5.32.1";
    }
    public String toString(){
        return producer+" "+model+" "+operationSystem+" "+screenSize;
    }
}
