package org.example;

import java.util.Scanner;

public class CalculateGrade {
    public static double calculateGrade(double actGrade, double co, double finals) {
        return (actGrade * 0.3) + (co * 0.3) + (finals * 0.4);
    }
}
