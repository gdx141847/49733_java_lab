package com.company;

public class Car {
    private String producer;
    private String model;
    private Double engineCapacity;
    private String color;
    private  Double value;


public Car(String producer,String model, Double engineCapacity, String color, Double value ){
    this.producer = producer;
    this.model = model;
    this.engineCapacity = engineCapacity;
    this.color = color;
    this.value = value;
}

@Override
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
    }
public String toString(){
    return producer+" "+model+" "+engineCapacity+" "+color+" "+value;
}

}