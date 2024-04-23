package Lesson4Homework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exercise3 {
    public static void main(String[] args) {
        // Write a Java program to find the intersection of two arrays (common elements).
        int[] a = {333, 540, 123, 99, 7, 80};
        int[] b = {40, 766, 540, 7, 89, 99};

        Set<Integer> common = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    common.add(a[i]);
                    break;
                }
            }
        }
        System.out.println("The common elements between array a and b are : " + common);
    }
}
