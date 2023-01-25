public class Car {
    private String make = "makes";
    private String color = "White";
    private String model = "T";
    public String getMake() {
        return make;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void detailCar () {
        System.out.println("the car has " + color + " and " + model);
    }
}
