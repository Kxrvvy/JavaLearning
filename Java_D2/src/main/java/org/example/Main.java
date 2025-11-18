package org.example;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("---------------------------");
        System.out.println("--Math values--");
        MathClass mathClass = new MathClass();
        mathClass.mathClass();

        System.out.println("\n---------------------------");
        System.out.println("--Number Formatting--");
        NumberFormatting NF = new NumberFormatting();
        NF.numberFormat();


        /*
        System.out.println("\n---------------------------");
        System.out.println("--Reading Input--");
        ReadingInput RI = new ReadingInput();
        RI.readingInput();
        */

        //Mortgage Calculator

        System.out.println("\n---------------------------");
        System.out.println("--MortGage Calc--");
        MortgageCalculator MC = new MortgageCalculator();
        MC.mortgageCalculator();



        System.out.println("\n---------------------------");
        System.out.println("--Comparison Operator--");
        ComparisonOperators comparisonOperators = new ComparisonOperators();
        comparisonOperators.comparisonOperators();

        System.out.println("\n---------------------------");
        System.out.println("--Logical Operators--");
        LogicalOperator logicalOperator = new LogicalOperator();
        logicalOperator.logicalOperator();

        System.out.println("\n---------------------------");
        System.out.println("--Conditional Statement--");
        ConditionalStatements condiStatements = new ConditionalStatements();
        condiStatements.conditionalStatements();

        /* System.out.println("\n---------------------------");
        System.out.println("--Conditional Statement--");
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.fizzBuzz(); */

        System.out.println("\n---------------------------");
        System.out.println("--Looping--");
        LoopingStatements loop = new LoopingStatements();
        loop.loopStatements();

    }
}