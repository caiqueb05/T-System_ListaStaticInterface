package Ex5;

public class BankAccount {
    private static int accountNumber;
    private static String accountHolder;
    private static double balance;

    public BankAccount() {
    }

    public static int getAccountNumber() {
        return accountNumber;
    }

    public static void setAccountNumber(int accountNumber) {
        BankAccount.accountNumber = accountNumber;
    }

    public static String getAccountHolder() {
        return accountHolder;
    }

    public static void setAccountHolder(String accountHolder) {
        BankAccount.accountHolder = accountHolder;
    }

    public static double getBalance() {
        return balance;
    }

    public static void setBalance(double balance) {
        BankAccount.balance = balance;
    }
}
