/**
 * @class: Factorial
 * @name: Leena Saeed
 * @course: ITEC 2140 - 13
 * @written on: October 5, 2023
 * (this program only works for 'int' types)
 */

import java.util.Scanner;
// importing the Scanner class to accept user input

public class Factorial {
    public static void main(String[] args) {

        // instantiating the Scanner as 'scanner' to read user input
        Scanner scanner = new Scanner(System.in);

        // prompt the user to enter an integer value
        System.out.print("Enter an integer to calculate its factorial: ");

        // read the user's input as an integer
        int n = scanner.nextInt();

        // close the Scanner since we have obtained the input
        scanner.close();

        // initialize the factorial variable to 1 (as 0! = 1)
        int factorial = 1;

        // special case for 0 and 1
        if (n == 0 || n == 1) {
            factorial = 1;
        }

        // Calculate factorial for values greater than 1
        else {
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
        }

        // Print the factorial of the user-provided value
        System.out.println(n + "! = " + factorial);
    }
}

