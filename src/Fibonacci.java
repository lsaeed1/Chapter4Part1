/**
 * @class: Fibonacci
 * @name: Leena Saeed
 * @course: ITEC 2140 - 13
 * @written on: October 5, 2023
 */

public class Fibonacci {
    public static void main(String[] args) {

        int n = 30; // defining the number of Fibonacci numbers to generate

        // initializing the first two Fibonacci numbers
        int firstNum = 0;
        int secondNum = 1;

        // says how many Fibonacci numbers will print, in this case 30
        System.out.println("First " + n + " Fibonacci numbers:");

        // printing the first two numbers in the series
        System.out.print(firstNum + ", " + secondNum + ", ");

        // generate and print the rest of the series
        for (int i = 3; i <= n; i++) {
            int nextNum = firstNum + secondNum;
            System.out.print(nextNum + ", ");

            // update firstNum and secondNum for the next iteration
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}
