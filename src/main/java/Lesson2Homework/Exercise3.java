package Lesson2Homework;

import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        // Prompt the user to enter a year
        System.out.println("Enter a year: ");
        int year = check.nextInt();

        // Check if the year is a leap year
        boolean isLeapYear = false;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeapYear = true;
        }

        // Print the result
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

    }
}
