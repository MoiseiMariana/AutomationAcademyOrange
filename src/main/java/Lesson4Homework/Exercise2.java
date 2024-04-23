package Lesson4Homework;

import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        //Write a Java program to sort an array of integers in ascending and descending order.
        int[] array = {5, 8, 99, 56, 600, 45};
        Arrays.sort(array);
        System.out.println("This array in ascending order would look like thi: " + Arrays.toString(array));
        System.out.println("And now the array in descending order: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]+ " ");
        }
    }
}
