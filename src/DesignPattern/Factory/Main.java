package DesignPattern.Factory;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> lnkList = new LinkedList<String>();
        lnkList.add("Dog");
        lnkList.add("Cat");

        // create the new file for easy adding new animals. Does not need to look up and change entire Main page.
        Iterator<String> factorIter = lnkList.iterator();
        while (factorIter.hasNext()) {
            Animal animal = AnimalFactory.create(factorIter.next());
            System.out.println(animal);
        }
    }
}
