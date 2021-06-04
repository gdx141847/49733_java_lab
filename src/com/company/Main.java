package com.company;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args)  {

        //Animal cat = new Animal();
        //cat.name = "Puszek";
        //cat.weight = 2.0;

        //System.out.println("dog name = " + dog.name);
        //System.out.println("dog weight = " + dog.weight);

        //Phone iphone = new Phone();
        //iphone.producer = "apple";
        //iphone.model = "6s";

        Human human = new Human();
        human.firstName = "Artur";
        human.lastName = "Bienkiewicz";
        human.sex = "male";
        human.age = 43;
        human.cash = 0.0;


        Phone s20 = new Phone();
        s20.producer = "Samsung";
        s20.model = "s20";
        s20.operationSystem = "Android";
        s20.screenSize = 6.2;
        s20.yearOfProduction = 2020;
        human.mobilePhone = s20;


        Pet dog = new Pet("Szarik",10.0,"canis familiaris",null);
        //dog.name = "Szarik";
        //human.pet = dog;


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

        /*Car myCar = new Car();
        myCar.producer = "Fiat";
        myCar.model = "Punto";
        myCar.engineCapacity = 1.2;
        myCar.color = "Red";
        human.vehicle = myCar;
        myCar.value = 5000.0;
        myCar.yearOfProduction = 1999;

        Human seller = new Human();
        seller.vehicle = myCar;
        seller.pet = null;
        seller.mobilePhone = s20;
        seller.cash = 0.0;
        Sellable sellable = seller;


        Human buyer = new Human();
        buyer.vehicle = null;
        buyer.cash = 10000.0;
        Sellable sellable1 = buyer;*/


        //human.setSalary(6200.0);
        //human.getSalary();

        //human.setValue(70000.0);
        //System.out.println(new Car("Fiat", "Punto", 1.2,"Red",3000.0)
                //.equals(new Car("Fiat", "Punto", 1.2,"Red",3000.0)));

        //Car myCar = new Car("Fiat","Punto",1.2,"Red",3500.0,1999);
        //Car myCar2 = new Car("Fiat","Punto",1.2,"Red",3500.0);



        //System.out.println(myCar);
        //System.out.println(dog);
        //System.out.println(s20);
        //myCar.turnOn();
        /*System.out.println(s20);
        s20.turnOn();*/
        //sellable.sell(seller,buyer,1000.0);
        /*System.out.println(buyer.cash);
        System.out.println(seller.cash);
        System.out.println(buyer.vehicle);
        System.out.println(seller.vehicle);*/

        System.out.println(dog);








    }
}
