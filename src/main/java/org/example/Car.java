package org.example;

import java.util.Objects;

public class Car {
    private String make;
    private String model;
    private String color;
    private int year;
    private int horsePower;

    public Car(String make, String model, String color, int year, int horsePower) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.horsePower = horsePower;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Car{" + "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", horsePower=" + horsePower +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;
        return year == car.year && horsePower == car.horsePower && Objects.equals(make, car.make) && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, color, year, horsePower);
    }

}
