package RealHomework.Tema18.Problem2;

public class SavingsAccount extends Account {
    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    public void withdraw(double money) {
        if (getBalance() >= money)
            super.withdraw(money);
        else
            System.out.println("You don't have enough money to withdraw!");
    }
}
