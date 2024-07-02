package Ex5;

public class Main {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();

        BankAccount.setAccountNumber(1);
        BankAccount.setAccountHolder("John");
        BankAccount.setBalance(1000);

        BankAccount.setAccountNumber(2);
        BankAccount.setAccountHolder("Mary");
        BankAccount.setBalance(2000);

        BankAccount.setAccountNumber(3);
        BankAccount.setAccountHolder("Peter");
        BankAccount.setBalance(3000);

        System.out.println("Account number: " + BankAccount.getAccountNumber());
        System.out.println("Account holder: " + BankAccount.getAccountHolder());
        System.out.println("Balance: " + BankAccount.getBalance());

        System.out.println("Account number: " + BankAccount.getAccountNumber());
        System.out.println("Account holder: " + BankAccount.getAccountHolder());
        System.out.println("Balance: " + BankAccount.getBalance());

        System.out.println("Account number: " + BankAccount.getAccountNumber());
        System.out.println("Account holder: " + BankAccount.getAccountHolder());
        System.out.println("Balance: " + BankAccount.getBalance());

        Bank.openAccount("Jimmy", 1000);
        Bank.openAccount("Marta", 2000);
        Bank.openAccount("Daniel", 2000);

        Bank.closeAccount(1);

        Bank.deposit(2, 1000);
        Bank.withdraw(2, 500);

        Bank.transfer(2, 3, 500);

        for (BankAccount account : Bank.getAccounts()) {
            System.out.println("Account number: " + BankAccount.getAccountNumber());
            System.out.println("Account holder: " + BankAccount.getAccountHolder());
            System.out.println("Balance: " + BankAccount.getBalance());
        }

    }

}
