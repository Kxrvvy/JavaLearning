package org.example;

import java.util.Scanner;

public class Menu {
    public Menu(Scanner sc, Account acc ) {
        System.out.println("Welcome " + acc.getFirstName() + "!" );

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("************************");
            System.out.println("Welcome to BankingSystem");
            System.out.println("************************ \n");

            System.out.println("Please Choose");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your Choice: ");
            byte choice = sc.nextByte();

            switch (choice) {
                case 1:
                    System.out.println("You balance: " + acc.getBalance());
                    break;
                case 2:
                    new Deposit(sc, acc);
                    break;
                case 3:
                    new Withdraw(sc, acc);
                    break;
                case 4:
                    new ReturnHome(sc);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
