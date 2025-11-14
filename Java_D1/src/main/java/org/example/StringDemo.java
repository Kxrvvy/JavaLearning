package org.example;

public class StringDemo {

    public void runStringDemo(){
        // Basic string demo

        String message = "Hello World!";
        // prints the message
        System.out.println(message);
        // knowing the number of characters
        System.out.println(message.length());
        // returs the index of the characters chosen
        // index = numerical position within the ordered data (like array/String)
        System.out.println(message.indexOf("e"));
        // replaces the chosen character that you wan to change
        // Argumnents = actual values that pass to the methods (!, *)
        // parameters = what we defies in our methods (target, replacement)
        System.out.println(message.replace("!", "*"));
    }
    }

