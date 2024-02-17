package hw3_3.company.vehicles;

import hw3_3.company.details.Engine;
import hw3_3.company.professions.Driver;

public class Car {
    private String carModel;
    private String carClass;
    private double weight;
    private Driver driver;
    private Engine engine;

    public Car(CarBuilder builder) {
        this.carModel = builder.carModel;
        this.carClass = builder.carClass;
        this.weight = builder.weight;
        this.driver = builder.driver;
        this.engine = builder.engine;
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