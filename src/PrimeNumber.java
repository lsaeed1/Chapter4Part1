/**
 * @class: PrimeNumber
 * @name: Leena Saeed
 * @course: ITEC 2140 - 13
 * @written on: October 5, 2023
 */

import java.util.Scanner;
// importing the Scanner class to accept user input

public class PrimeNumber {
    public static void main(String[] args) {
        // main method

        // instantiating the Scanner as 'scanner'
        Scanner scanner = new Scanner(System.in);

        // prompting the user to enter an integer
        System.out.println("Please enter an integer:");

        // allowing the user to enter an integer and storing it as an int named 'userNumber'
        int userNumber = scanner.nextInt();

        // boolean to assume that the number they entered is prime initially
        boolean isPrime = true;

        // Handling special cases: 0, 1, and negative numbers are not prime
        if (userNumber <= 1) {
            isPrime = false;
        }

        // Checking if userNumber is divisible by any number ranging from 2 and up to but not including userNumber itself
        else {
            for (int i = 2; i < userNumber; i++) {
                if (userNumber % i == 0) {
                    // If a factor is found, the number is not prime
                    isPrime = false;
                    break;
                }
            }
        }

        // closing the Scanner
        scanner.close();

        // Printing the result
        if (isPrime) {
            System.out.println(userNumber + " is a prime number.");
        } else {
            System.out.println(userNumber + " is not a prime number.");
        }
    }
}


