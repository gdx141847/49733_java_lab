package com.company.devices;

import com.company.Human;
import com.company.Sellable;


public class Car extends Device implements Sellable {

    public Double engineCapacity;
    public String color;
    public  Double value;



public Car(/*String producer, String model, Double engineCapacity, String color, Double value,Integer yearOfProduction*/){
    this.producer = producer;
    this.model = model;
    this.engineCapacity = engineCapacity;
    this.color = color;
    this.value = value;
    this.yearOfProduction = yearOfProduction;
}




    public void turnOn(){
    System.out.println("It's working!!!");
}


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
public String toString(){
    return producer+" "+model+" "+engineCapacity+" "+color+" "+value+" "+yearOfProduction;
}
@Override
public void sell(Human seller, Human buyer, Double prize){



    }

}