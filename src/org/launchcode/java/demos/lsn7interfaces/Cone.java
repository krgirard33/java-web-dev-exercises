package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Cone extends Ingredient {

    public Cone(String aName, double aCost, ArrayList<String> someAllergens){
        super (aName, aCost, someAllergens);
    }

    public static class ConeComparator implements Comparator<Cone> {
        @Override
        public int compare(Cone o1, Cone o2) {
            if (o1.getCost() - o2.getCost() < 0) {
                return -1;
            } else if (o1.getCost() - o2.getCost() > 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public static void printCones(ArrayList<Cone> cones) {

        StringBuilder conesList = new StringBuilder();
        for (Cone cone: cones) {
            conesList.append("\r\n"+cone);
        }
        System.out.println(conesList);
    }
    @Override
    public String toString() {
        return getName() + ": " + String.format("%.2f",getCost());
    }

}
