package org.example;

import java.util.Scanner;

public class UserInput {

    static Scanner sc = new Scanner(System.in);

    public static void userInput() {
        System.out.print("How many students to verify grades? ");
        int studs = sc.nextInt();

        double[] FinalGrade = new double [studs];

        for (int i = 0; i<studs; i++){
            System.out.println("\nStudent " + (i+1));
            System.out.print("Activities Overall: ");
            double actGrade = sc.nextDouble();
            System.out.print("Course Outcome(CO) Overall: ");
            double co = sc.nextDouble();
            System.out.print("Finals Overall: ");
            double finals = sc.nextDouble();


            FinalGrade[i] = CalculateGrade.calculateGrade(actGrade, co, finals);
        }

        DisplayResult.displayResult(FinalGrade, studs);
    }
}
