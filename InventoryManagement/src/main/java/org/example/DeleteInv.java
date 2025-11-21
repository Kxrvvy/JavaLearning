package org.example;

import java.util.Scanner;

public class DeleteInv {
    public DeleteInv(Inventory inv, Scanner sc) {
        System.out.println("Item to Delete: ");
        String del = sc.nextLine();

        inv.DeleteItem(del);
    }
}
