package Lesson5Homework;

public class Exercise1 {
    // Write a method that takes an integer as an argument and returns its factorial. The factorial of a number 𝑛n (denoted as 𝑛!n!) is the product of all integers from 1 to 𝑛.
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println("The factorial is  : " + + factorial(12));
    }


}
//Just for me
// 5! = 5*4*3*2*1
//Ce inseamna de facto factorial?
//3! {1,2,3} {1,3,2} {2,1,3} {2, 3, 1} {3,1,2} {3,2,1}
//1! 1 {1}
//0! 1 { }

//What is
