package OperatorPrecedence;

public class OperatorPrecedence {
    public static void main(String[] args) {

        double numberOne = 20.00d;
        double numberTwo = 80.00d;

        double result = ((numberOne + numberTwo) * 100.00d) % 40.00d;
        boolean isRemainderZero = result == 0.0;
        System.out.println(isRemainderZero);

        if (!isRemainderZero) {
            System.out.println("Got some remainder");
        }
    }
}
