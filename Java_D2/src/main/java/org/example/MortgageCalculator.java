package org.example;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public void mortgageCalculator() {



        // use scanner for user input
        Scanner mrtCalc = new Scanner(System.in);

        // Principal
        System.out.print("Principal: ");
        float principal = mrtCalc.nextFloat();

        // Annual Interest Rate
        System.out.print("Annual Interest Rate: ");
        float perAnnum = mrtCalc.nextFloat();
        float interest = perAnnum / 100 / 12;

        //Years of Payment
        System.out.print("Period (Years): ");
        byte period = mrtCalc.nextByte();
        int years = period * 12;

        //Calculations
        double calculateInterestAndYears =  Math.pow(1+interest, years);
        double result = principal*interest*calculateInterestAndYears/(calculateInterestAndYears - 1);

        // Format mortgage to Currency
        String mortgageResult = NumberFormat.getCurrencyInstance().format(result);

        // Mortgage
        System.out.print("Mortgage: " + mortgageResult);
    }
}
