package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    public Login(Scanner sc, ArrayList<Account> accounts) {

        int id = 0;
        int password = 0;

        while (true) {
            try{
                System.out.print("Enter Account ID: ");
                id = Integer.parseInt(sc.next());
                break;
            } catch (NumberFormatException e){
                System.out.println("Invalid Account ID. Please input numbers only!");
            }
        }


        while (true) {
            try{
                System.out.print("Enter Password: ");
                password = Integer.parseInt(sc.next());
                break;
            }catch (NumberFormatException e){
                System.out.println("Invalid Password. Please input numbers only!");
            }
        }

        Account account = new Account();
        boolean exists = false;
        for (Account acc : accounts) {
            if (acc.getAccNumb() == id && acc.getPassword() == password){
                exists = true;
                account = acc;
            }
        }

        if (exists){
            new Menu(sc, account);
        }else {
            System.out.println("Account not found. Please check your account ID and Password!");
            new ReturnHome(sc);
        }
    }
}
