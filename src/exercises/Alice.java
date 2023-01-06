package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] argv){
        String textToSearch = "Alice was beginning to get very tired of sitting by her sister " +
                "on the bank, and of having nothing to do: once or twice she had peeped " +
                "into the book her sister was reading, but it had no pictures or " +
                "conversations in it, 'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        // Get the word
        System.out.println("What word would you like to look for?");
        String word = input.nextLine().toLowerCase();
        input.close();
        // word = word.toLowerCase();

        // finds the 1st occurrence of word in the text
        int ind = textToSearch.toLowerCase().indexOf(word);

        // gives true/false on if word is in the text
        // System.out.println((ind>0));
        if(ind>0) {
            //if word found
            System.out.println(word + " starts at " + ind + " and is " + word.length() + " letters long.");
            /*
            If we wanted to print out what was at that index location
             System.out.println(str.substring(i, i+word.length()));
             */
            // removes 1st occurrence of word
            textToSearch = textToSearch.replaceFirst(word,"");
            // removes all double spaces, replaces with single space. store in a new String
            String wordRemoved = textToSearch.replaceAll("  ", " ");
            System.out.println(wordRemoved);
        }
        else{
            System.out.println("Word not found");
        }
    }
}
