package Arrays.ArraysCodingExercise;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static void main(String[] args) {
        int[] array = getIntegers(5);
        Arrays.sort(array);

        int[] reversedOrderedArray = sortIntegers(array);
        printArray(reversedOrderedArray);
    }

    public static int[] getIntegers(int len) {
        Scanner scanner = new Scanner(System.in);

        int[] newArray = new int[len];
        for (int i = 1; i <= len; i++) {
            int element = scanner.nextInt();
            newArray[i - 1] = element;
        }

        return newArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Element %d contents %d%n", i, array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {

        for(int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        return array;
    }
}
