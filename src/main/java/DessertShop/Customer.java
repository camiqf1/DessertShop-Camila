package DessertShop;

import java.util.ArrayList;

public class Customer {
    private String custName; // Customer name
    private ArrayList<Order> orderHistory; // List of orders
    private int custID; // Unique customer ID
    private static int nextCustID = 1000; // Static field for unique customer IDs

    // Constructor that takes a single argument for custName
    public Customer(String custName) {
        this.custName = custName;
        this.orderHistory = new ArrayList<>();
        this.custID = nextCustID; // Assign the next available customer ID
        nextCustID++; // Increment static field for next customer ID
    }

    // Getter for customer name
    public String getName() {
        return custName;
    }

    // Setter for customer name
    public String setName(String n) {
        this.custName = n;
        return custName;
    }

    // Getter for customer ID
    public int getID() {
        return custID;
    }

    // Getter for order history
    public ArrayList<Order> getOrderHistory() {
        return orderHistory;
    }

    // Add an order to the customer's order history
    public void addToHistory(Order o) {
        orderHistory.add(o);
    }
}// end of costumer class
