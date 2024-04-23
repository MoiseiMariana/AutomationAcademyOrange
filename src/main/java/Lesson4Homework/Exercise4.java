package Lesson4Homework;
public class Exercise4 {
    public static void main(String[] args) {
        //Write a Java program to calculate the average of all elements in an integer array.
        int a[] = {45, 67, 34, 21, 78};
        int sum = 0;
        for(int element : a){
            sum += element;
        }
        double average = (double) sum / a.length;
        System.out.println("Average of the elements: " + average);
    }
}
