package DessertShop;

import java.util.ArrayList;

public class Customer {
    private String custName; // Customer name
    private ArrayList<Order> orderHistory; // List of orders
    private int custID; // Unique customer ID
    private static int nextCustID = 1000; // Static field for unique customer IDs

    // Constructor
    public Customer(String custName) {
        this.custName = custName;
        this.orderHistory = new ArrayList<>();
        this.custID = nextCustID; // Assign the next customer ID
        nextCustID++; // Static field for the next customer
    }

    // Getter customer name
    public String getName() {
        return custName;
    }

    // Setter customer name
    public String setName(String n) {
        this.custName = n;
        return this.custName;
    }

    // Getter customer ID
    public int getID() {
        return custID;
    }

    // Getter order history
    public ArrayList<Order> getOrderHistory() {
        return orderHistory;
    }

    // Add an order to the customer's order history
    public void addToHistory(Order o) {
        orderHistory.add(o);
    }

    // The customer ID is unique, so it will be automatically assigned when the object is created

}// end of costumer class

