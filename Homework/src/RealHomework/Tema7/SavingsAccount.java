package RealHomework.Tema7;

public class SavingsAccount {
    public String name;
    public double balance;

    SavingsAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(int x) {
        balance += x;
    }

    public void withdraw(double x) {
        if (balance < x)  System.out.println("Balance is too low to withdraw " + x);
        else if (x < 0) System.out.println("You can't withdraw negative amounts.");
        else {
            balance -= x;
            System.out.println("Current balance: " + x);
        }
    }
}
