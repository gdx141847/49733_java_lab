package com.company.creatures;
import com.company.Human;
import com.company.Sellable;
import java.io.File;

public abstract class Animal implements Sellable,Feedable{
    String name;
    Double weight;
    String species;
    File pic;




    //static final public Double DEFAULT_ANIMAL_WEIGHT = 1.0;

    Animal(String species) {
        this.species = species;

        switch (this.species) {
            case "canis familiaris":
                this.weight = 10.0;
            case " feline":
                this.weight = 2.0;
            default:
                this.weight = 1.0;
        }

        if (this.species == "canis familiaris") {
            this.weight = 10.0;
        } else if (this.species == "feline") {
            this.weight = 2.0;
        } else {
            this.weight = 1.0;
        }
    }

    public Animal(String name, Double weight, String species, File pic) {
        this.name = name;
        this.weight = weight;
        this.species = species;
        this.pic = pic;
    }

    @Override
    public void feed() {
        this.weight += 1;
        System.out.println("thx for food :D");
    }
    @Override
    public void feed(Double foodWeight){

    }

    void takeForAWalk() {
        this.weight -= 1;
        if (this.weight == 0) {
            System.out.println("Your pet is dead !!!");
        }

    }

    public String toString() {
        return name + " " + weight + " " + species + " " + pic;
    }

    @Override
    public void sell(Human seller, Human buyer, double prize)
    {
        if (seller.getPet() != null) {
            System.out.println("Mam psa na sprzedaż!");
        } else {
            System.out.println("Nie mam psa do sprzedania.");
        }
    }


}


