package exercises.chap3;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] intArray = {1, 1, 2, 3, 5, 8};

        for(int i=0; i<intArray.length;i+=2) {
            System.out.println(intArray[i]);
        }
        // Playing with strings
        String longline = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        // Split for each word
        String[] wordArray = longline.split(" ");
        System.out.println(Arrays.toString(wordArray));
        // Split for each sentence. I want to use .join(".") so they are correct.
        String[] sentenceArray = longline.split("\\.");
        System.out.println(Arrays.toString(sentenceArray));
    }
}
