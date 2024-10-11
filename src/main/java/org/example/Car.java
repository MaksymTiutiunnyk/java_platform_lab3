package org.example;

import java.util.Objects;

/**
 * Represents a car with attributes such as make, model, color, year, and horsepower.
 */
public class Car {
    private String make;
    private String model;
    private String color;
    private int year;
    private int horsePower;

    /**
     * Constructs a Car object with the given parameters.
     *
     * @param make       the manufacturer of the car.
     * @param model      the model of the car.
     * @param color      the color of the car.
     * @param year       the year the car was made.
     * @param horsePower the power of the car's engine in horsepower.
     */
    public Car(String make, String model, String color, int year, int horsePower) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.horsePower = horsePower;
    }

    /**
     * Gets the make of the car.
     *
     * @return the car's make.
     */
    public String getMake() {
        return make;
    }

    /**
     * Gets the model of the car.
     *
     * @return the car's model.
     */
    public String getModel() {
        return model;
    }

    /**
     * Gets the color of the car.
     *
     * @return the car's color.
     */
    public String getColor() {
        return color;
    }

    /**
     * Gets the year the car was made.
     *
     * @return the car's year.
     */
    public int getYear() {
        return year;
    }

    /**
     * Gets the horsepower of the car.
     *
     * @return the car's horsepower.
     */
    public int getHorsePower() {
        return horsePower;
    }

    /**
     * Sets the make of the car.
     *
     * @param make the car's make.
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Sets the model of the car.
     *
     * @param model the car's model.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Sets the color of the car.
     *
     * @param color the car's color.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Sets the year the car was made.
     *
     * @param year the car's year.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Sets the horsepower of the car.
     *
     * @param horsePower the car's horsepower.
     */
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    /**
     * Returns a string representation of the car.
     *
     * @return a string describing the car's attributes.
     */
    @Override
    public String toString() {
        return "Car{" + "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", horsePower=" + horsePower +
                '}';
    }

    /**
     * Compares this car with another object for equality based on make, model, color, year, and horsepower.
     *
     * @param o the object to compare with.
     * @return true if the cars are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;
        return year == car.year && horsePower == car.horsePower && Objects.equals(make, car.make) && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    /**
     * Generates a hash code for the car based on its attributes.
     *
     * @return a hash code value for the car.
     */
    @Override
    public int hashCode() {
        return Objects.hash(make, model, color, year, horsePower);
    }
}
