package com.company;
import java.io.File;

public class Animal {
    String name;
    private Double weight;
    final String species;
    File pic;

    //static final public Double DEFAULT_ANIMAL_WEIGHT = 1.0;

    Animal(String species){
        this.species = species;

        switch(this.species){
            case "canis familiaris":this.weight=10.0;
            case " feline":this.weight=2.0;
            default:this.weight =1.0;
        }

        if(this.species == "canis familiaris"){
            this.weight = 10.0;
        }else if(this.species == "feline"){
            this.weight=2.0;
        }else{
            this.weight =1.0;
        }
    }

    void feed() {
        this.weight += 1;
        System.out.println("thx for food :D");
    }

    void takeForAWalk() {
        this.weight -= 1;
        if (this.weight == 0) {
            System.out.println("Your pet is dead !!!");
        }

    }
public String toString(){
        return name+" "+weight+" "+species+" "+pic;
}
}


