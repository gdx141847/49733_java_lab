package com.company;
import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Human implements Sellable {
    String firstName;
    String lastName;
    String sex;
    Integer age;
    public Double cash;
    public Object[] garage = new Object[3];
    int garageLength = garage.length;

    public Human(){}


    public Human(String firstName, String lastName, String sex, Integer age, Double cash,int garageLength) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.cash = cash;
        this.garageLength = garageLength;
    }





    public Phone mobilePhone;
    public Animal pet;
    //public Car vehicle;

    private Double salary;
    private Double value;







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

    /*public Car getVehicle() {
        return vehicle;
    }*/


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
        return firstName + " " + lastName + " " + sex + " " + age + " " + cash;
    }
    @Override
    public void sell(Human seller, Human buyer, Double prize)
    {

        if(new Human() != null){
            System.out.println("Handel ludzmi jest zabroniony");
        }
        if (buyer.cash >= prize)
        {
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

       }
        else

    {
        System.out.println("Nie stać Ciebie na zakup");

    }



    }
}



