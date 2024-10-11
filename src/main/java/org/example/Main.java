package org.example;

import java.util.Arrays;

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
        Arrays.sort(cars, (car1, car2) -> {
            if (car1.getMake().compareTo(car2.getMake()) > 0)
                return 1;
            if (car1.getMake().compareTo(car2.getMake()) < 0)
                return -1;
            if (car1.getYear() > car2.getYear())
                return -1;
            if (car1.getYear() < car2.getYear())
                return 1;
            return 0;
        });
        System.out.println("\nSorted cars: ");
        Arrays.stream(cars).forEach(System.out::println);

        // Find and print cars that match the predefined one
        System.out.println("\nCars that are equal to the predefined one:");
        for (Car car : cars) {
            if (car.equals(CAR_TO_COMPARE))
                System.out.println(car);
        }
    }
}
