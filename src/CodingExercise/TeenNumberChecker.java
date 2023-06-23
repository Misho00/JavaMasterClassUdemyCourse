package CodingExercise;

public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(isTeen(9, 99, 19));
        System.out.println(isTeen(23, 15, 42));
        System.out.println(isTeen(22, 23, 34));
    }

    public static boolean isTeen (int firstNumber, int secondNumber, int thirdNumber) {
        return (
                (firstNumber >= 13 && firstNumber <= 19)   ||
                (secondNumber >= 13 && secondNumber <= 19) ||
                (thirdNumber >= 13 && thirdNumber <= 19)
        );
    }
}
