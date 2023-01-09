package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;

public class CountingCharacters {

    public static void main(String[] args) {
        String hiddenfig = "If the product of two terms is zero then common sense says at least one of the two terms " +
                "has to be zero to start with. So if you move all the terms over to one side, you can put the " +
                "quadratics into a form that can be factored allowing that side of the equation to equal zero. Once " +
                "you’ve done that, it’s pretty straightforward from there.";


        characterCount(hiddenfig);

    }

    public static void characterCount(String hiddenfig){
        HashMap<Character, Integer> charMap = new HashMap<>();

        char[] charactersInString = hiddenfig.toCharArray();

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
