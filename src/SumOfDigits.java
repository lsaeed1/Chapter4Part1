/**
 * @class: SumOfDigits
 * @name: Leena Saeed
 * @course: ITEC 2140 - 13
 * @written on: October 5, 2023
 */

import java.util.Scanner;
// importing the Scanner class to accept user input

public class SumOfDigits {
    public static void main(String[] args) {

        // instantiating the Scanner as 'scanner' to read user input
        Scanner scanner = new Scanner(System.in);

        // prompt the user to enter an integer
        System.out.print("Enter an integer: ");

        // store the integer input from the user
        int originalNumber = scanner.nextInt();

        // creating a different variable to do calculations on
        int number = originalNumber;

        // to calculate the sum of the digits, initialize sum as 0
        int sum = 0;
        // iterate through each digit of the number
        while (number != 0) {

            // get the last digit of the number using modulo operation
            int digit = number % 10;

            // adding the last digit to the sum
            sum += digit;

            // removing the last digit from the number
            number /= 10;

            // loop repeats until all digits of the entered number are added
        }

        // closing the scanner
        scanner.close();

        // printing the result
        System.out.println("Sum of the digits of " + originalNumber + " is " + sum);
    }
}

