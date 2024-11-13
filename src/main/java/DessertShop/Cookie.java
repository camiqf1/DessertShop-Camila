package DessertShop;

public class Cookie extends DessertItem {
    // Attributes and Properties
    private int cookieQty; // number of cookies
    private double pricePerDozen; // price for a dozen cookies

    // All-Argument Constructor
    public Cookie(String name, int cookieQty, double pricePerDozen) {
        super(name); // Call the superclass constructor to set the name
        this.cookieQty = cookieQty;
        this.pricePerDozen = pricePerDozen;
    }

    // Override calculateCost method
    @Override
    public double calculateCost() {
        return (cookieQty / 12.0) * pricePerDozen; // Calculate cost based on quantity and price per dozen
    }

    // Getter and Setter for cookieQty
    public int getCookieQty() {
        return cookieQty;
    }

    public void setCookieQty(int cookieQty) {
        this.cookieQty = cookieQty;
    }

    // Getter and Setter for pricePerDozen
    public double getPricePerDozen() {
        return pricePerDozen;
    }

    public void setPricePerDozen(double pricePerDozen) {
        this.pricePerDozen = pricePerDozen;
    }

    // Override toString method for receipt generation
    @Override
    public String toString() {
        // First line with the cookie name
        String line1 = String.format("%s Cookies", getName());
        // Second line with details: quantity and price per dozen
        String line2Pt1 = String.format("%d cookies @ $%.2f/dozen:", getCookieQty(), getPricePerDozen());
        // Cost of the item
        String line2Pt2 = String.format("$%.2f", calculateCost());
        // Tax for the item
        String line2Pt3 = String.format("[Tax: $%.2f]", calculateTax());

        // Combine all parts into a formatted string
        return String.format("%s\n\t%-45s%s%17s", line1, line2Pt1, line2Pt2, line2Pt3);
    }
} // end of cookie class



