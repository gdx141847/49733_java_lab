package com.company.devices;
import com.company.Human;
import com.company.Sellable;


import java.util.ArrayList;
import java.util.Objects;


public abstract class Car extends Device implements Sellable, Comparable {


    private double engineCapacity;
    private String color;


    public static ArrayList<String> ownerList = new ArrayList();







    public Car(String producer, String model, double engineCapacity, String color, double value,int yearOfProduction) {

        this.producer = producer;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.color = color;
        this.value = value;
        this.yearOfProduction = yearOfProduction;

    }



    public void turnOn() {
        System.out.println("It's working!!!");
    }

    public abstract void refuel();





    /*@Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        Car car = (Car) o;
        return model == car.model && engineCapacity == car.engineCapacity &&
               color == car.color && value == car.value &&
                producer.equals(car.producer);
        }*/
    public String toString() {
        return producer + " " + model + " " + engineCapacity + " " + color + " " + value + " " + yearOfProduction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineCapacity, engineCapacity) == 0 && color.equals(car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineCapacity, color);
    }

    @Override
    public void sell(Human seller, Human buyer, double prize) throws Exception {
        if (containsCar(seller)) {
            System.out.println("Mam samochód na sprzedaż!");
            if(containsEmptySpot(buyer)){
                if(checkBuyerCash(buyer,buyer.getCash()));
                    seller.removeCar(this);
                    buyer.addCar(this);
                    transferCash(buyer, seller);
                    System.out.print("Sukces! Sprzedane!");
                    System.out.println();
                    


                } else{
                throw new Exception("Nie mam miejsca w garażu");
            }
        } else {
            throw new Exception("Nie mam samochodu do sprzedania.");
        }

    }

    private boolean checkBuyerCash(Human buyer,double cash) throws Exception{
        if(buyer.getCash() >= value){
            return true;

        }else{
            throw new Exception("Nie masz wystarczającej gotówki");
        }
    }

    private void transferCash(Human buyer, Human seller) {
        seller.setCash(seller.getCash() + value);
        buyer.setCash(buyer.getCash() - value);
    }


    private boolean containsCar(Human seller){
        for (Car car:seller.getGarage()) {
            if(car != null){
                return true;
            }

        }
        return false;

    }
    private boolean containsEmptySpot(Human buyer){
        for (Car car:buyer.getGarage()) {
            if(car == null){
                return true;
            }
        }
        return false;
    }

    private Car searchCar(Car[] garage, double cash) {
        for (Car car:garage) {
            if(car.getValue() <= cash){
                return car;
            }
        }
        return null;
    }

}