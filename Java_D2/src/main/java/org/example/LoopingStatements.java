package org.example;

import java.util.Scanner;

public class LoopingStatements {
    public void loopStatements() {
        // for loop
        for (int i = 0; i < 5; i++)
            System.out.println("Hello World");

        // while loop
        // use when we don't know ahead of time how many times we wanna repeat something

        /* int j = 0;
        while (j < 5){
            System.out.println("Hello World");
            j++;
        } */

        // sample while loop
        /*
        Scanner sc = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")){
            System.out.print("Input: ");
            input = sc.nextLine().toLowerCase().trim();
            System.out.println(input);
        }
        */

        // using break and continue

        /*
        Scanner scan = new Scanner(System.in);

        String inpt = "";
        while (true) {
            System.out.print("Input: ");
            inpt = scan.nextLine().toLowerCase().trim();
            if (inpt.equals("pass"))
                continue;
            if (inpt.equals("quit"))
                break;
            System.out.println(inpt);
        }
        */
        System.out.println("\n");

        String[] fruits = {"Apple", "Orange", "Banana"};

        for (int k= fruits.length-1; k >= 0; k--)
            System.out.println(fruits[k]);
        System.out.println("\n");

        //for each loop
        for (String fruit : fruits)
            System.out.println(fruit);

    }
}
