package com.company;
import java.util.Date;

public class Human {
    String firstName;
    String lastName;
    String sex;
    Integer age;

    Phone mobilePhone;

    Animal pet;

    Car vehicle;

    private Double salary;

    public Double getSalary(){
        Date nowDate = new Date();
        System.out.println("Informacje o Twoich zarobkach były pobierane " + nowDate +" Toja wyplata wynosiła "+ this.salary*0.75);

        return this.salary;

    }
    public void setSalary(Double salary){
            if(salary <= 0.0){
                System.out.println("nieprawidlowa wartosc");
            }else{

                System.out.println("Nowe dane zostały wysłane do systemu księgowego");
                System.out.println("Proszę odebrać aneks do umowy z działu kadr");
                System.out.println("ZUS i US zostały poinformowane o zmianie wynagrodzenia");
                this.salary = salary;
        }

    }


}

