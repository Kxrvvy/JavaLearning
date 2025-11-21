package org.example;

import java.util.Scanner;

public class UpdateInv {
    public UpdateInv(Inventory inv, Scanner sc){

        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();
        System.out.print("New Quantity: ");
        int quantity = sc.nextInt();

        inv.updateQuantity(name, quantity);

    }
}
