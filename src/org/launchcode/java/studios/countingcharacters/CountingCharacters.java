package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Scanner;

public class CountingCharacters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        String userstring;
        String hiddenfig = "If the product of two terms is zero then common sense says at least one of the two terms " +
                "has to be zero to start with. So if you move all the terms over to one side, you can put the " +
                "quadratics into a form that can be factored allowing that side of the equation to equal zero. Once " +
                "you’ve done that, it’s pretty straightforward from there.";

        System.out.println("Enter text you wish counted:");
        userstring = input.nextLine();

        characterCount(userstring);

    }

    public static void characterCount(String args){
        HashMap<Character, Integer> charMap = new HashMap<>();

        char[] charactersInString = args.toCharArray();

        for (char c : charactersInString) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c)+1);
            }
            else {
                charMap.put(c,1);
            }
        }
        System.out.println("Character Count");
        charMap.forEach((key,value) -> System.out.println(key+": "+ value));
    }
}
