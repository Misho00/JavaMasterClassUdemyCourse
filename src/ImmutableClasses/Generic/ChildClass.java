package ImmutableClasses.Generic;

public class ChildClass extends BaseClass {
    @Override
    protected void optionalMethod() {
        System.out.println("[ChildClass.optionalMethod]: EXTRA Stuff Here");
        super.optionalMethod();
    }

   /* @Override
    public void recommendedMethod() {
        System.out.println("[ChildClass.recommendedMethod]: I'll Do Things My Way");
        optionalMethod();
    }*/

    private void mandatoryMethod() {
        System.out.println("[ChildClass.mandatoryMethod]: My Own Important Stuff Here");
    }

    public static void recommendedStatic() {
        System.out.println("[ChildClass.recommendedStatic]: BEST way to do it");
        optionalStatic();
//        mandatoryStatic();
    }
}
