//Help Received: none
public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount() {

    }

    public CheckingAccount(double amount) {
        this.setBalance(amount);
    }
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount, double overdraftLimit) {
        if (amount-this.getBalance() > this.overdraftLimit) {
            this.setBalance(this.getBalance() - amount);
        }
    }

    @Override
    public String toString() {
        return "This checking account has an overdraft limit of " + this.getOverdraftLimit() +
        " and a balance of " + this.getBalance();
    }

}
