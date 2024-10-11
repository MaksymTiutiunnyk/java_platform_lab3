package org.example;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Main class that demonstrates working with an array of Car objects, sorting them, and comparing them
 * with a predefined car.
 */
public class Main {
    /**
     * A predefined car to compare other cars with.
     */
    private static final Car CAR_TO_COMPARE = new Car("Ford", "Fusion", "black", 2017, 249);

    /**
     * Main method that initializes an array of cars, sorts them by horsepower and year, and prints out the
     * cars that match the predefined car.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Car[] cars = CarsGenerator.generateCars();
        System.out.println("Generated cars:" + Arrays.toString(cars));

        // Sort cars by horsepower
        Arrays.sort(cars, Comparator.comparingInt(Car::getHorsePower));
        System.out.println("\nCars sorted by power: " + Arrays.toString(cars));

        // Sort cars by year (in reverse order)
        Arrays.sort(cars, Comparator.comparingInt(Car::getYear).reversed());
        System.out.println("\nCars sorted by year: " + Arrays.toString(cars));

        // Find and print cars that match the predefined one
        System.out.println("\nCars that are equal to the predefined one:");
        for (Car car : cars) {
            if (car.equals(CAR_TO_COMPARE))
                System.out.println(car);
        }
    }
}
