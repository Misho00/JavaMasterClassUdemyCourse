package ForStatement;

public class ForLoopStatement {
    public static void main(String[] args) {

        for (double interestRate = 2.0; interestRate <= 5.0; interestRate++) {
            double interestAmount = calculateInterest(10000.0, interestRate);
            System.out.println("10 000 at " + interestRate + "% interest = " + interestAmount);
        }

        System.out.println("-----------------------------------");

        //mini challenge
        for (double interestRate = 7.5; interestRate <= 10.0; interestRate+=0.25) {
            double interestAmount = calculateInterest(100.0, interestRate);
            System.out.println("100 at " + interestRate + "% interest = " + interestAmount);
        }

        System.out.println("-----------------------------------");

        //mini challenge
        for (double interestRate = 7.5; interestRate <= 10.0; interestRate+=0.25) {
            if (interestRate > 8.5) {
                break;
            }
            double interestAmount = calculateInterest(100.0, interestRate);
            System.out.println("100 at " + interestRate + "% interest = " + interestAmount);
        }
    }

    public static double calculateInterest(double amaount, double interestRate) {
        return (amaount * (interestRate / 100));
    }
}
