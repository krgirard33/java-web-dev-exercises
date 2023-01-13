package org.launchcode.java.studios.restaurantmenu;

import java.util.Date;

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

    private MenuItem(String itemName, String itemCategory, String itemDescription, Double itemPrice) {
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
}
