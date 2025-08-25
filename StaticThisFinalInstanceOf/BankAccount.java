public class BankAccount {
    static String bankName = "State Bank of India";
    static int totalAccounts = 0;
    private final int accountNumber;

    private String accountHolderName;

    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        } else {
            System.out.println("Invalid account object.");
        }
    }
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Vishwajeet Singh", 10101);
        BankAccount acc2 = new BankAccount("Rahul Kumar", 10102);

        acc1.displayDetails();
        System.out.println();
        acc2.displayDetails();

        System.out.println("\nTotal Bank Accounts: " + BankAccount.getTotalAccounts());
    }
}