package com.company;
import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Device;
import com.company.devices.Diesel;
import com.company.devices.Phone;
import java.util.Arrays;

public class Human implements Sellable {
    private String firstName;
    private String lastName;
    private String sex;
    private int age;
    private double cash;
    private Car[] garage;

    private Phone mobilePhone;
    private Animal pet;


    private double salary;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human() {
        garage = new Car[3];
    }


    public Human(String firstName, String lastName, String sex, int age, double cash, int garageLength) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.cash = cash;
        garage = new Car[garageLength];

    }


//    public void setCar(Car vehicle){
//        if(this.salary > vehicle.value){
//            System.out.println("Udało się kupić samochód za gotówkę!!!");
//            this.vehicle = vehicle;
//        }else if(this.salary >= vehicle.value/12){
//            System.out.println("Udało się kupić samochód na kredyt, no trudno !!!");
//            this.vehicle = vehicle;
//        }else{
//            System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
//        };
//
//    }


    /*public Double getSalary(){
        Date nowDate = new Date();
        System.out.println("Informacje o Twoich zarobkach były pobierane " + nowDate +" Toja wyplata wynosiła "+ this.salary*0.75);

        return this.salary;

    }
    public void setSalary(Double salary){
            if(salary <= 0.0){
                System.out.println("nieprawidlowa wartosc");
            }else{

                //System.out.println("Nowe dane zostały wysłane do systemu księgowego");
                //System.out.println("Proszę odebrać aneks do umowy z działu kadr");
                //System.out.println("ZUS i US zostały poinformowane o zmianie wynagrodzenia");
                this.salary = salary;
        }

    }*/

    public Car[] getGarage() {
        return garage;
    }

    public Car getCar(int spot) {
        return garage[spot];

    }


    public void setCar(int spot, Car car) {
        garage[spot] = car;
        car.getOwners().add(this);

    }


    public double garageValue() {
        double value = 0;
        for (Car car : garage) {
            if (car != null) {
                value += car.getValue();
            }

        }
        return value;
    }

    public double getCash() {
        return cash;
    }

    public void sortCars() {
        Arrays.sort(garage, new CarComparator());

    }




    /*public void setValue(Double value) {
            this.value =value;
            if(this.salary > this.value){
                System.out.println("Udało się kupić za gotówkę");
                getVehicle();

            }else if(this.salary > 0.083*this.value){
                System.out.println("Udało się kupić na kredyt");
                getVehicle();

            }else{
                System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
            }
        }*/
    public String toString() {
        return firstName + " " + lastName + " " + sex + " " + age + " " + cash + " " + Arrays.toString(garage);
    }

    public Phone getMobilePhone() {
        return mobilePhone;
    }

    public Animal getPet() {
        return pet;
    }

    @Override
    public void sell(Human seller, Human buyer, double prize) {

        if (new Human() != null) {
            System.out.println("Handel ludzmi jest zabroniony");
        }
        if (buyer.cash >= prize) {
            System.out.println("Masz wystarczająco pięniedzy na zakup.");

            if (garage != null) {
                buyer.cash = buyer.cash - prize;
                seller.cash = seller.cash + prize;
                buyer.garage = seller.garage;
                seller.garage = null;
                System.out.println("Transakcja został przeprowadzona - kupiłeś auto");
            }
            if (pet != null) {
                buyer.cash = buyer.cash - prize;
                seller.cash = seller.cash + prize;
                buyer.pet = seller.pet;
                seller.pet = null;
                System.out.println("Transakcja został przeprowadzona - kupiłeś zwierzaka");

            }
            if (mobilePhone != null) {
                buyer.cash = buyer.cash - prize;
                seller.cash = seller.cash + prize;
                buyer.mobilePhone = seller.mobilePhone;
                seller.mobilePhone = null;
                System.out.println("Transakcja został przeprowadzona - kupiłeś telefon");

            }

        } else {
            System.out.println("Nie stać Ciebie na zakup");

        }
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public void removeCar (Car carToRemove){
            for (int i = 0; i < garage.length; i++) {
                if (garage[i] != null) {
                    if (garage[i].equals(carToRemove)) {
                        garage[i] = null;
                    }
                }
            }
        }

        public void addCar (Car car){
            for (int i = 0; i < garage.length; i++) {
                if (garage[i] == null) {
                        garage[i] = car;
                        break;
                    }
                }
            }

    }





