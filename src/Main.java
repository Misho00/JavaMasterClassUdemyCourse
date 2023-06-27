import OOP.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());

        System.out.println("----------------");

        Customer customer2 = new Customer("John", 250, "john@john.com");
        System.out.println(customer2.getName());
        System.out.println(customer2.getCreditLimit());
        System.out.println(customer2.getEmail());

        System.out.println("----------------");

        Customer customer3 = new Customer("Kim", "kim@kim.com");
        System.out.println(customer3.getName());
        System.out.println(customer3.getCreditLimit());
        System.out.println(customer3.getEmail());
    }
}
