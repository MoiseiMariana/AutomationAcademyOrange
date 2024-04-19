package Lesson3Homework;
public class Exercise5 {
    public static void main(String[] args) {
        //Display on the screen the multiplication table for 3.
        int i = 1; // Pornim de la 1 pentru a începe de la prima înmulțire
        while (i <= 10) {
            int result = i * 3; // Calculăm rezultatul corect pentru fiecare înmulțire
            System.out.println(i + " * 3 = " + result); // Afișăm rezultatul corect
            i++; // Incrementăm contorul
        }
    }
}