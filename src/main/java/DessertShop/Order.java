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

    // Updated add method
    public DessertItem add(DessertItem item) {
        // If the item to be added is of type Candy
        if (item instanceof Candy) {
            Candy newCandy = (Candy) item;
            for (DessertItem existingItem : order) {
                if (existingItem instanceof Candy) {
                    Candy existingCandy = (Candy) existingItem;
                    // Check if they are the same using isSameAs
                    if (existingCandy.isSameAs(newCandy)) {
                        // Add the candy weight to the existing candy
                        existingCandy.setCandyWeight(existingCandy.getCandyWeight() + newCandy.getCandyWeight());
                        return item; // Do not add the new item
                    }
                }
            }
        }
        // If the item to be added is of type Cookie
        else if (item instanceof Cookie) {
            Cookie newCookie = (Cookie) item;
            for (DessertItem existingItem : order) {
                if (existingItem instanceof Cookie) {
                    Cookie existingCookie = (Cookie) existingItem;
                    // Check if they are the same using isSameAs
                    if (existingCookie.isSameAs(newCookie)) {
                        // Add the cookie quantity to the existing cookie
                        existingCookie.setCookieQty(existingCookie.getCookieQty() + newCookie.getCookieQty());
                        return item; // Do not add the new item
                    }
                }
            }
        }

        // If no match is found, add the item to the order
        this.order.add(item);
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





