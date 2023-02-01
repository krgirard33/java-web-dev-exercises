package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Topping extends Ingredient {
    public Topping(String aName, double aCost, ArrayList<String> someAllergens) {
        super(aName, aCost, someAllergens);
    }

    public static class ToppingComparator implements Comparator<Topping> {

        @Override
        public int compare(Topping o1, Topping o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static void printToppings(ArrayList<Topping> toppings) {
        System.out.println("\r\n*** TOPPINGS ***");
        StringBuilder toppingsList = new StringBuilder();
        for (Topping topping : toppings) {
            toppingsList.append("\r\n"+topping);
        }
        System.out.println(toppingsList);
    }

    @Override
    public String toString() {
        return getName() + ": " + String.format("%.2f",getCost());
    }
}
