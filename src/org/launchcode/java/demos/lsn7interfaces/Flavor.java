package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Flavor extends Ingredient {


    public Flavor(String aName, double aCost, ArrayList<String> someAllergens){
        super (aName, aCost, someAllergens);

    }

    public static class FlavorComparator implements Comparator<Flavor> {
        @Override
        public int compare(Flavor o1, Flavor o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static void printFlavors(ArrayList<Flavor> flavors) {
        StringBuilder flavorsList = new StringBuilder();
        for (Flavor flavor: flavors) {
            flavorsList.append("\r\n"+flavor);
        }
        System.out.println(flavorsList);
    }

    @Override
    public String toString() {
        return getName() + ": " + String.format("%.2f",getCost());
    }
}
