package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ItemInfo {
    public ItemInfo(Inventory inv, Scanner sc){
        System.out.print("Enter Item Name:");
        String name = sc.nextLine();
        System.out.print("Enter Quantity:");
        int quantity = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Item Price:");
        double price = sc.nextDouble();
        sc.nextLine();

        inv.addItem(new Item(name, quantity, price));

    }
}
