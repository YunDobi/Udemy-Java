package DesignPattern.Factory;

public class AnimalFactory {
    static Animal create(String string) {
        if(string.equals("Dog")) {
            return new Dog(string);
        } else if(string.equals("Cat")) {
            return new Cat(string);
        } else if(string.equals("Rat")){
//            return new Rat(string);
        }
        //기타 동물의 생성자들
        return null;
    };
}
