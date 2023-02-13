package inheritate;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Gen", "Huge", 400.0);
        AnimalDoing(animal, "slow");

        Dog dog = new Dog();

        AnimalDoing(dog, "60");
    }
    public static void AnimalDoing (Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("----");
    }
}
