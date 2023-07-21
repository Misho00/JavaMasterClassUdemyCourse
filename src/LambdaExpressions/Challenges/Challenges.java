package LambdaExpressions.Challenges;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Challenges {
    public static void main(String[] args) {
        Consumer<String> printWords = new Consumer<String>() {
            @Override
            public void accept(String s) {
                String[] parts = s.split(" ");
                for(String part : parts) {
                    System.out.println(part);
                }
            }
        };

        // Mini challenge 1
        Consumer<String> printWordsLambda = sentence -> {
            String[] parts = sentence.split(" ");
            for(String part : parts) {
                System.out.println(part);
            }
        };

        printWords.accept("Let's split this up into an array");
        System.out.println("--------------");
        printWordsLambda.accept("Let's split this up into an array");

        Consumer<String> printWordsForEach = sentence -> {
            String[] parts = sentence.split(" ");
            Arrays.asList(parts).forEach(s -> System.out.println(s));
        };
        System.out.println("--------------");
        printWordsForEach.accept("Let's split this up into an array");

        Consumer<String> printWordsConcise = sentence -> Arrays.asList(sentence.split(" ")).forEach(s -> System.out.println(s));
        System.out.println("--------------");
        printWordsConcise.accept("Let's split this up into an array");

        //Mini challenge 2
        UnaryOperator<String> randomString = s -> {
          StringBuilder returnVal = new StringBuilder();
          for (int i = 0; i < s.length(); i++) {
              if (i % 2 == 1) {
                returnVal.append(s.charAt(i));
              }
          }
          return returnVal.toString();
        };


        //Mini challenge 3
        System.out.println(randomString.apply("1234567890"));

        //Mini challenge 4&5
        var result = printResult(randomString, "1234567890");
        System.out.println(result);


        //Mini challenge 6
        Supplier<String> iLoveJava = () -> "I love java";

        //Mini challenge 7
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);


    }

    public static <T> T printResult(UnaryOperator<T> function, T randomString) {
        return function.apply(randomString);
    }
}
