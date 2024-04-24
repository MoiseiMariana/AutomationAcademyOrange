package Lesson5Homework;

public class Exercise2 {
    public static boolean isPalindrome(String word) {
        word = word.toLowerCase();
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "LOL";
        System.out.println("This word is a palindrome? " + isPalindrome(word));

    }
}

