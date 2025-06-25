public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("harshit","21452");
        BankAccount bankAccount1 = new BankAccount("agraj","21458");
        bankAccount.diplayDetails();
        bankAccount1.diplayDetails();

        BankAccount.getTotalAccounts();
    }
}
