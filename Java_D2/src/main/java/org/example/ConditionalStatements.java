package org.example;

public class ConditionalStatements {
    public void conditionalStatements(){
        int temp = 32;

        if (temp > 30){
            System.out.println("It's a hot day. Drink plenty of water.");
        }
        else if (temp > 20)
            System.out.println("Beautiful Day");
        else
            System.out.println("It's cold");


        //Simplification of if else Statement
        int income = 120_000;
        boolean hasHighIncome = (income > 100_000); // returns true if income is greater than 100_00, else false
        System.out.println(hasHighIncome);


        // Ternary Operator

        int incomeVal = 120_000;
        String className = (income > 100_000) ? "First Class" : "Economy Class";
        System.out.println(className);

        // Switch Case

        String rank = "Major";

        switch(rank){
            case "Major":
                System.out.println("Welcome Major");
                break;
            case "Admiral":
                System.out.println("Welcome Admiral");
                break;
            default:
                System.out.println("Welcome Guest");
        }
    }
}
