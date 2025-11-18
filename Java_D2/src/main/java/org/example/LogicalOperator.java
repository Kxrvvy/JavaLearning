package org.example;

public class LogicalOperator {
    public void logicalOperator() {

        //Logical Operators

        // using AND operator (&&)
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30; // both conditions must always be true
        System.out.println(isWarm);

        // using OR operators (||)
        int temp = 30;
        boolean isWarmer = temp > 20 || temp < 30; // one of the condition must be true
        System.out.println(isWarmer);

        // using NOT (!)
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligible);

    }
}
