package ClassesAndObjects;

public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        int tempNumber = Math.abs(number);
        int reverse = 0;

        while (tempNumber > 9) {
            int lastDigit = tempNumber % 10;
            tempNumber = tempNumber / 10;

            reverse = (reverse * 10) + lastDigit;
        }

        reverse = (reverse * 10) + tempNumber;

        return reverse == number;
    }
}
