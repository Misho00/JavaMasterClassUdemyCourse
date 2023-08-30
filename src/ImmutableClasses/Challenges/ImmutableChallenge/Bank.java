package ImmutableClasses.Challenges.ImmutableChallenge;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    public final int routingNumber;
    private long transactionId = 1;
    private final Map<String, BankCustomer> customers;

    public Bank(int routingNumber) {
        this.routingNumber = routingNumber;
        customers = new HashMap<>();
    }

    public BankCustomer getCustomer(String id) {
        BankCustomer customer = customers.get(id);
        return customer;
    }

    public void addCustomer(String name, double checkingDeposit, double savingsDeposit) {
        BankCustomer customer = new BankCustomer(name, checkingDeposit, savingsDeposit);
        customers.put(customer.getCustomerId(), customer);
    }

    public boolean doTransaction(String id, BankAccount.AccountType accountType, double amount) {
        BankCustomer customer = customers.get(id);

        if (customer != null) {
            BankAccount account = customer.getAccount(accountType);
            if (account != null) {
                if ((account.getBalance() + amount) < 0) {
                    System.out.println("Insufficient funds");
                } else {
                    account.commitTransaction(routingNumber, transactionId++, id, amount);
                    return true;
                }
            }
        } else {
            System.out.println("Invalid customer ID");
        }

        return false;
    }
}
