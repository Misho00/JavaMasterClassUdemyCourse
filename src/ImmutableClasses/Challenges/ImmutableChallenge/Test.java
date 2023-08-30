package ImmutableClasses.Challenges.ImmutableChallenge;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);

        List<Integer> a2 = new ArrayList<>();
        a2 = a1;
        a2.set(0, 5);
        int a = 5;

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = arr1;

        arr2[0] = 5;
        int b = 5;
    }
}
