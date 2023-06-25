package ForStatement;

public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("The sum of the digits 1234 is = " + sumDigits(1234));
        System.out.println("The sum of the digits -125 is = " + sumDigits(-125));
        System.out.println("The sum of the digits 4 is = " + sumDigits(4));
        System.out.println("The sum of the digits 32123 is = " + sumDigits(32123));
        System.out.println("The sum of the digits 1000 is = " + sumDigits(1000));
    }

    public static int sumDigits(int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while (number > 9) {
            sum += (number % 10);
            number = number / 10;
        }

        sum += number;

        return sum;
    }
}
