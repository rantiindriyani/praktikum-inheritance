public class Account {

    protected double balance;

    public Account(double initBalance) {
        this.balance = initBalance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amt) {
        if (amt <= 0) {
            return false;
        }
        balance += amt;
        return true;
    }

    public boolean withdraw(double amt) {
        if (amt <= 0) {
            return false;
        }
        if (amt > balance) {
            return false;
        }
        balance -= amt;
        return true;
    }
}