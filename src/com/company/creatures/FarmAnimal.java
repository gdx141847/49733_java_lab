package com.company.creatures;

import java.io.File;

public class FarmAnimal extends Animal implements Edbile {

    FarmAnimal(String name, Double weight, String species, File pic) {
        super(name, weight,species,pic);
    }
    public void beEaten(){
        System.out.println("można jeść");
    }
}
