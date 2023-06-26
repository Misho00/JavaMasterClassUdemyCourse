package ClassesAndObjects;

import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double minNumber = 0;
        double maxNumber = 0;
        int loopCount = 0;


        System.out.println("Enter any number, or a character or a string to exit");
        while (true) {
            try {
                double currentNumber = Double.parseDouble(scanner.nextLine());

                if (loopCount == 0) {
                    maxNumber = currentNumber;
                    minNumber = currentNumber;
                } else {
                    if (currentNumber > maxNumber) maxNumber = currentNumber;
                    if (minNumber > currentNumber) minNumber = currentNumber;
                }

                loopCount++;

            } catch (NumberFormatException e) {
                break;
            }
        }
        if (loopCount > 0) {
            System.out.println("Min number is " + minNumber + ", max number is " + maxNumber);
        } else {
            System.out.println("No valid data entered");
        }

    }


}
