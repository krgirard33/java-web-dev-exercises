package org.launchcode.java.studios.restaurantmenu;

public class Restaurant {
    public static void main(String[] args){
        MenuItem pancakes = new MenuItem("Pancakes", "entrees","Three pancakes",3.99);
        MenuItem scrambledSandwich = new MenuItem("Scrambled Sandwich", "entrees", "Chorizo, ham, pickled jalapenos, Swiss & American cheese, between toasted sourdough", 13.69);
        MenuItem coffee = new MenuItem("Coffee", "drinks","coffee", 1.25);
        MenuItem pieApple = new MenuItem("Apple Pie","desserts","Apple Pie",2.49);
        MenuItem toastedRavioli = new MenuItem("Toasted Ravioli", "appetizers", "A St. Louis favorite, served with a side of pizza sauce", 6.89);

        Menu menu = new Menu();
        menu.addItem(pancakes);
        menu.addItem(scrambledSandwich);
        menu.addItem(coffee);
        menu.addItem(pieApple);
        System.out.println("Cat " + menu);
        System.out.println("Single: " + pancakes);
    }
}
