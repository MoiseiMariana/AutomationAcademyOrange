package Lesson2Homework;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        //Write a program in Java to imput 5 numbers from the keyboard and find their sum and average
        Scanner result = new Scanner(System.in);
        System.out.println("The first number is : ");
        int nr1 = result.nextInt();
        System.out.println("The second number is : ");
        int nr2 = result.nextInt();
        System.out.println("The 3th number is :");
        int nr3 = result.nextInt();
        System.out.println("The 4th number is : ");
        int nr4 = result.nextInt();
        System.out.println("The 5th number is :");
        int nr5 = result.nextInt();
        int suma =nr1+nr2+nr3+nr4+nr5;
        double sum = (double)suma;
        double average = sum/5;
        System.out.println("The sum of the following 5 numbers is  " + suma + " "+ "and the average is  "+ average );
    }
}
