package Lesson7;

import java.util.Scanner;

public class Exercise3_Odd_or_Even {
    //Write a Java program to check whether a given number is even or odd.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int number = scanner.nextInt();
        int result = number%2;
        if(result == 0) {
            System.out.println(number + " is an even number ");
        }else{
                System.out.println(number + " is an odd number ");

        }
    }
}
