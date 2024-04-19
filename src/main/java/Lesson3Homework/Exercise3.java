package Lesson3Homework;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        //Write a program to find the Maximum of Two Numbers using switch statement
        Scanner numbers = new Scanner(System.in);
        System.out.println("Please type a number: ");
        int n1 = numbers.nextInt();
        System.out.println("Please type the second one: ");
        int n2 = numbers.nextInt();
        numbers.nextLine();
        System.out.println("Type the word 'maximum' if you want to know witch of them is greater: ");
        String here = numbers.nextLine();

        int max = Math.max(n1,n2);

        switch (here){
            case "maximum":
                System.out.println("From "+ n1 + " and " + n2 + " the greatest one is  " + max);
            break;
            default:
                System.out.println("You did a typo mistake");
        }
    }
}
