import OOP.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.setAccountNumber("35900");
        bankAccount.setAccountBalance(1000.00);
        bankAccount.setCustomerName("John Doe");
        bankAccount.setEmail("john_doe@me.com");
        bankAccount.setPhoneNumber("+0052356799");

        bankAccount.withdraw(100.00);
        bankAccount.deposit(250);
        bankAccount.withdraw(50.00);
        bankAccount.withdraw(200);
        bankAccount.deposit(100);
        bankAccount.withdraw(45.55);
        bankAccount.withdraw(54.46);
        bankAccount.withdraw(54.45);
    }
}
