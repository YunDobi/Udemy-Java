import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void area() {
        double r = 7.5;
        assertEquals((Math.PI * r * r), new Circle(7.5).area());
    }
    @Test
    void draw() {
        double r = 7.5;
    }
}