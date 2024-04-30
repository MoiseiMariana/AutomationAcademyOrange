package Lesson7;

import java.util.Scanner;

public class Exercise1_Substraction {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Write the first number: ");
        int n1 = scanner1.nextInt();//will be 5
        System.out.println("Write the second number: ");
        int n2 = scanner1.nextInt();//will be 1

        int count = 0;
        int result = n1;
        while(result > 0){
            result -=n2;
            count++;
    }
        System.out.println("So the result is: "+ count + " times.");

        //here is the second method
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Write the first number: ");
        int nmb1 = scanner2.nextInt();
        System.out.println("Write the second number: ");
        int nmb2 = scanner2.nextInt();

        int countSubstractions = nmb1 / nmb2;

        System.out.println("The second number can be subtracted from the first " + countSubstractions + " times.");

    }

}
