package Lesson3Homework;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        //Write a program to read gender(M/F) and print the corresponding gender using a switch statement
        Scanner genderdetector =new Scanner(System.in);
        System.out.println("Please enter you gender (M/F): ");
        char gender = genderdetector.next().charAt(0);

        switch (gender){
            case 'M' :
                System.out.println("You are a male ");
            break;
            case 'F':
                System.out.println("You are a female");
            break;
            default:
                System.out.println("Please use only F or M CAPSLOCK characters for gender detection, make sure you didn't made typo mistakes");

        }

    }
}
