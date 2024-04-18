package Lesson2Homework;

public class Exercise5 {
    public static void main(String[] args) {
        String sentence = "I love Java";
        // a) Print the letter at index 4
        char letterAtIndex4 = sentence.charAt(4);
        System.out.println("The letter at index 4 is: " + letterAtIndex4);
        //b) Print the index of letter "J"
        int indexOfj = sentence.indexOf("J");
        System.out.println("The index of letter J in this sentence is: "+ indexOfj);
        //c) Add to this senthence "and QA Automation"
        String s = " and QA Automation";
        System.out.println(sentence+s);
        //d) Check via boolean if the phrase "I love java" is of type String.
        boolean checker = sentence instanceof String;
        System.out.println("Is that phrase a String? " + checker);

    }
}
