package Lesson3Homework;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        //Write a program where the user enters any positive integer. The program then calculates the sum of all numbers from 1 to the number entered by the user.
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a positive integer number: ");
            int number = scan.nextInt();
            int suma = 0;
            int i = 1;
            while (i <= number) {
                suma += i;
                i++;
            }
            System.out.println("The sum of all the number until  " + number + " is: " + suma);
        }
    }