package Lesson4Homework;
import java.util.Arrays;
public class Exercise6 {
    public static void main(String[] args) {
    //Write a Java program to merge two sorted arrays into a single sorted array.
        int [] a = {11, 22, 33, 44, 55};
        int [] b = {100, 110, 120, 130};
        int [] c = new int[a.length +b.length];

        for(int i =0; i<a.length; i++){
            c[i]= a[i];
        }
        for(int i =0; i<b.length; i++){
            c[i+a.length]=b[i];
        }
        System.out.println(Arrays.toString(c));
    }
}
