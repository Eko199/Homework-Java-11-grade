package com.Tema7;

public class AccountTest {
    public static void main(String[] args) {
        SavingsAccount sa0001 = new SavingsAccount("Damien", 0);
        sa0001.deposit(1000);
        sa0001.withdraw(9999);
        sa0001.withdraw(-1);
        sa0001.withdraw(25);
    }
}
