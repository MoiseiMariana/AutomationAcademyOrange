package Lesson1Homework;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sqr = new Scanner(System.in);
        //1)Write a program to find square of a number.
        System.out.println("Type a number to get his square: ");
        int numb1 = sqr.nextInt();
        int result = numb1*numb1;
        System.out.println("The square of " +numb1+ " is : " + result);
    }
}
