package MethodOverloading;

public class MethodOverloadingChallenge {

    public static void main(String[] args) {
        System.out.println("5ft, 8in = " + convertToCentimeters(5, 8) + " cm");
        System.out.println("68in = " + convertToCentimeters(68) + " cm");
    }

    //1 inch = 2.54cm
    //1 foot = 12 inches
    public static double convertToCentimeters(int heightInInches) {
        return heightInInches * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int heightInInches) {
        int totalInches = (heightInFeet * 12) + heightInInches;
        return convertToCentimeters(totalInches);
    }
}
