public class SavingAccount extends Account {

    private double interestRate;

    public SavingAccount(double balance, double interestRate) {
        super(balance); // Passing parameter balance ke parent constructor dengan menggunakan super(balance)
        this.interestRate = interestRate; // Mengatur nilai variabel interestRate dengan nilai interest_rate
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

}

