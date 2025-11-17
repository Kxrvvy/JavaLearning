package org.example;

import java.text.NumberFormat;

public class NumberFormatting {
    public void numberFormat(){

        //Formatting numbers as currency
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891); // formats a readable currency value
        System.out.println("Value: " + result);

        //Formatting Numbers as Percent
        /* NumberFormat percent = NumberFormat.getPercentInstance();
        String pResult = percent.format(1234567.891); // formats a readable value
        System.out.println("Value: " + pResult); */

        //Method Chaining
        String pResult = NumberFormat.getPercentInstance().format(0.1);
        System.out.println("Percent: " + pResult);

    }
}
