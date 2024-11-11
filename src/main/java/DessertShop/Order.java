package DessertShop;

import java.util.ArrayList;

public class Order {
    private ArrayList<DessertItem> order; //attricute to keep the list of DessertItem objects

    //Constructor
    public Order() {
        this.order = new ArrayList<>();//start Arraylist
    }

    //Method to return the ArrayList of DessertItem objects
    public ArrayList<DessertItem> getOrderList() {
        return this.order;
    }

    //Method to add a DessertItem
    public DessertItem add(DessertItem item) {
        this.order.add(item); //add item
        return item; //return the added item
    }

    //Method to return the number of items in the order
    public int itemCount() {
        return this.order.size(); //return the size of the array list
    }
}// end of order class
