package exercises.chap3;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        int[] base = {11,22,33,24,25,36,47,18,9,10};
        String[] lyrics = {"I","watch","the","ripples", "change","their","size","But","never","leave","the","stream"};
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
        for (String word : testtwo) {
            if (word.length() == 5) {
                savedWords += word+", ";
            }
        }
        return savedWords;
    }
}
