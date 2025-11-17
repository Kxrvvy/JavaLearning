package org.example;

import java.util.Scanner;

public class ReadingInput {
    public void readingInput(){

        /*
        * System.in = running in terminal
        * System.out = outside terminal
        */

        //The output of the Name is called tokens. Each String is a token
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine().trim();
        System.out.println("What's good, " + name);
    }
}
