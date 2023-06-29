package OOP;

public class StringMethods {

    public static void main(String[] args) {

        String birthDay = "25/11/1982";

        int startingIndex = birthDay.indexOf("1982");
        System.out.println("Starting index = " + startingIndex);
        System.out.println("Birth year = " + birthDay.substring(startingIndex));

        System.out.println("Month = " + birthDay.substring(3, 5));

        String newDate = String.join("/", "25", "11", "1982");
        System.out.println("New date = " + newDate);

        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.println("New date = " + newDate);

        newDate = "25" + "/" + "11" + "/" + "1982";
        System.out.println("New date = " + newDate);

        newDate = "25".concat("/").concat("11").concat("/").concat("1982");
        System.out.println("New date = " + newDate);

        System.out.println(newDate.replace('/', '-'));
        System.out.println(newDate.replace("2", "00"));

        System.out.println(newDate.replaceFirst("/", "-"));
        System.out.println(newDate.replaceAll("/", "---"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));
    }
}
