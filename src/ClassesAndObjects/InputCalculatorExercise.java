package ClassesAndObjects;

import java.util.Scanner;

public class InputCalculatorExercise {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage () {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long average = 0;
        int loopCounter = 0;

        while (true) {
            try {
                int number = Integer.parseInt(scanner.nextLine());
                loopCounter++;
                sum += number;
            } catch (NumberFormatException e) {
                break;
            }
        }

        if (loopCounter > 0) {
            average = Math.round((double)sum/loopCounter);
        } else {
            sum = 0;
        }
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}
