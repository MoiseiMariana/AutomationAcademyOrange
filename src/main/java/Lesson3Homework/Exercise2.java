package Lesson3Homework;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        //Write a program to create simple calculator using switch Statement
        Scanner calculate = new Scanner(System.in);
        System.out.println("Please type a number: ");
        double n1 = calculate.nextDouble();
        System.out.println("Please type an Math Operator: +, -, /, * ");
        char operation =calculate.next().charAt(0);
        System.out.println("Please type the second number: ");
        double n2 = calculate.nextDouble();

        double result;
        switch (operation){
            case '+':
                result= n1+n2;
                System.out.println("The sum of the " + n1 + " and the " + n2 + " is "+ result);
                break;
            case '-':
                result =n1-n2;
                System.out.println("The difference between " + n1 + " and " + n2 + " is "+ result);
                break;
            case '*':
                result =n1*n2;
                System.out.println("The product of " + n1 + " and " + n2 + " is "+ result);
                break;
            case '/':
                result =n1/n2;
                System.out.println("The distribution of " + n1 + " and " + n2 + " is "+ result);
                break;
            default:
                System.out.println("Sorry you have introduced an invalid operator");
                break;
        }
    }
}
