package Lesson1Homework;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        //2)Write a program to take two integer inputs from user and print sum and product of them.
        Scanner sumaof2numbers = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number1 = sumaof2numbers.nextInt();
        System.out.println("Type another one: ");
        int number2 = sumaof2numbers.nextInt();
        int suma = number1+number2;
        int product = number1*number2;
        System.out.println("The Sum for the numbers " + number1 + " and "+ number2 + " is "+ suma + " and the product of them is "+ product);

    }
}
