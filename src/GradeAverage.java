/**
 * @class: GradeAverage
 * @name: Leena Saeed
 * @course: ITEC 2140 - 13
 * @written on: October 5, 2023
 */

import java.util.Scanner;
// importing the Scanner class to accept user input

public class GradeAverage {
    public static void main(String[] args) {
        // main method

        // instantiating the Scanner as 'scanner' to read user input
        Scanner scanner = new Scanner(System.in);

        double sum = 0;  // initializing the sum of grades
        double count = 0;  // initializing the count of grades

        // prompt the user to enter student grades or 'c'
        System.out.println("Enter student grades (each on a new line) or enter 'c' to calculate the average:");

        // continuous loop to read user input until 'c' is entered
        while (true) {
            // read a line of input from the user and store it as 'input'
            String input = scanner.nextLine();

            // if the user wants to calculate the average ('c' was entered)
            if (input.equalsIgnoreCase("c")) {
                break; // exit the loop
            }

            // assuming that the input is valid unless proven otherwise
            boolean isValid = true;

            // convert 'input' into a double and handle any potential exceptions
            try {
                double grade = Double.parseDouble(input);
                sum += grade; // add grade to the sum of grades
                count++; // increment the count of grades
            } catch (NumberFormatException e) {
                isValid = false; // if an exception occurred, set isValid to false
            }

            // if the input is not a valid number, notify the user
            if (!isValid) {
                System.out.println("Invalid input. Please enter valid grades in the right format (each on a new line) or enter 'c'.");
            }
        }

        // check if no valid grades were entered
        if (count == 0) {
            System.out.println("No valid grades entered.");
        } else {
            // calculate and print the average
            double average = sum / count;
            System.out.println("Average student grade is " + average);
        }

        // closing the scanner
        scanner.close();
    }
}
