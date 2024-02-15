package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {
    private final int carryingCapacity;

    public Lorry(String carModel, String carClass, double weight, Driver driver, Engine engine, int carryingCapacity) {
        super(carModel, carClass, weight, driver, engine);
        this.carryingCapacity = carryingCapacity;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }
}
