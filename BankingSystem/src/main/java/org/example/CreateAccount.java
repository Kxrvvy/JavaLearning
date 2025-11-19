package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateAccount {
    public CreateAccount(Scanner sc, ArrayList<Account> accounts) {
        System.out.print("Enter First Name: ");
        String firstName = sc.next();
        System.out.print("Enter Last Name: ");
        String lastName = sc.next();
        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter Password (digits only): ");
        int password = sc.nextInt();
        System.out.print("Confirm Password: ");
        int confirmPassword = sc.nextInt();


        if (password != confirmPassword){
            System.out.println("Passwords do not match!");
            return;
        }

        int id = 100000 + UserInput.accNumber;
        UserInput.accNumber++;

        System.out.println("Your account ID: " + id);

        Account acc = new Account(firstName, lastName, id, balance, password);
        accounts.add(acc);
        new Menu(sc, acc);
    }
}
