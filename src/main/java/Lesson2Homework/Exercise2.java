package Lesson2Homework;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        // Write a Java program that takes three numbers from the user and prints the greatest number
        Scanner greatest = new Scanner(System.in);
        System.out.println("The first number is: " );
        int numar1 = greatest.nextInt();
        System.out.println("The second number is: ");
        int numar2 = greatest.nextInt();
        System.out.println("The 3th number is: " );
        int numar3 = greatest.nextInt();
        // Finding the greatest number using Math.max()
        int greatestNumber = Math.max(numar1, Math.max(numar2, numar3));
        // Printing the greatest number
        System.out.println("The greatest number is: " + greatestNumber);

    }
}
