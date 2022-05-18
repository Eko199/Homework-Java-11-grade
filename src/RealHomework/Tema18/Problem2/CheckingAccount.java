package RealHomework.Tema18.Problem2;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double money) {
        if (getBalance() - money >= -overdraftLimit)
            super.withdraw(money);
        else
            System.out.println("You can't go over your overdraft limit!");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", overdraftLimit=" + overdraftLimit;
    }
}
