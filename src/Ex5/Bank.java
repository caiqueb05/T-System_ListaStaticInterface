package Ex5;

import java.util.ArrayList;

public class Bank {
    private static ArrayList<BankAccount> accounts = new ArrayList<>();

    public static void openAccount(String accountHolder, double balance){
        BankAccount account = new BankAccount();
        BankAccount.setAccountHolder(accountHolder);
        BankAccount.setBalance(balance);
        accounts.add(account);
    }

    public static void closeAccount(int accountNumber){
        for (BankAccount account : accounts) {
            if (BankAccount.getAccountNumber() == accountNumber) {
                accounts.remove(account);
                break;
            }
        }
    }

    public static void deposit(int accountNumber, double amount){
        for (BankAccount account : accounts) {
            if (BankAccount.getAccountNumber() == accountNumber) {
                BankAccount.setBalance(BankAccount.getBalance() + amount);
                break;
            }
        }
    }

    public static void withdraw(int accountNumber, double amount){
        for (BankAccount account : accounts) {
            if (BankAccount.getAccountNumber() == accountNumber) {
                BankAccount.setBalance(BankAccount.getBalance() - amount);
                break;
            }
        }
    }

    public static void transfer(int accountNumberFrom, int accountNumberTo, double amount){
        for (BankAccount account : accounts) {
            if (BankAccount.getAccountNumber() == accountNumberFrom) {
                BankAccount.setBalance(BankAccount.getBalance() - amount);
                break;
            }
        }
        for (BankAccount account : accounts) {
            if (BankAccount.getAccountNumber() == accountNumberTo) {
                BankAccount.setBalance(BankAccount.getBalance() + amount);
                break;
            }
        }
    }

    public static ArrayList<BankAccount> getAccounts() {
        return accounts;
    }

    public static void setAccounts(ArrayList<BankAccount> accounts) {
        Bank.accounts = accounts;
    }
}
