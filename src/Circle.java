public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        double result = (Math.PI * radius * radius);
        return result;
    }

    @Override
    public void draw(int x, int y, double radius) {
        System.out.println("position " + x + y + " placed with " + this.area() + " area");
    }
}
