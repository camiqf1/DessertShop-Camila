package DessertShop;

public abstract class DessertItem {
    private String name;
    private double taxPercent = 7.25; // Explicit Field Initialization

    // Default Constructor
    public DessertItem() {
        this.name = "";
    }

    // All-Argument Constructor
    public DessertItem(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public String setName(String name) {
        this.name = name;
        return this.name;
    }

    // Getter for taxPercent
    public double getTaxPercent() {
        return taxPercent;
    }

    // Setter for taxPercent
    public void setTaxPercent(double taxPercent) {
        this.taxPercent = taxPercent;
    }

    // Abstract Method to calculate the cost of the item
    public abstract double calculateCost();

    // Method to calculate the tax for the item
    public double calculateTax() {
        return (calculateCost() * taxPercent) / 100;
    }

}//end of dessert item class
