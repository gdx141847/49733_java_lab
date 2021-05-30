package com.company;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        /*Animal dog = new Animal("canis familiaris");
        dog.name = "Szarik";*/




        //Animal cat = new Animal();
        //cat.name = "Puszek";
        //cat.weight = 2.0;

        //System.out.println("dog name = " + dog.name);
        //System.out.println("dog weight = " + dog.weight);

        //Phone iphone = new Phone();
        //iphone.producer = "apple";
        //iphone.model = "6s";

        Phone s20 = new Phone();
        s20.producer = "Samsung";
        s20.model = "s20";
        s20.yearOfProduction = 2020;




        /*Human human = new Human();
        human.firstName = "Artur";
        human.lastName = "Bienkiewicz";
        human.sex = "male";
        human.age = 43;


        //String version = iphone.getOSVersion();

        //System.out.println(iphone.getOSVersion());
        //System.out.println(version);

        //human.mobilePhone = iphone;*/

        /*int a = 3;
        Integer b =3;
        long c;
        Long cc;
        float d;
        Float dd;
        double z;
        Double zz;
        boolean n;
        Boolean nn;
        byte x;
        Byte xx;
        short s;
        Short ss;
        char l;
        Character ll;

         */
        /*dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();*/

        //Car myCar = new Car();
        //myCar.engineCapacity = 1.2;
        //myCar.color = "Red";
        //human.vehicle = myCar;
        //myCar.value = 50000.0;


        //human.setSalary(6200.0);
        //human.getSalary();

        //human.setValue(70000.0);
        //System.out.println(new Car("Fiat", "Punto", 1.2,"Red",3000.0)
                //.equals(new Car("Fiat", "Punto", 1.2,"Red",3000.0)));

        Car myCar = new Car("Fiat","Punto",1.2,"Red",3500.0,1999);
        //Car myCar2 = new Car("Fiat","Punto",1.2,"Red",3500.0);


        System.out.println(myCar);
        myCar.turnOn();
        System.out.println(s20);
        s20.turnOn();

    }
}
