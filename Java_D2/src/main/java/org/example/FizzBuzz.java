package org.example;

import java.util.Scanner;

public class FizzBuzz {
    public int fizzBuzz() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        int number = scanner.nextInt();

        /* if number is divisible by 5, it will enter to the codeblock
            then check if the number is also divisible by 3. If yes, it returns FizzBuzz.
            If not, it returns only Fizz*/
        if (number % 5 == 0){
            if(number % 3 == 0)
                System.out.println("FizzBuzz");
            else
                System.out.println("Fizz");
        }
        else if(number % 3 == 0) // Returns Buzz if the number is divisible by 3
            System.out.println("Buzz");
        else // if number is not divisible by 3 or 5, then it returns the value of the number.
            System.out.println(number);
        return 0;
    }
}
