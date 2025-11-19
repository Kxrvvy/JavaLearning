package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
    static Scanner sc = new Scanner(System.in);
    static int accNumber = 0;
    private static ArrayList<Account> accounts;

    public static void userInput() {

        byte input = 0;
        accounts = new ArrayList<>();

        while(input!=3){
            System.out.println("Welcome to Banking System!");
            System.out.println("1. Create Account");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            input =sc.nextByte();

            switch(input) {
                case 1: new CreateAccount(sc, accounts) ; break;
                case 2: new Login(sc, accounts); break;
                case 3: System.exit(0); break;
            }
        }
    }

}
