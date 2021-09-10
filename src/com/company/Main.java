package com.company;
import com.company.devices.Car;
import com.company.devices.Diesel;
import com.company.devices.Electric;
import com.company.devices.LPG;
import java.util.Arrays;
import java.util.Comparator;


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
        human.setFirstName("Artur");
        human.setLastName("Bienkiewicz");
        human.setSex("male");
        human.setAge(43);
        human.setCash(0.0);




        /*Phone s20 = new Phone();
        s20.producer = "Samsung";
        s20.model = "s20";
        s20.operationSystem = "Android";
        s20.screenSize = 6.2;
        s20.yearOfProduction = 2020;
        human.mobilePhone = s20;


        Pet dog = new Pet("Szarik",10.0,"canis familiaris",null);*/
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
        myCar.yearOfProduction = 1999;*/






//        Human seller = new Human();
//        seller. = new Car[]{lpg,diesel,electric};
//        seller.pet = null;
//        seller.mobilePhone = null;
//        seller.cash = 0.0;
//        Sellable sellable = seller;
//        seller.garage.length = human.garage.length;



//        Human buyer = new Human();
//        //buyer.vehicle = null;
//        buyer.cash = 10000.0;
//        Sellable sellable1 = buyer;
//        //buyer.garage = ;
//
//        Human person = new Human("Adam","Kowalski","Male",34,5000.0,new Car[3]);


        //human.setSalary(6200.0);
        //human.getSalary();

        //human.setValue(70000.0);
        //System.out.println(new Car("Fiat", "Punto", 1.2,"Red",3000.0)
                //.equals(new Car("Fiat", "Punto", 1.2,"Red",3000.0)));




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
        System.out.println(seller.vehicle);

        System.out.println(dog);*/
        /*System.out.println(lpg);
        lpg.refuel();*/


//        System.out.println(Arrays.toString(human.garage));
//        System.out.println(Arrays.toString(seller.garage));
//        System.out.println(Arrays.toString(buyer.garage));
////
//        System.out.println(human.garage.length);

//        Arrays.sort(seller.garage);
//        System.out.println(Arrays.toString(seller.garage));

//        human.garageValue(seller.garage);





//        System.out.println(Car.ownerList);
//
//        Application app = new Application();
//        app.name = "wsb extranet";
//        app.version = "10.01.20.01";
//        app.prize = 59.9;
//
//        System.out.println(app);

        Car car = new LPG("Fiat","Punto",1.2,"blue",2100.0,2005);
        Car car2 = new Diesel("Volkswagen","Passat",1.9,"Silver",3200.0,1999);
        Car car3 = new Electric("Smart","Fortwo",0.0,"White",10500.0,2015);

        Human seller = new Human("Jurek", "Kowalski", "male",43,2500.0,3);
        seller.setCar(0,car);
        seller.setCar(1,car2);
        seller.setCar(2,car3);
        Human buyer = new Human("Marek", "Nowak", "male",55,2900.0,3);

        System.out.println("Wartość garażu sprzedającego = "+ seller.garageValue());
        System.out.println("Wartość garażu kupującego = "+ buyer.garageValue());
        System.out.println();
        System.out.println("Garaż przed sortowaniem");
        System.out.println(Arrays.toString(seller.getGarage()));
        seller.sortCars();
        System.out.println("Garaż po sortowaniu");
        System.out.println(Arrays.toString(seller.getGarage()));
        System.out.println();
        System.out.println("garaż sprzedającego przed tranzakcją: " + seller);
        System.out.println("garaż kupującego przed tranzakcją: " + buyer);
        System.out.println();
       try{
           car.sell(seller,buyer,2100);
       }catch(Exception e){
           System.out.println(e.getMessage());
       }
        System.out.println("garaż sprzedającego przed tranzakcją: " + seller);
        System.out.println("garaż kupującego przed tranzakcją: " + buyer);











    }
}
