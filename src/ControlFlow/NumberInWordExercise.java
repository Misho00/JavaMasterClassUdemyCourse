package ControlFlow;

public class NumberInWordExercise {

    public static void main(String[] args) {
        System.out.println(printNumberInWord(0));
        System.out.println(printNumberInWord(1));
        System.out.println(printNumberInWord(2));
        System.out.println(printNumberInWord(3));
        System.out.println(printNumberInWord(4));
        System.out.println(printNumberInWord(5));
        System.out.println(printNumberInWord(6));
        System.out.println(printNumberInWord(7));
        System.out.println(printNumberInWord(8));
        System.out.println(printNumberInWord(9));
        System.out.println(printNumberInWord(10));
        System.out.println(printNumberInWord(-10));
    }

    public static String printNumberInWord(int wholeNumber) {
        return switch (wholeNumber) {
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "OTHER";
        };
    }
}
