package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Item> items;

    public static void userInput(){
        byte choice = 0;
        Inventory inv  = new Inventory();
        items = new ArrayList<>();

        while(choice!=4){
            System.out.println("\nWelcome to your Inventory Management System");
            System.out.println("What would you like to do?");
            System.out.println("1. Add Item");
            System.out.println("2. View Item");
            System.out.println("3. Update Quantity");
            System.out.println("4. Delete Item");
            System.out.println("5. Exit");
            System.out.print("Chosen Choice: ");
            choice = sc.nextByte();
            sc.nextLine();

            switch(choice){
                case 1: new ItemInfo(inv, sc); break;
                case 2: inv.viewItem(); break;
                case 3: new UpdateInv(inv, sc); break;
                case 4: new DeleteInv(inv, sc); break;


            }
        }



    }
}
