package DesignPattern.StrategyPattern;

public class Main {
    // strategy pattern are easy to add new class or item with following interface which is Weapon
    public static void main(String[] args) {
        Character character = new Character();
        character.attack();

        character.setWeapon(new Bow());
        character.attack();

        character.setWeapon(new Sword());
        character.attack();
    }
}
