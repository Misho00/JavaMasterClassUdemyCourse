package Arrays.ArraysChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {
    public static void main(String[] args) {
        int[] arrayNumbers = readIntegers();
        System.out.println(Arrays.toString(arrayNumbers));

        int min = findMin(arrayNumbers);
        System.out.println(min);
    }

    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(",");
        System.out.println("Enter a list of integers, separated by commas:");
        int[] intArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            intArray[i] = Integer.parseInt(array[i].trim());
        }

        return intArray;
    }

    private static int findMin(int[] array) {

        int tempMin = Integer.MAX_VALUE;

        for (int el : array) {
            if (el < tempMin) {
                tempMin = el;
            }
        }

        return tempMin;
    }
}
