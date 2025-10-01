/** */
 * Name: Jesus Escobar
 * Date: 9 September 2025
* Purpose: InClass 3 - This program will take user input as the side of the cube 
 */
import java.util.Scanner; // Don't forget to import and declare a Scanner for user input.

public class InClass3_Jesus_Escobar
{
    public static void main(String[] args)
    {
        // Remember three major steps: Input - Processing - Output
        Scanner input = new Scanner(System.in);
    
        // In-Class 3 Example:
        // declare three variables to be used in this program, all of which are double data types
        double side, volume, surfaceArea;

        // Step 1: Prompt the user to enter the length of the side of a cube.
        System.out.print("Please enter the length of teh cube's side: ");

        // Step 2: Read the user's input and store it in a variable.
        side = input.nextDouble(); // side is INPUT by the user
    

        // Step 3: Use an appropriate method to determine the volume of the cube.
        //volume = side * side * side; // side "cubed", this is correct, but let's math it up some more
        volume = Math.pow(side, 3);

        // Step 4: Use an appropriate method to determine the surface area of the cube.
        // the forumla of surface are ist he side "squared", multiplied times six
        surfaceArea = 6 * Math.pow(side, 2); 
        // HINT: Steps 3 and 4 will use the Math.pow(a, b) method

        // Step 5: Print the volume and surface area in clear sentences.
        System.out.println("The volume of the cube is " + volume);
        System.out.println("The Surface area of the cube is " + surfaceArea);
    }
}