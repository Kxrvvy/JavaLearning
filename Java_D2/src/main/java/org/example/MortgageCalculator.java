package org.example;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public void mortgageCalculator() {

        float principal = 0;
        float interest = 0;
        int years = 0;

        // use scanner for user input
        Scanner mrtCalc = new Scanner(System.in);

        // Principal
        // added while loop
        while (true){
            System.out.print("Principal: ");
            principal = mrtCalc.nextFloat();
            if (principal >= 1000 && principal <=1000000)
                break;
            System.out.println("Enter a value between 1000 and 1000000");
        }


        // Annual Interest Rate
        while (true){
            System.out.print("Annual Interest Rate: ");
            float perAnnum = mrtCalc.nextFloat();
            if (perAnnum >= 1 && perAnnum <= 30){
                interest = perAnnum / 100 / 12;
                break;
            }
            System.out.println("Enter a value between 1 and 30");


        }

        //Years of Payment
        while (true){
            System.out.print("Period (Years): ");
            byte period = mrtCalc.nextByte();
            if (period >= 1 && period <= 30){
                years = period * 12;
                break;
            }
            System.out.println("Enter a year between 1 and 30");

        }


        //Calculations
        double calculateInterestAndYears =  Math.pow(1+interest, years);
        double result = principal*interest*calculateInterestAndYears/(calculateInterestAndYears - 1);

        // Format mortgage to Currency
        String mortgageResult = NumberFormat.getCurrencyInstance().format(result);

        // Mortgage
        System.out.print("Mortgage: " + mortgageResult);
    }
}
