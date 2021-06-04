package com.company.devices;

import com.company.Human;
import com.company.Sellable;


public class Phone extends Device implements Sellable {

    public String operationSystem;
    public Double screenSize;


    String getOSVersion() {
        return "5.32.1";
    }

    public String toString() {
        return producer + " " + model + " " + operationSystem + " " + screenSize + " " + yearOfProduction;
    }

    public void turnOn() {
        System.out.println("It's working!!!");
    }

    @Override
    public void sell(Human seller, Human buyer, Double prize) {
        if (seller.mobilePhone != null) {
            System.out.println("Mam telefon do sprzedania!");
        } else {
            System.out.println("Nie mam telefonu do sprzedania.");
        }
    }
}







