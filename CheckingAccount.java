public class CheckingAccount extends Account {

    private double overdraftProtection;

    public CheckingAccount(double balance, double overdraftProtection) {
        super(balance); // Passing parameter balance ke parent constructor dengan menggunakan super(balance)
        this.overdraftProtection = overdraftProtection;
    }

    public CheckingAccount(double balance) {
        this(balance, -1.0); // Passing parameter balance ke lokal constructor dengan menggunakan this.
    }

    public double getOverdraftProtection() {
        return overdraftProtection;
    }

    public void setOverdraftProtection(double overdraftProtection) {
        this.overdraftProtection = overdraftProtection;
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance - amount >= 0.0) {
            balance -= amount;
            return true;
        } else if (overdraftProtection == -1.0 || overdraftProtection < amount - balance) {
            return false;
        } else {
            balance = 0.0;
            overdraftProtection -= amount - balance;
            return true;
        }
    }

    public double getSaldo() {
        return balance + overdraftProtection;
    }
}