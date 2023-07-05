package Arrays.ArraysChallenge;

import java.util.Arrays;
import java.util.Random;

public class ArraysChallenge {
    public static void main(String[] args) {
        int[] myArray = getRandomArray(5);
        System.out.println("Unordered array = " + Arrays.toString(myArray));
        Arrays.sort(myArray);
        System.out.println("Ordered array = " + Arrays.toString(myArray));

        for(int i = 0; i < myArray.length / 2; i++)
        {
            int temp = myArray[i];
            myArray[i] = myArray[myArray.length - i - 1];
            myArray[myArray.length - i - 1] = temp;
        }

        System.out.println("Ordered array in reverse = " + Arrays.toString(myArray));


    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];

        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(1000);
        }

        return newInt;
    }
}
