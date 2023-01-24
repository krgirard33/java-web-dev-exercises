package org.launchcode.java.studios.restaurantmenu;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

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
    private Date addedDate;

    // The next 3 lines format the date to 12-31-2023
    private String pattern = "MM-dd-yyyy";
    private Locale loc = new Locale("en","US");
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, loc);

    MenuItem(String itemName, String itemCategory, String itemDescription, Double itemPrice) {
        this.itemName = itemName;
        this.itemCategory = itemCategory;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.addedDate = new Date();
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

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    @Override
    // And suddenly I realize this is where the item is being printed from.
    public String toString() {

        return "\r\n*****\r\n" +
                "Name: " + itemName + "\t | \t" +
                "Category: " + itemCategory + "\r\n" +
                "Description: " + itemDescription + "\r\n" +
                "Price: $" + itemPrice +
                "\t|\tAdded Date: " + simpleDateFormat.format(addedDate) + "\r\n";
    }
}
