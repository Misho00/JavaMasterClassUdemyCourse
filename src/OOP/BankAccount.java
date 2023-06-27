package OOP;

public class BankAccount {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("35900", 2.50, "Default Name", "Default email", "Default number");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double accountBalance, String customerName, String email, String phoneNumber){
        System.out.println("Parameterized constructor called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("9999", 255.5, customerName, email, phoneNumber);
    }

    public void deposit(double amount) {
        accountBalance += amount;
        System.out.println("You've made deposit of $" + amount +  ", current balance is $" + this.accountBalance);
    }

    public void withdraw(double amount) {
        if ((accountBalance - amount) < 0) {
            System.out.println("Insufficient balance. You are not allowed to withdraw");
        } else {
            accountBalance -= amount;
        }

        System.out.println("Your current balance is $" + this.accountBalance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
