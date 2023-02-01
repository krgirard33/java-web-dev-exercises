package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        Collections.sort(flavors, new Flavor.FlavorComparator());

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        Collections.sort(cones, new Cone.ConeComparator());

        Collections.sort(toppings, new Topping.ToppingComparator());


        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        Cone.printCones(cones);
        Flavor.printFlavors(flavors);
        Topping.printToppings(toppings);

    }
}
