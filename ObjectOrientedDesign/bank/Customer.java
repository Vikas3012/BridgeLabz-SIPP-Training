package objectmodeling_relationships.bank;

import java.util.ArrayList;

public class Customer {
	private String name;
	private ArrayList<BankAccount> accounts;
	
	public Customer(String name) {
		this.name = name;
		this.accounts = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public void addAccount(BankAccount account) {
		accounts.add(account);
	}
	
	public void viewBalances() {
		System.out.println("Customer name: " + name);
		for(BankAccount acc : accounts) {
			acc.displayAccountDeatils();
		}
	}
}
