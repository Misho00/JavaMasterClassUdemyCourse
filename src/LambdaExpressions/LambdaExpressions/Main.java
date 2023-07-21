package LambdaExpressions.LambdaExpressions;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("alpha", "bravo", "delta", "charlie"));

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-------------");

        list.forEach(s -> System.out.println(s));

        System.out.println("---------------");

        String prefix = "nato";
        list.forEach(s -> {
            char firstChar = s.charAt(0);
            System.out.println(prefix + " " + s + " means " + firstChar);
        });
        System.out.println("---------------");

        int result = calculator((a, b) -> a + b, 5, 2);
        var result2 = calculator((a, b) -> a / b, 10.0, 2.5);
        var result3 = calculator((a, b) -> a.toUpperCase() + " " + b.toUpperCase(), "Ralph", "Kramden");

    }

    public static <T> T calculator(Operation<T> function, T value1, T value2) {
        T result = function.operate(value1, value2);
        System.out.println("Result of operation: " + result);
        return result;
    }
}
