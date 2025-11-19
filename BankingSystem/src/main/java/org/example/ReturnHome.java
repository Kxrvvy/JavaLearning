package org.example;

import java.util.Scanner;

public class ReturnHome {
    public ReturnHome(Scanner sc) {
        System.out.print("would you like to go back to Main Menu?(y/n) ");
        char choice = sc.next().toLowerCase().charAt(0);

        if (choice == 'y'){
            UserInput.userInput();
        }
        else
            System.exit(0);
    }
}
