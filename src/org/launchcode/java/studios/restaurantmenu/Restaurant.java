package org.launchcode.java.studios.restaurantmenu;

public class Restaurant {
    public static void main(String[] args){
        MenuItem pancakes = new MenuItem("Pancakes", "Entree","Three pancakes",3.99);
        MenuItem scrambledSandwich = new MenuItem("Scrambled Sandwich", "Entree", "Chorizo, ham, pickled jalapenos, Swiss & American cheese, between toasted sourdough", 13.69);
        MenuItem coffee = new MenuItem("Coffee", "Drink","Coffee", 1.25);

        Menu menu = new Menu("Kens");
        menu.addItem(pancakes);
        menu.addItem(scrambledSandwich);
        menu.addItem(coffee);
        System.out.println("Cat " + menu);
        System.out.println("Single: " + pancakes);
    }
}
