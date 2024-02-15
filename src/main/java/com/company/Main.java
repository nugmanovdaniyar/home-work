package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("Petrovich", 100);
        Engine engine = new Engine(1000, "China");
        Car car = new Car("BMW", "E", 500.0, driver, engine);
        System.out.println(car.toString());
    }
}