package org.example;

import java.util.Scanner;

public class Withdraw {
    public Withdraw(Scanner sc, Account acc) {
        double amountWithdraw;

        System.out.print("Please enter the amount you would like to withdraw: ");
        amountWithdraw = sc.nextDouble();

        if (amountWithdraw <= 0) {
            System.out.println("Invalid amount");
            return;
        }
        else if(amountWithdraw > acc.getBalance()){
            System.out.println("Insufficient funds");
            return;
        }
        else {
            acc.setBalance(acc.getBalance() - amountWithdraw);
            System.out.println("Withdraw Successful! Remaining Balance: " + acc.getBalance());
        }

        new AnotherTransaction(sc, acc);

    }
}
