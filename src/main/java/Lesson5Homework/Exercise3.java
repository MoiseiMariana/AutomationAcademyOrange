package Lesson5Homework;

public class Exercise3 {
    // Write a method that takes an integer and returns the sum of its digits.
    //  For example, for the number 123, the sum of its digits would be 6 (1 + 2 + 3)
    public static int sumOfDigits(int n) {
        int suma = 0;
        while (n > 0) {
            suma += n % 10;
            n /= 10;
        }
        return suma;
    }

    public static void main(String[] args) {
        int number = 75;
        System.out.println("Sum of digits contains in " + number + " is : " + sumOfDigits(number));

    }
}

