package TernaryOperator;

public class TernaryOperator {
    public static void main(String[] args) {

        String makeOfCar = "Volkswagen";
        boolean isDomestic = (makeOfCar == "Volkswagen") ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        int ageOfClient = 20;

        String ageText = (ageOfClient >= 18) ? "Over Eighteen" : "Still a kid";
        System.out.println("Our client is " + ageText);
    }
}
