package ControlFlow;

public class SwitchExpressionChallenge {
    public static void main(String[] args) {
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);
        printDayOfWeek(-1);
    }

    public static void printDayOfWeek(int day) {
        switch (day) {
            case 0 -> System.out.println(day + " corresponds to Sunday");
            case 1 -> System.out.println(day + " corresponds to Monday");
            case 2 -> System.out.println(day + " corresponds to Tuesday");
            case 3 -> System.out.println(day + " corresponds to Wednesday");
            case 4 -> System.out.println(day + " corresponds to Thursday");
            case 5 -> System.out.println(day + " corresponds to Friday");
            case 6 -> System.out.println(day + " corresponds to Saturday");
            default -> System.out.println(day + " corresponds to Invalid day");
        }
    }
}
