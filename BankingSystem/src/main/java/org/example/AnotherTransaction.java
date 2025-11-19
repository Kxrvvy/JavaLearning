package org.example;

import java.util.Scanner;

public class AnotherTransaction {

    public AnotherTransaction(Scanner sc, Account acc) {
        System.out.print("Would you like to make another transaction (y/n)? ");
        char answer = sc.next().toLowerCase().charAt(0);

        if (answer == 'y')
            new Menu(sc, acc);
        else if (answer == 'n')
            new ReturnHome(sc);
    }
}
