package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] returnArray = readIntegers();
        System.out.println(Arrays.toString(returnArray));

//        int returnedMin = findMe(returnArray);
//        System.out.println("min = " + returnedMin);

        reverse(returnArray);
        System.out.println("final" + Arrays.toString(returnArray));

    }
    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enger a list of integers, seperated by comma");
        String input = scanner.nextLine();

        String[] splited = input.split(",");
        int[] values = new int[splited.length];

        for (int i = 0; i < splited.length; i++) {
            values[i] = Integer.parseInt(splited[i].trim());
        }

        return values;
    }

    private static int findMe (int[] array) {
        int min = Integer.MAX_VALUE;
        for (int el : array) {
            if (el < min) {
                min = el;
            }
        }
        return min;
    }

    private static void reverse(int[] array) {
        int max =  array.length - 1;
        int halfLength = array.length/ 2;

        for(int i = 0; i < halfLength;i++) {
            int temp = array[i];
            array[i] = array[max- i];
            array[max -i] = temp;
            System.out.println("--->" + Arrays.toString(array));
        }
    }
}
