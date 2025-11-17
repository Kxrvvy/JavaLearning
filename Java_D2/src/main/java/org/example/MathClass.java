package org.example;

public class MathClass {
    public void mathClass(){
        //Round
        int round = Math.round(1.1f); // rounds up the number
        System.out.println("round: " + round); // since the Data type is int, it will return the whole number

        //Ceil
        /* since we are using int data type, we need
           to cast the number into int */
        int ceil = (int)Math.ceil(1.2f); //output the largest number or equal to this number
        System.out.println("ceil: " + ceil);

        //floor
        int floor = (int)Math.floor(1.2f); // output the largest number, smaller or equal to this number
        System.out.println("floor: " + floor);

        // random
        /*double random = Math.random(); //returns random number from 0-1
        *
        * double random = Math.random()*100; //returns random from 0-100 that has decimals
        *
        * change double to int
        * int random = Math.round(Math.random()*100); //will have error because .round returns long
        * // (int) use explicit casting
        *int random = (int) Math.round(Math.random()*100); //return whole number of the random generated
        *
        * int random = (int)Math.random() * 100 // generates only 0 because the casting only applies to Math.random
        * // needs to be group to include 100
        */

        int random = (int)(Math.random()*100);
        System.out.println("Random: " + random);
    }
}
