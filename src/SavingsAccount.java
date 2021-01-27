//Help Received: none
public class SavingsAccount extends Account {

    public SavingsAccount() {

    }

    public SavingsAccount(double amount) {
        this.setBalance(amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= this.getBalance()) {
            this.setBalance(this.getBalance() - amount);
        }
    }

    @Override
    public String toString() {
        return "This savings account has a balance of " + this.getBalance();
    }
}
