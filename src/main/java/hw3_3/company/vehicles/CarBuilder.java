package hw3_3.company.vehicles;

import hw3_3.company.details.Engine;
import hw3_3.company.professions.Driver;

public class CarBuilder {
    String carModel;
    String carClass;
    double weight;
    Driver driver;
    Engine engine;
    int carryingCapacity;
    int maxSpeed;
    public CarBuilder setCarModel(String carModel) {
        this.carModel = carModel;
        return this;
    }
    public CarBuilder setCarClass(String carClass) {
        this.carClass = carClass;
        return this;
    }
    public CarBuilder setWeight(double weight) {
        this.weight = weight;
        return this;
    }
    public CarBuilder setDriver(Driver driver) {
        this.driver = driver;
        return this;
    }
    public CarBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }
    public CarBuilder setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
        return this;
    }
    public CarBuilder setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }
    public Car buildCar() {
        return new Car(this);
    }
    public Lorry buildLorry() {
        return new Lorry(this);
    }
    public SportCar buildSportCar() {
        return new SportCar(this);
    }
}