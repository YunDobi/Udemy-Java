package first;

//overloading paractice
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.getColor());
        car.detailCar();
    }
    public static int calculate (String playerName, int score) {
        System.out.println("player " + playerName + " score " + score);
        return score * 1000;
    }
}