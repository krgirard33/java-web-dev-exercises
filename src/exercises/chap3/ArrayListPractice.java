package exercises.chap3;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        int[] base = {11,22,33,24,25,36,47,18,9,10};
        String greeneggs = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] lyrics = greeneggs.replaceAll("\\p{IsPunctuation}", "").split(" ");

        ArrayList<Integer> testone = new ArrayList<>();
        for(int item : base) {
            testone.add(item);
        }
        System.out.println(sumEvens(testone));

        // Makes an ArrayList out of lyrics
        ArrayList<String> testtwo = new ArrayList<>();
        for(String word : lyrics) {
            testtwo.add(word);
        }
        System.out.println(fiveLetters(testtwo));
    }
    public static int sumEvens(ArrayList<Integer> testone) {
        int sum = 0;
        // int total = 0;
        for (int num : testone) {
            //total += num; // making sure it really is only summing evens
            if (num % 2 == 0) {
                sum += num;
            }
        }
        //System.out.println(total);
        return sum;
    }

    public static String fiveLetters(ArrayList<String> testtwo){
        String savedWords = "";
        String message;
        Scanner input = new Scanner(System.in);
        System.out.println("How long a word do you want?");
        int userNum = input.nextInt();
        input.close();

        for (String word : testtwo) {
            if (userNum == word.length()) {
                savedWords += word+", ";
            }
        }
        if (savedWords.length() == 0) {
            message = "There are no "+userNum+" letter length words.";
        } else {
            message = "The following words are "+userNum+" letters long: "+savedWords;
        }
        return message;
    }
}
