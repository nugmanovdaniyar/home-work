package hw3_3.company.vehicles;

import hw3_3.company.details.Engine;
import hw3_3.company.professions.Driver;

public class SportCar extends Car {
    private int maxSpeed;

    public SportCar(CarBuilder builder) {
        super(builder);
        this.maxSpeed = builder.maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}