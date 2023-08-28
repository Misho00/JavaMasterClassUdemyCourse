package ImmutableClasses.FinalExplored;

import ImmutableClasses.Generic.BaseClass;
import ImmutableClasses.Generic.ChildClass;

public class Main {
    public static void main(String[] args) {
        BaseClass parent = new BaseClass();
        ChildClass child = new ChildClass();
        BaseClass childReferredAsBase = new ChildClass();

        parent.recommendedMethod();
        System.out.println("-".repeat(50));
        childReferredAsBase.recommendedMethod();
        System.out.println("-".repeat(50));
        child.recommendedMethod();
        System.out.println("-".repeat(50));


        parent.recommendedStatic();
        System.out.println("-".repeat(50));
        childReferredAsBase.recommendedStatic();
        System.out.println("-".repeat(50));
        child.recommendedStatic();
        System.out.println("-".repeat(50));

        System.out.println("-".repeat(50));
        BaseClass.recommendedStatic();
        ChildClass.recommendedStatic();
        System.out.println("-".repeat(50));

        String xArgument = "This is all I have to say about section ";
        StringBuilder zArgument = new StringBuilder("Only saying this: Section ");
        doXYZ(xArgument, 16, zArgument);
        System.out.println("After Method, xArgument = " + xArgument);
        System.out.println("After Method, zArgument = " + zArgument);
        System.out.println("-".repeat(50));

        StringBuilder tracker = new StringBuilder("Step 1 is abc");
        Logger.logToConsole(tracker.toString());
        tracker.append(", Step 2 is xyz");
        Logger.logToConsole(tracker.toString());
        System.out.println("After logging, tracker = " + tracker);

    }

    private static void doXYZ(String x, int y, StringBuilder z) {
        final String c = x + y;
        System.out.println("c = " + c);
        z.append(y);
    }
}
