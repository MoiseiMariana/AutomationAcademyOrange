package Lesson1Homework;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        //3)Take side of a square from user and print area and perimeter of it.
        Scanner sideofsquare = new Scanner(System.in);
        System.out.println("The side of a square is : ");
        int side = sideofsquare.nextInt();
        int perimeter = 4*side;
        int aria = side*side;
        System.out.println("The perimeter of a square with side=" + side + " is "+ perimeter +" and the aria is "+aria );

    }
}
