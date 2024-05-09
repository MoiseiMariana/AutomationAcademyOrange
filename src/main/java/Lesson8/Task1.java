package Lesson8;

public class Task1 {
    public static void main(String[] args) {
        int[] sequence = generateSequence(10);
        printArray(sequence);
    }
    public static int[] generateSequence(int n) {
        int[] array = new int[n];
        int value = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                array[i] = value;
            } else {
                array[i] = -value;
            }
            value++;
        }
        return array;
    }
    public static void printArray(int[] array2) {

        for (int num : array2) {
            System.out.print(num + " ");
        }
    }
}
