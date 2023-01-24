package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    /*
    lastModified, used to show when the menu was last updated with new items
    prints items based on category
     */
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private String category;
    private Date lastModified;


    public Menu(String category) {
        this.menuItems = new ArrayList<>();
        this.category = category;
        this.lastModified = new Date();
    }


    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public void addItem(MenuItem item) {
        this.menuItems.add(item);
        this.lastModified = new Date();
    }
    public void removeItem(MenuItem item) {
        menuItems.remove(item);
        lastModified = new Date();
    }

    @Override
    public String toString() {
        String results = "Menu \r\n*****\r\n" +
                getMenuItems() + "\r\n*****" +
                lastModified;
                /*this.menuItems +
                this.category + '\'' +
                this.lastModified +
                " --- ";


        for(MenuItem item : menuItems) {
            results += item.toString();
        }*/
        return "\r\n"+ getMenuItems();
    }

    public static void main(String[] args) {
        MenuItem pancakes = new MenuItem("Pancakes", "Entree","Three pancakes",3.99);
        //MenuItem scrambledSandwich = new MenuItem("Scrambled Sandwich", "Entree", "Chorizo, ham, pickled jalapenos, Swiss & American cheese, between toasted sourdough", 13.69);
        MenuItem coffee = new MenuItem("Coffee", "Drink","Coffee", 1.25);

        Menu menu = new Menu("Kens");
        menu.addItem(pancakes);
        //menu.addItem(scrambledSandwich);
        menu.addItem(coffee);
        System.out.println("Cat " + menu);
        System.out.println(coffee);
    }
}
