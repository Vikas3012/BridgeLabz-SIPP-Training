package objectmodeling_relationships.bank;

public class Main {
	public static void main(String[] args) {
        // Create bank
        Bank hdfc = new Bank("HDFC Bank");
        Bank bob = new Bank("BOB");
        
        // Create customer
        Customer alice = new Customer("Alice");

        // Open accounts
        hdfc.openAccount(alice, "HDFC12345", 1000.0);
        hdfc.openAccount(alice, "HDFC67890", 5000.0);
        bob.openAccount(alice, "BOB12345", 0);

        // View balances
        alice.viewBalances();
    }
}
