package org.example;

import java.util.Scanner;

public class Deposit {
    public Deposit(Scanner sc, Account acc) {
        double amount;

        System.out.print("Enter amount to deposit: ");
        amount = sc.nextDouble();

        if (amount < 0){
            System.out.println("Invalid amount");
            return;
        }
        else {
            acc.setBalance(acc.getBalance() + amount);
            System.out.println("Transaction Successful! New Balance: " + acc.getBalance());
        }

        new AnotherTransaction(sc, acc);
    }

}
