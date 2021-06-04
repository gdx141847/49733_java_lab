package com.company.devices;
import com.company.Human;
import com.company.Sellable;
import java.util.List;


public class Phone extends Device implements Sellable {

    public String operationSystem;
    public Double screenSize;

    static final public String servAdd = "www.javaApp.com";
    static final public String protocol = "https";
    static final public String version = "1.01.01";


    String getOSVersion() {
        return "5.32.1";
    }

    public String toString() {
        return producer + " " + model + " " + operationSystem + " " + screenSize + " " + yearOfProduction;
    }

    public void turnOn() {
        System.out.println("It's working!!!");
    }

    public void installAnnApp(String appName){

    }
    public void installAnnApp(String appName,String appVersion){

    }
    public void installAnnApp(String appName,String appVersion,String appUrl){

    }
    public void installAnnApp(List appList){

    }
    public void installAnnApp(Url url){

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







