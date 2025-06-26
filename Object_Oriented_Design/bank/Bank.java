package objectmodeling_relationships.bank;

public class Bank {
	private String bankName;
	
	public Bank(String bankName) {
		this.bankName = bankName;
	}
	
	public void openAccount(Customer customer, String accountNumber, double initialDeposit) {
		BankAccount newAccount = new BankAccount(accountNumber, initialDeposit);
		customer.addAccount(newAccount);
        System.out.println("Account opened at " + bankName + " for " + customer.getName());
	}
}
