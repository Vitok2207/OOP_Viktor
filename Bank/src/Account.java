public class Account {
    // Attribute
    // Kontonummer
    private int accountID;
    // Kontostand
    private int balance;
    // Kundennummer
    private int customerID;

    // InitAccount
    public void initAccount(int accountID, int customerID) {
        this.accountID = accountID;
        this.customerID = customerID;
    }

    // Getter
    public int getAccountID() {
        return accountID;
    }

    // Kontostand geben
    public int getBalance() {
        return balance;
    }

    public int getCustomerID() {
        return customerID;
    }

    // Methoden
    // Auszahlen
    public void withdraw(int amount) {
        balance -= amount;
    }

    // Einzahlen
    public void deposit(int amount) {
        balance += amount;
    }
}
