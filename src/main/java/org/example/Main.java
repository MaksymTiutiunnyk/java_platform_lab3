// 23 номер в списку групи, С11 = 1

package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    private static final Car CAR_TO_COMPARE = new Car("Ford", "Fusion", "black", 2017, 249);

    public static void main(String[] args) {
        Car[] cars = CarsGenerator.generateCars();
        System.out.println("Generated cars:" + Arrays.toString(cars));

        Arrays.sort(cars, Comparator.comparingInt(Car::getHorsePower));
        System.out.println("\nCars sorted by power: " + Arrays.toString(cars));

        Arrays.sort(cars, Comparator.comparingInt(Car::getYear).reversed());
        System.out.println("\nCars sorted by year: " + Arrays.toString(cars));

        System.out.println("\nCars that are equal to the predefined one:");
        for (Car car : cars) {
            if (car.equals(CAR_TO_COMPARE))
                System.out.println(car);
        }
    }
}