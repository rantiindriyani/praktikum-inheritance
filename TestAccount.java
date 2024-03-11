public class TestAccount {

    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(1000, 500);
        SavingAccount savingAccount = new SavingAccount(2000, 0.05);

        System.out.println("Checking Account Saldo: " + checkingAccount.getSaldo());
        System.out.println("Savings Account Saldo: " + savingAccount.getBalance());

        checkingAccount.deposit(200);
        savingAccount.deposit(100);

        System.out.println("Checking Account Saldo after deposit: " + checkingAccount.getSaldo());
        System.out.println("Savings Account Saldo after deposit: " + savingAccount.getBalance());

        checkingAccount.withdraw(800);
        savingAccount.withdraw(500);

        System.out.println("Checking Account Saldo after withdraw: " + checkingAccount.getSaldo());
        System.out.println("Savings Account Saldo after withdraw: " + savingAccount.getBalance());
    }
}