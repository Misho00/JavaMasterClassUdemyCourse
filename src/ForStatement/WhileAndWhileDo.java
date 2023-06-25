package ForStatement;

public class WhileAndWhileDo {

    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int totalEvenNumbers = 0;
        int totalOddNumbers = 0;

        while (number <= finishNumber) {

            number++;
            if (!isEvenNumber(number)) {
                totalOddNumbers++;
                continue;
            }

            totalEvenNumbers++;
            if (totalEvenNumbers >= 5) {
                break;
            }

            System.out.println(number + " is even number");
        }

        System.out.println("Total odd numbers = " + totalOddNumbers + ", total even numbers " + totalEvenNumbers);
    }

    public static boolean isEvenNumber(int number) {
        return (number % 2 == 0);
    }
}
