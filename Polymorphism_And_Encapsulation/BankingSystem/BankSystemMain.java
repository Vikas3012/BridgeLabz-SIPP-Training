public class BankSystemMain {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[3];

        accounts[0] = new SavingsAccount("S101", "Alice", 15000);
        accounts[1] = new CurrentAccount("C202", "Bob", 5000);
        accounts[2] = new SavingsAccount("S303", "Charlie", 8000);

        for (BankAccount account : accounts) {
            System.out.println("Account: " + account.getAccountNumber());
            System.out.println("Holder: " + account.getHolderName());
            System.out.println("Balance: ₹" + account.getBalance());
            System.out.println("Interest: ₹" + account.calculateInterest());

            if (account instanceof Loanable) {
                Loanable loanable = (Loanable) account;
                loanable.applyForLoan(20000);
                System.out.println("Eligible for Loan: " + loanable.calculateLoanEligibility());
            } else {
                System.out.println("Loan not available for this account type.");
            }

            System.out.println("------------------------");
        }
    }
}