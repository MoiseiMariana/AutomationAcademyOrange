package Lesson4Homework;

public class Exercise1 {
    //Write a Java program to reverse an array of integers.
    public static void main(String[] args) {
        int[] myarray = {4, 6, 8, 2, 9, 4};
        System.out.println("Reversed array looks like this:");
        for (int i = myarray.length - 1; i >= 0; i--) {
            System.out.print( myarray[i] + " ");
        }
    }
}
