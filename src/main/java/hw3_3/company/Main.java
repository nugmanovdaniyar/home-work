package hw3_3.company;

import hw3_3.company.details.Engine;
import hw3_3.company.professions.Driver;
import hw3_3.company.vehicles.Car;
import hw3_3.company.vehicles.CarBuilder;
import hw3_3.company.vehicles.Lorry;
import hw3_3.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("Petrovich", 100);
        Engine lorryEngine = new Engine(1000, "China");
        Engine sportEngine = new Engine(1000000, "Japan");
        Engine defaultEngine = new Engine(50, "Russia");

        CarBuilder carBuilder = new CarBuilder();

        Lorry lorry = carBuilder
                .setCarModel("Scania")
                .setCarClass("C")
                .setWeight(5000)
                .setDriver(driver)
                .setEngine(lorryEngine)
                .setCarryingCapacity(20000)
                .buildLorry();

        SportCar sportCar = carBuilder
                .setCarModel("f1")
                .setCarClass("A")
                .setWeight(100)
                .setDriver(driver)
                .setEngine(sportEngine)
                .setMaxSpeed(3000000)
                .buildSportCar();

        Car lada = carBuilder
                .setCarModel("Vesta")
                .setCarClass("B")
                .setWeight(150)
                .setDriver(driver)
                .setEngine(defaultEngine)
                .buildCar();

        Car[] cars = {lada, lorry, sportCar};

        for(Car car : cars) {
            System.out.println(car.toString());
        }
    }
}