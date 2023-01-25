package org.launchcode.java.studios.restaurantmenu;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Locale;
import java.time.temporal.ChronoUnit;

public class MenuItem {

    /*
    price, description, and category (appetizer, main course, or dessert)
    Maybe store it all in an ArrayList<HashMap<string, string>> and then convert stuff as needed?
    addedDate, used for if (addedDate < 90 days from now) show NEW!!!
    name
    String category (Should come from a list, which would be its own thing)
    String description
    price
    */
    private String itemName;
    private String itemCategory;
    private String itemDescription;
    private double itemPrice;
    private final LocalDate addedDate;

    // The next 3 lines format the date to 12-31-2023
    /*
    private String pattern = "MM-dd-yyyy";
    private Locale loc = new Locale("en","US");
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, loc);
     */

    MenuItem(String itemName, String itemCategory, String itemDescription, Double itemPrice) {
        this.itemName = itemName;
        this.itemCategory = itemCategory;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        //this.addedDate = LocalDate.now();
        // Use line below instead of line above to test isNew() returning false
        this.addedDate = LocalDate.parse("2022-06-12");
        /*
            About the LocalDate class: https://www.w3schools.com/java/java_date.asp
        */
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public LocalDate getAddedDate() {
        return addedDate;
    }

    @Override
    public String toString() {
        String newText = isNew() ? " - NEW!" : "";
        return itemName + newText + '\n' +
                itemDescription + " | $" + itemPrice;
    }
    // Define custom equals() method
    @Override
    public boolean equals(Object toBeCompared) {
        // Reference check
        if (this == toBeCompared) {
            return true;
        }

        // Null check
        if (toBeCompared == null) {
            return false;
        }

        // Class check
        if (getClass() != toBeCompared.getClass()) {
            return false;
        }

        MenuItem otherItem = (MenuItem) toBeCompared;

        return this.itemName.equals(otherItem.getItemName());
    }

    // Define instance method isNew()
    boolean isNew() {
        LocalDate today = LocalDate.now();
        double daysBetween = addedDate.until(today, ChronoUnit.DAYS);
        System.out.println(daysBetween + " days since " + itemName + " was added");
        return daysBetween < 90;
    }

}
