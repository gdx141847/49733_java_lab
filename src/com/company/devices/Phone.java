package com.company.devices;

public class Phone extends Device {

    String operationSystem;
    Double screenSize;


    String getOSVersion() {
        return "5.32.1";
    }
    public String toString(){
        return producer+" "+model+" "+operationSystem+" "+screenSize+" "+yearOfProduction;
    }
    public void turnOn(){
        System.out.println("It's working!!!");
    }
}
