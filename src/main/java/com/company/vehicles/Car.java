package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private final String carModel;
    private final String carClass;
    private final double weight;
    private final Driver driver;
    private final Engine engine;

    public Car(String carModel, String carClass, double weight, Driver driver, Engine engine) {
        this.carModel = carModel;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + carModel + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver.getFullName() +
                ", driving experience=" + driver.getDrivingExperience() + " лет" +
                ", engine=" + engine.getManufacturer() +
                ", power=" + engine.getPower() + "Kwh" +
                '}';
    }
}