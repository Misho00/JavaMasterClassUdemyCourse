package ClassesAndObjects;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double totalInputNumberSum = 0;
        int validNumberCounter = 1;

        do {
            System.out.println("Enter number#" + validNumberCounter);

            try {
                double number = Double.parseDouble(scanner.nextLine());
                totalInputNumberSum += number;
                validNumberCounter++;
            } catch (NumberFormatException badUserInput) {
                System.out.println("Please enter a valid number");
            }
        } while (validNumberCounter <= 5);

        System.out.println("The sum of the entered numbers is " + totalInputNumberSum);




    }


}
