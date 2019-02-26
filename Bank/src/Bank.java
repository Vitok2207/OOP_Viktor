public class Bank {
    // Attribute
    // Kunde Objekt
    Customer customer0 = new Customer();
    // Konto Objekt
    Account account0;

    // Methoden
    public void start() {
        System.out.println("Viki Bank");

        // Kunde geht in die Bank und eröffnet neues Konto.
        makeNewCustomer("Carina", lastName: "Stoppel", customerID: 123456);
        makeNewAccount(accountID: 0136, customerID: 123456);
    }
    private void makeNewCustomer(String name, String lastName, int customerID) {
        customer0.setName(name);
        customer0.setLastName(lastName);
        customer0.setCustomerID(customerID);
    }

    private void makeNewAccount(int accountID, int customerID) {
        // Konstruktor Aufruf
        account0 = new Account(accountID, customerID);
    }

    private void printCustomerInfo(Customer customer) {
        System.out.println("Name:\t\t" + customer.getName());
        System.out.println("LastName:\t" + customer.getLastName());
        System.out.println("CustomerID:\t" + customer.getCustomerID());
    }

    private void printAccountInfo(Account account) {
        System.out.println("AccountID:\t" + account.getAccountID());
        System.out.println("Balance:\t" + account.getBalance());
    }
}
