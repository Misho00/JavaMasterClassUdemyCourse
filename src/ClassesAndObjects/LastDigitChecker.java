package ClassesAndObjects;

public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(10, 10, 10));
    }

    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {

        if (!isValidNumber(firstNumber) || !isValidNumber(secondNumber) || !isValidNumber(thirdNumber)) {
            return false;
        }

        return (firstNumber % 10 == secondNumber % 10) ||
                (firstNumber % 10 == thirdNumber % 10) ||
                (secondNumber % 10 == thirdNumber % 10);
    }

    public static boolean isValidNumber(int number) {
        return number >= 10 && number <= 1000;
    }
}
