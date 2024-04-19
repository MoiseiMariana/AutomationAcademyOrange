package Lesson3Homework;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        //Write a Java program that calculates the factorial of a given non-negative integer using a while loop. The factorial of a non-negative integer n, denoted by n!, is the product of all positive integers less than or equal to n.
        //Example: For input n = 5, the factorial is calculated as 5! = 5 * 4 * 3 * 2 * 1 = 120.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer number: ");
        int number = scan.nextInt();

        int factorial = 1;
        int i = 1;
        while (i <= number) {
            factorial *= i;
            i++;
        }
        System.out.println("The factorial of the number " + number + " is: " + factorial);
    }
}

