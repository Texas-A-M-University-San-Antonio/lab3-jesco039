// Lab3_Jesus_Escobar

import java.util.Scanner; // Need for reading input from the user

public class Lab3_Jesus_Escobar 
{
    public static void main(String[] args)
    {
        // Create Scanner object for keyboard input
        Scanner scanner = new Scanner(System.in);

        // Declare the required variables:
        // initialValue: double
        // years: initialValue
        //interestPct: double
        // finalValue: double
        double initialValue;
        int years;
        double interestPct;
        double finalValue;

        // Prompt and read inital Value
        System.out.print("Please enter the initial value of teh home: ");
        initialValue = scanner.nextDouble();

        //Prompt and read numbers of years
        System.out.print("Please enter the numbger of elapsed years: ");
        years = scanner.nextInt();

        // Prompt and read interrest rate
        System.out.print("Please enter the interest rate: ");

        // Convert interest percentage to decimal from
        double r = interestPct / 100.0;

        // Apply compound interest formula: A = P * (1 + r)^t
        finalValue = initialValue * Math.pow(1 + r, years);

        // Display final value formatted to 2 decimal places
        System.out.printf("The final value of the home is: %.2f%n", finalValue);

        // Close scanner (good practice to release resources)
        scanner.close();
    }
}