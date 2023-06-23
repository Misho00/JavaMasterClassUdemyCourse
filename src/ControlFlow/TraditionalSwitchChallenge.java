package ControlFlow;

public class TraditionalSwitchChallenge {

    public static void main(String[] args) {
        char letter = 'Z';
        System.out.println(getNATOCode(letter));
    }

    public static String getNATOCode(char character) {
        switch (character) {
            case 'A':
                return " For character " + character + " the NATO code is Able";
            case 'B':
                return " For character " + character + " the NATO code is Baker";
            case 'C':
                return " For character " + character + " the NATO code is Charlie";
            case 'D':
                return " For character " + character + " the NATO code is Dog";
            case 'E':
                return " For character " + character + " the NATO code is Easy";
            default:
                return " For character " + character + " the NATO code is not found";
        }
    }
}
