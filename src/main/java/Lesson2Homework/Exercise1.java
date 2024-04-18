package Lesson2Homework;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        // 1)Write a Java program to get a number fom the user and print whether it is positive or negative

        Scanner getnumber = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = getnumber.nextInt();
        if(number<0){
            System.out.println("The provided number is");
        }else if (number>0) {
            System.out.println("The provided number is positiv");
        }else{
            System.out.println("The number is 0");

            }
        }
    }

