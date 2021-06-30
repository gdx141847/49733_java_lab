package com.company;
import com.company.devices.Car;
import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        int result = o1.yearOfProduction.compareTo(o2.yearOfProduction);
        return result;

    }
}
