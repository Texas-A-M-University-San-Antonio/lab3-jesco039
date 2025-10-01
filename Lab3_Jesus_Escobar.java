// Lab3_Jesus_Escobar.java
// This program calculates the future value of a home given its intial value,
// the number of years, and an annual interest rate.

import java.util.Scanner;

public class Lab3_Jesus_Escobar 
{
    public static void main(String[] args)
    {
        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Declare variables:
        double initialValue;    // Initial value of the home
        int years;              // Number of elapsed years
        double interestRate;     // Annual interest rate (as a percentage)
        double finalValue;      // Final value of the home

        // Prompt the user to enter the initial value of the home
        System.out.print("Please enter the initial value of the home: ");
        initialValue = scanner.nextDouble();

        // Prompt the user to enter the number of elapsed years
        System.out.print("Please enter the number of elapsed years: ");
        years = scanner.nextInt();  // Use nextInt for integer input

        // Prompt the user to enter the interest rate
        System.out.print("Please enter the interest rate: ");
        interestRate = scanner.nextDouble();

        // Convert interest rate from percentage to decimal
        double r = interestRate / 100.0;

        // Calculate final value using compound interest formula: A = P * (1 + r)^t
        finalValue = initialValue * Math.pow(1 + r, years);

        // Display the final value formatted to two decimal places
        System.out.printf("The final value of the home is: %.2f%n", finalValue);

        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}