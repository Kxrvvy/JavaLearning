package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {

    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public void viewItem(){
        if(items.isEmpty()){
            System.out.println("No items in Inventory");
        }
        else{
            for(Item item : items){
                System.out.println(item);
            }
        }
    }

    public void updateQuantity(String name, int quantity){

        for (Item item : items){
            if (item.getItemName().equalsIgnoreCase(name)){
                item.setQuantity(quantity);
                System.out.println("Item updated");
                return;
            }
            else {
                System.out.println("Item not found");
                return;
            }
        }
    }

    public void DeleteItem(String del){
        for (Item item : items){
            if (item.getItemName().equalsIgnoreCase(del)){
                items.remove(item);
                System.out.println("Item deleted");
                return;
            }
            System.out.println("Item not found");
        }
    }

}
