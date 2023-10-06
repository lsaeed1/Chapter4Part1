/**
 * @class: HighestAndLowestGrade
 * @name: Leena Saeed
 * @course: ITEC 2140 - 13
 * @written on: October 5, 2023
 */

import java.util.Scanner;
// importing the Scanner class to accept user input

public class HighestAndLowestGrade {
    public static void main(String[] args) {
        // main method

        // instantiating the Scanner as 'scanner' to read user input
        Scanner scanner = new Scanner(System.in);

        // initializing variables to keep track of highest and lowest grades
        double highestGrade = Integer.MIN_VALUE; // Initialize to the smallest possible integer
        double lowestGrade = Integer.MAX_VALUE;  // Initialize to the largest possible integer

        // prompt the user to enter student grades or 'c'
        System.out.println("Enter student grades (each on a new line) or enter 'c' to calculate the highest and lowest grades: ");

        // continuous loop to read user input until 'c' is entered
        while (true) {
            // Read a line of input from the user and store it as 'input'
            String input = scanner.nextLine();

            // if the user wants to calculate grades ('c' was entered)
            if (input.equalsIgnoreCase("c")) {
                break; // Exit the loop
            }

            // assume the input is valid unless proven otherwise
            boolean isValid = true;

            // converting 'input' into an array using .toCharArray() method and iterating over every character using i, to determine if it is a number
            for (char i : input.toCharArray()) {

                // Character.isDigit(i) checks if the character 'i' is a digit (0-9)
                if (!Character.isDigit(i)) {
                    isValid = false; // sets isValid to false if a non-digit character is found
                    break; // exit the loop since we already know it's invalid
                }
            }

            // if the input consists only of digits, process it
            if (isValid) {
                double grade = Double.parseDouble(input); // Convert the input to a double

                // update highestGrade if the current grade is higher
                if (grade > highestGrade) {
                    highestGrade = grade;
                }

                // update lowestGrade if the current grade is lower
                if (grade < lowestGrade) {
                    lowestGrade = grade;
                }
            } else {
                // notify the user of invalid input and ask for valid input
                System.out.println("Invalid input. Please enter valid grades in the right format (each on a new line) or enter 'c'.");
            }
        }

        // check if no valid grades were entered
        if (highestGrade == Integer.MIN_VALUE && lowestGrade == Integer.MAX_VALUE) {
            System.out.println("No valid grades entered.");
        } else {
            // print out the highest and lowest grades
            System.out.println("Highest student grade is " + highestGrade);
            System.out.println("Lowest student grade is " + lowestGrade);
        }

        // closing the scanner
        scanner.close();
    }
}
