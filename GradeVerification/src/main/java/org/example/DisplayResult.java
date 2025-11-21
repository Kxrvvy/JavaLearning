package org.example;

public class DisplayResult {

    public static void displayResult(double[] FG, int studs) {
        for (int i = 0; i < studs; i++) {
            double grade = FG[i];

            System.out.println("Student " + i + ": " + grade);


            if(grade >= 75)
                System.out.println("PASS");
            else
                System.out.println("FAIL");
        }
    }


}
