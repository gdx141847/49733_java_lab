package com.company;
import com.company.devices.Phone;



public class Application extends Phone {
    private String name;
    private String version;
    private Double prize;

    public Application(){}

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Double getPrize() {
        return prize;
    }

    public void setPrize(Double prize) {
        this.prize = prize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Application(String name, String version, Double prize) {
        this.name = name;
        this.version = version;
        this.prize = prize;
    }



    public String toString() {
        return name + " " + version + " " + prize;
    }


}
