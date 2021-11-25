package RealHomework.Tema15;

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private static double yearInterestRate = 0;
    private Date dateCreated = new Date();

    public Account() {}

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getYearInterestRate() {
        return yearInterestRate;
    }

    public static void setYearInterestRate(double yearInterestRate) {
        Account.yearInterestRate = yearInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public static double getMonthlyInterestRate() {
        return yearInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate() / 100;
    }

    public void withdraw(double money) {
        balance -= money;
    }

    public void deposit(double money) {
        balance += money;
    }
}
