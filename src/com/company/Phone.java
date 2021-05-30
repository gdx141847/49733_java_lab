package com.company;

public class Phone {
    String producer;
    String model;
    String operationSystem;
    Double screenSize;


    String getOSVersion() {
        return "5.32.1";
    }
    public String toString(){
        return producer+" "+model+" "+operationSystem+" "+screenSize;
    }
}
