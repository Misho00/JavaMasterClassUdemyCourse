package ClassesAndObjects;

public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 13));
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit (int firstNumber, int secondNumber) {
        if (firstNumber > 99 || firstNumber < 10 || secondNumber > 99 || secondNumber < 10) {
            return false;
        }

        for (int i = 1; i <= 9; i++) {
            if
            (
                    (firstNumber % 10 == i || firstNumber / 10 == i) &&
                    (secondNumber % 10 == i || secondNumber / 10 == i)
            )
            {
                return true;
            }
        }

        return false;
    }


}
