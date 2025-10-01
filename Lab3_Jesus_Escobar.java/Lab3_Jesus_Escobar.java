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
        double initialValue;    // Starting home value
        int years;              // Number of years elapsed
        double interestPct;     // Interest rate as a percentage
        double finalValue;      // Future calculated value of the home

        // Prompt and read inital Value
        System.out.print("Please enter the initial value of the home: ");
        initialValue = scanner.nextDouble();

        System.out.print("Please enter the number of elapsed years: ");
        years = scanner.nextInt();

        System.out.print("Please enter the interest rate (as a %): ");
        interestPct = scanner.nextDouble();

        // Convert percentage to decimal for calculation
        double r = interestPct / 100.0;

        // Compound interest formula: Final = Initial * (1 + r)^years
        finalValue = initialValue * Math.pow(1 + r, years);

        // Output result formatted with two decimals
        System.out.printf("The final value of the home is: %.2f%n", finalValue);

        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}