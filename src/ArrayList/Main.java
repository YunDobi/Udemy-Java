package ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();

        while (flag) {
            printActions();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addItem(groceries);
                case 2 -> removeItem(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }

    }
    private static void addItem(ArrayList<String> groceries) {
        System.out.println("Add item(s) [seperate item by ',']: ");
        String[] items = scanner.nextLine().split(",");

        for (String i : items) {
            String trimmed = i.trim();
            //if not exist, then return -1
            if (groceries.indexOf(trimmed) < 0) {
                groceries.add(trimmed);
            }
        }
    }
    private static void removeItem(ArrayList<String> groceries) {
        System.out.println("remove item(s) [seperate item by ',']: ");
        String[] items = scanner.nextLine().split(",");
        for (String i : items) {
            String trimmed = i.trim();
            if (groceries.indexOf(trimmed) < 0) {
                System.out.println(trimmed + " is not existing");
            } else {
                groceries.remove(trimmed);
            }
        }
    }


    private static void printActions () {
        String textBlock = """
               Avaiable Actions:
               
               0 - to shutdown
               1 - to add item(s) to list
               2 - to delete item from list
               
               Enter the number:""";
        System.out.println(textBlock + " ");
    }
}
