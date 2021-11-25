package RealHomework.Tema15;

import java.util.Scanner;

public class ATM {
    static void printMainMenu() {
        System.out.println("""
                Main menu
                1: check balance
                2: withdraw
                3: deposit
                4: exit""");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 100);
        }

        while (true) {
            int id;
            while (true) {
                boolean validId = false;
                System.out.print("Enter an id: ");
                id = sc.nextInt();

                for (Account account : accounts) {
                    if (account.getId() == id) {
                        validId = true;
                        break;
                    }
                }

                if (validId) break;
                System.out.println("Invalid id. Please try again.");
            }

            boolean inSession = true;
            while (inSession) {
                printMainMenu();
                int option = sc.nextInt();

                switch (option) {
                    case 1 -> System.out.println("Current balance: " + accounts[id].getBalance() + "$");
                    case 2 -> {
                        System.out.print("Enter amount to withdraw: ");
                        double amountWithdraw = sc.nextDouble();
                        accounts[id].withdraw(amountWithdraw);
                    }
                    case 3 -> {
                        System.out.print("Enter amount to deposit: ");
                        double amountDeposit = sc.nextDouble();
                        accounts[id].deposit(amountDeposit);
                    }
                    case 4 -> inSession = false;
                    default -> System.out.println("Invalid input.");
                }
            }
        }
    }
}
