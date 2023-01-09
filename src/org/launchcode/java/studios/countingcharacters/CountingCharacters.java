package org.launchcode.java.studios.countingcharacters;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class CountingCharacters {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println();
        String userstring;
        String fileName = "src/org/launchcode/java/studios/countingcharacters/fromfile.txt";

        String hiddenfig = "If the product of two terms is zero then common sense says at least one of the two terms " +
                "has to be zero to start with. So if you move all the terms over to one side, you can put the " +
                "quadratics into a form that can be factored allowing that side of the equation to equal zero. Once " +
                "you’ve done that, it’s pretty straightforward from there.";

        System.out.println("Enter text you wish counted:");
        userstring = input.nextLine();
        input.close();

        //characterCount(userstring);
        try {
            readFile(fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void characterCount(String args){
        HashMap<Character, Integer> charMap = new HashMap<>();
        args = args.toUpperCase().replaceAll("\\p{IsPunctuation} | \\p{Space}", "");
        char[] charactersInString = args.toCharArray();

        for (char c : charactersInString) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }
        System.out.println("Character Count");
        charMap.forEach((key,value) -> System.out.println(key+": "+ value));
    }

    public static void readFile(String filename) throws IOException {
        Path path = Paths.get(filename);
        Scanner scanner = new Scanner(path);
        String line = scanner.nextLine();
        characterCount(line);
        scanner.close();
    }
}
