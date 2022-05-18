package RealHomework.Tema18.Problem2;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(0, 20000);
        CheckingAccount checkingAccount = new CheckingAccount(1, 0, 1000);
        SavingsAccount savingsAccount = new SavingsAccount(2, 1000);

        System.out.println(account.toString());
        System.out.println(checkingAccount.toString());
        System.out.println(savingsAccount.toString());
    }
}
