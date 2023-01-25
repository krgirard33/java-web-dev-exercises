package org.launchcode.java.studios.restaurantmenu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    /*
    lastModified, used to show when the menu was last updated with new items
    prints items based on category
     */
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastModified;

    // No constructor definition — allow for default constructor

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    // Define custom toString() method
    @Override
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getItemCategory().equals("appetizers")) {
                appetizers.append("\n" + item.toString() + "\n");
            }
        }
        StringBuilder entrees = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getItemCategory().equals("entrees")) {
                entrees.append("\n" + item.toString() + "\n");
            }
        }
        StringBuilder desserts = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getItemCategory().equals("desserts")) {
                desserts.append("\n" + item.toString() + "\n");
            }
        }
        StringBuilder drinks = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getItemCategory().equals("drinks")) {
                drinks.append("\n" + item.toString() + "\n");
            }
        }
        return "\nTONY'S PIZZA MENU\n" +
                "APPETIZERS" + appetizers.toString() + "\n" +
                "ENTREES" + entrees.toString() + "\n" +
                "DESSERTS" + desserts.toString() + "\n" +
                "DRINKS" + drinks.toString();
    }


    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public LocalDate getLastModified() {
        return lastModified;
    }

    public void setLastModified(LocalDate lastModified) {
        this.lastModified = lastModified;
    }

    // Define addItem()
    // Make sure to update lastUpdated anytime something is successfully added
    // BONUS MISSION: prevent addition of duplicates
    void addItem(MenuItem newItem) {
        String message = "That item has already been added to the menu.";
        if (menuItems.contains(newItem)) {
            System.out.println(message);
            return;
        }
        for (MenuItem item : menuItems) {
            if (item.equals(newItem)) {
                System.out.println(message);
                return;
            }
        }
        menuItems.add(newItem);
        lastModified = LocalDate.now();
    }

    // Define removeItem()
    public void removeItem(MenuItem item) {
        menuItems.remove(item);
        lastModified = LocalDate.now();
    }
}
