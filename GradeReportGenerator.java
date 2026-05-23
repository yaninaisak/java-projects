/**
 * Lab 3 - Exercise 2: [Grade Report Generator]
 * Student Name: [Yanina İsak]
 * Student ID: [230446612]
 * Date: [12.03.2026]
 */
import java.util.Scanner;
public class GradeReportGenerator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("=== Grade Report Generator ===\n");
        double assignment1, assignment2, assignment3, assignment4;
        double total = 0.0;
        double average;
        System.out.print("Enter score for Assignment 1: ");
        assignment1 = keyboard.nextDouble();
        total += assignment1;
        System.out.print("Enter score for Assignment 2: ");
        assignment2 = keyboard.nextDouble();
        total += assignment2;
        System.out.print("Enter score for Assignment 3: ");
        assignment3 = keyboard.nextDouble();
        total += assignment3;
        System.out.print("Enter score for Assignment 4: ");
        assignment4 = keyboard.nextDouble();
        total += assignment4;
        average = total / 4;
        char letterGrade;
        if (average >= 90) {
            letterGrade = 'A';
        } else if (average >= 80) {
            letterGrade = 'B';
        } else if (average >= 70) {
            letterGrade = 'C';
        } else if (average >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
        System.out.println("\n========================================");
        System.out.printf("%-20s %10s%n", "Assignment", "Score");
        System.out.println("----------------------------------------");
        System.out.printf("%-20s %10.2f%n", "Assignment 1", assignment1);
        System.out.printf("%-20s %10.2f%n", "Assignment 2", assignment2);
        System.out.printf("%-20s %10.2f%n", "Assignment 3", assignment3);
        System.out.printf("%-20s %10.2f%n", "Assignment 4", assignment4);
        System.out.println("========================================");
        System.out.printf("%-20s %10.2f%n", "Average", average);
        System.out.printf("%-20s %10c%n", "Letter Grade", letterGrade);
        System.out.println("========================================");

        keyboard.close();
    }
}

