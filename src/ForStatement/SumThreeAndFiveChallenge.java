package ForStatement;

public class SumThreeAndFiveChallenge {
    public static void main(String[] args) {
        int sumOfThreeAndFiveDivisible = 0;
        int countOfDivisibleNumbers = 0;

        for (int i = 1; countOfDivisibleNumbers < 5 && i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i);
                countOfDivisibleNumbers++;
                sumOfThreeAndFiveDivisible += i;
            }
        }

        System.out.println("The sum of the numbers that can be divided by 3 and 5 = " + sumOfThreeAndFiveDivisible);
    }
}
