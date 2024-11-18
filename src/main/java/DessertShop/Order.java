package DessertShop;

import java.util.ArrayList;

public class Order implements Payable { // Implement Payable interface
    private ArrayList<DessertItem> order; // Attribute to store the list of DessertItem objects
    private PayType payMethod; // Attribute to store payment method

    // Constructor
    public Order() {
        this.order = new ArrayList<>(); // Initialize the ArrayList
        this.payMethod = PayType.CASH; // Default payment method
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

    // Override toString method for receipt generation
    @Override
    public String toString() {
        // Initialize the receipt string
        StringBuilder finalOutput = new StringBuilder();

        // Add the receipt header
        finalOutput.append("------------------------------------------------Receipt-------------------------------------------------\n");

        // Add each item's receipt details
        for (DessertItem item : order) {
            finalOutput.append(item.toString()).append("\n");
        }

        // Add the receipt divider
        finalOutput.append("-------------------------------------------------------------------------------------------------------\n");

        // Calculate totals
        double subtotal = orderCost();
        double totalTax = orderTax();
        double totalCost = subtotal + totalTax;

        // Add formatted totals to the receipt
        String subtotalLine = String.format("Order Subtotals: %71s\n", String.format("$%.2f [Tax: $%.2f]", subtotal, totalTax));
        String totalLine = String.format("Order Total: %78s\n", String.format("$%.2f", totalCost));
        String itemCountLine = String.format("Total items in the order: %56d\n", itemCount());

        // Append totals to the receipt
        finalOutput.append(subtotalLine);
        finalOutput.append(totalLine);
        finalOutput.append(itemCountLine);

        // Append payment method to the receipt
        finalOutput.append(String.format("Payment Method: %77s\n", payMethod.name()));

        // Return the final receipt string
        return finalOutput.toString();
    }

    // Implement Payable methods
    @Override
    public PayType getPayType() {
        return this.payMethod;
    }

    @Override
    public void setPayType(PayType payType) {
        this.payMethod = payType;
    }
} // end of Order class



