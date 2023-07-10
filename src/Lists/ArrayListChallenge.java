package Lists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListChallenge {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<String> groceries = new ArrayList<>();
        boolean flag = true;

        while (flag) {
            printOptions();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                default -> flag = false;

            }

            groceries.sort(Comparator.naturalOrder());
            System.out.println("The list so far : " + groceries);
        }
    }

    private static void printOptions() {
        String textBlock = """
                    Available actions:
                                        
                    0 - to shutdown
                                        
                    1 - to add item(s) to list (comma delimited list)
                                        
                    2 - to remove any items (comma delimited list)
                                        
                    Enter a number for which action you want to do:
                    """;

        System.out.print(textBlock + " ");
    }

    private static void addItems(ArrayList<String> groceries) {
        System.out.println("add a list of groceries separated by comma");
        String[] inputArray = scanner.nextLine().split(",");

        for (String el : inputArray) {
            String trimmed = el.trim();

            if (!groceries.contains(trimmed)) {
                groceries.add(trimmed);
            }
        }
    }

    private static void removeItems(ArrayList<String> groceries) {
        System.out.println("remove a list of groceries separated by comma");
        String[] inputArray = scanner.nextLine().split(",");

        for (String el : inputArray) {
            String trimmed = el.trim();
            groceries.remove(trimmed);
        }
    }
}

