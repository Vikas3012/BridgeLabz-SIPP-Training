class BankAccount{
    static String bankName = "Panjab National Bank";
    private String accountHolderName ;

    static  int totalAccounts = 0;

    private final String  accountNumber;

    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public static   void getTotalAccounts(){
        System.out.println("Total account created is :- " + totalAccounts);
    }


    public void diplayDetails(){
        if (this instanceof BankAccount){
            System.out.println("Bank :- "+ bankName);
            System.out.println("Account holder name :- "+ accountHolderName);
            System.out.println("Account number :- "+accountNumber);

        }else{
            System.out.println("invalid account details");
        }
    }
}