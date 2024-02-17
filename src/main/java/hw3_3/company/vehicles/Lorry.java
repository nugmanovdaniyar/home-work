package hw3_3.company.vehicles;

import hw3_3.company.details.Engine;
import hw3_3.company.professions.Driver;

public class Lorry extends Car {
    private int carryingCapacity;

    public Lorry(CarBuilder builder) {
        super(builder);
        this.carryingCapacity = builder.carryingCapacity;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }
}