package Polymorphism.Challenge;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("2022 Blue");
        raceStart(car);

        Car ferrari = new GasCar("2021 Ferrari", 15.4, 6);
        raceStart(ferrari);

    }
    public static void raceStart (Car car) {
        car.startEngine();
        car.drive();
    }
}
