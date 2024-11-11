package DessertShop;

import java.util.ArrayList;

public class Order {
    private ArrayList<DessertItem> order; // Attribute to store the list of DessertItem objects

    // Constructor
    public Order() {
        this.order = new ArrayList<>(); // Initialize the ArrayList
    }

    // Method to return the ArrayList of DessertItem objects
    public ArrayList<DessertItem> getOrderList() {
        return this.order;
    }

    // Method to add a DessertItem
    public DessertItem add(DessertItem item) {
        this.order.add(item); // Add item to the list
        return item; // Return the added item
    }

    // Method to return the number of items in the order
    public int itemCount() {
        return this.order.size(); // Return the size of the ArrayList
    }

    // Method to calculate and return the total cost for all items in the order
    public double orderCost() {
        double totalCost = 0.0;
        for (DessertItem item : order) {
            totalCost += item.calculateCost(); // Sum up the cost of each item
        }
        return totalCost;
    }

    // Method to calculate and return the total tax for all items in the order
    public double orderTax() {
        double totalTax = 0.0;
        for (DessertItem item : order) {
            totalTax += item.calculateTax(); // Sum up the tax of each item
        }
        return totalTax;
    }
} // end of Order class

