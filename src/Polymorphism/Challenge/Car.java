package Polymorphism.Challenge;

public class Car {
    private String description = "";

    public Car(String description) {
        this.description = description;
    }
    public void startEngine() {
        System.out.println("Car -> start engine");
    }

    public void runEngine () {
        System.out.println("Car -> run engine");
    }
    public void drive () {
        System.out.println("Car -> driving, type is " + getClass().getSimpleName());
        runEngine();
    }
}

class GasCar extends Car {

    private double AvgKmperLitter;
    private int cylinders = 6;

    public GasCar(String description, double avgKmperLitter, int cylinders) {
        super(description);
        AvgKmperLitter = avgKmperLitter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Gas -> Start engine" + cylinders);
    }

    @Override
    public void runEngine() {
        System.out.println("Gas -> run engine" + AvgKmperLitter);
    }
}

class ElectCar extends Car {
    private double AvgKmperLitter;
    private int cylinders = 6;

    public ElectCar(String description, double avgKmperLitter, int cylinders) {
        super(description);
        AvgKmperLitter = avgKmperLitter;
        this.cylinders = cylinders;
    }
}
