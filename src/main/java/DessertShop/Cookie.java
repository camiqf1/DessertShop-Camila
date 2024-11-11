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
} // end of cookie class


