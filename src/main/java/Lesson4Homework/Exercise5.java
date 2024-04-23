package Lesson4Homework;
import java.util.HashSet;
import java.util.Set;
public class Exercise5 {
    public static void main(String[] args) {
        //Write a Java program to search for a specific element in an array and return its index.
      int [] a = {4, 9, 10, 44, 23};
      int [] b ={ 8, 10, 11, 17, 15, 44};
        Set<Integer> c = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        for (int num : a) {
            set1.add(num);
        }
        for (int num : b) {
            if (set1.contains(num)) {
                c.add(num);
            }
        }
        System.out.println("Intersection of array a and b is : " + c);
    }
}


