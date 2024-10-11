package org.example;

/**
 * Class responsible for generating an array of Car objects.
 */
public class CarsGenerator {

    /**
     * Generates an array of 10 predefined Car objects.
     *
     * @return an array of Car objects.
     */
    public static Car[] generateCars() {
        Car[] cars = new Car[10];

        cars[0] = new Car("Ford", "Escape", "red", 2019, 249);
        cars[1] = new Car("Ford", "Edge", "white", 2016, 249);
        cars[2] = new Car("Suzuki", "Vitara", "white", 2017, 117);
        cars[3] = new Car("Suzuki", "SX4", "black", 2016, 117);
        cars[4] = new Car("Skoda", "Octavia", "white", 2016, 150);
        cars[5] = new Car("Audi", "Q7", "black", 2018, 252);
        cars[6] = new Car("Audi", "Q8", "black", 2018, 340);
        cars[7] = new Car("Lada", "Niva", "blue", 2009, 82);
        cars[8] = new Car("Ford", "Fusion", "black", 2017, 249);
        cars[9] = new Car("Ford", "Fusion", "black", 2018, 190);

        return cars;
    }
}
