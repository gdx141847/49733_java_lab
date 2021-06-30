package com.company;
import com.company.devices.Phone;



public class Application extends Phone {
    public String name;
    public String version;
    public Double prize;

    public Application(){}


    public Application(String name,String version,Double prize) {
        this.name = name;
        this.version = version;
        this.prize = prize;
    }



    public String toString() {
        return name + " " + version + " " + prize;
    }


}
