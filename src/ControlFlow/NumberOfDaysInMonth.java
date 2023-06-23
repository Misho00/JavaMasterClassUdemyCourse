package ControlFlow;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }

    public static boolean isLeapYear (int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static int getDaysInMonth (int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        int daysInMonth;
        if (isLeapYear(year)) {
            daysInMonth = switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 2 -> 29;
                default -> 30;
            };
        } else {
            daysInMonth = switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 2 -> 28;
                default -> 30;
            };
        }

        return daysInMonth;
    }
}
