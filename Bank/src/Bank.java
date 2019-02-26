public class Bank {
    // Attribute
    // Wir erinnern uns an die Deklaration von Variablen
    // Datentyp Variablennamen
    // Bei Objekten ist das ganz ähnlich
    // Klassennamen Objektnamen
    // Kunde Objekt
    Customer customer0 = new Customer();
    Customer customer1 = new Customer();
    Customer customer2 = new Customer();

    // Konto Objekt
    Account account0 = new Account();
    Account account1 = new Account();
    Account account2 = new Account();


    // Methoden
    public void start() {
        System.out.println("Viki Bank" + "\n");

        // Kunde geht in die Bank und eröffnet neues Konto.
        // Kunde 0
        makeNewCustomer(customer0, "Carina", "Stoppel", 0000);
        makeNewAccount(account0, 1000, 0000);
        // Kunde 1
        makeNewCustomer(customer1, "Martina", "Feuring", 0001);
        makeNewAccount(account1, 1001, 0001);
        // Kunde 2
        makeNewCustomer(customer2, "Angela", "Klein", 0002);
        makeNewAccount(account2, 1002, 0002);

        //Kunden zahlen ein
        // Kunde 0 zahlt 50€ auf sein Konto
        depositMoney(account0, customer0, 50);
        depositMoney(account0, customer0, 50);
        depositMoney(account0, customer0, 50);
        newLine();

        // Kunde1 zahlt 370€ auf sein Konto ein
        depositMoney(account1, customer1, 370);
        withdrawMoney(account1, customer1, 550);
        newLine();

        // Kunde 2 zahl 65€ auf sein Konto ein
        depositMoney(account2, customer2, 65000);
        withdrawMoney(account2, customer2, 12000);
        newLine();

        // Kundeninfo ausgeben
        printCustomerInfo(customer0);
        printAccountInfo(account0);

        printCustomerInfo(customer1);
        printAccountInfo(account1);

        printCustomerInfo(customer2);
        printAccountInfo(account2);
    }

    private void makeNewCustomer(Customer customer, String name, String lastName, int customerID) {
        customer.initCustomer(name, lastName, customerID);
    }

    private void makeNewAccount(Account account, int accountID, int customerID) {
        // Aufruf von initAccount
        account.initAccount(accountID, customerID);
    }

    private void printCustomerInfo(Customer customer) {
        System.out.println("Name:\t\t" + customer.getName());
        System.out.println("LastName:\t" + customer.getLastName());
        System.out.println("CustomerID:\t" + customer.getCustomerID());
    }

    private void printAccountInfo(Account account) {
        System.out.println("AccountID:\t" + account.getAccountID());
        System.out.println("Balance:\t" + account.getBalance() + "€" + "\n");
    }

    // Zahlt Geld auf ein Konto ein
    // Nimmt 2 Parameter an: Welches Konto? Wie viel?
    private void depositMoney(Account account, Customer customer, int amount) {
        account.deposit(amount);
        System.out.println(amount + "€ has been deposited to your account. " + customer.getName() + customer.getLastName() + ".");
    }

    private void withdrawMoney(Account account, Customer customer, int amount) {
        if (account.getBalance() >= amount) {
            account.withdraw(amount);
            System.out.println(amount + "€ has been deposited to your account. " + customer.getName() + customer.getLastName() + ".");
        } else {
            System.err.println("There is not enough credit to withdraw " + amount + "€ on the account of " + customer.getName() + customer.getLastName() + "!");
            System.out.println(account.getBalance() + " has been withdrawn!");
            account.withdraw(account.getBalance());
        }
    }

    private void newLine() {
        System.out.println();
    }
}