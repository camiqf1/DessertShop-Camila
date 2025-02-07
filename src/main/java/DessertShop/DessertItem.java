package DessertShop;

public abstract class DessertItem implements Packaging, Comparable<DessertItem> { // Implement Comparable interface
    private String name;
    private double taxPercent = 7.25; // Explicit Field Initialization
    private String packaging; // New field for packaging

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
    public void setName(String name) {
        this.name = name;
    }

    // Getter for taxPercent
    public double getTaxPercent() {
        return taxPercent;
    }

    // Setter for taxPercent
    public void setTaxPercent(double taxPercent) {
        this.taxPercent = taxPercent;
    }

    // Getter for packaging
    @Override
    public String getPackaging() {
        return packaging;
    }

    // Setter for packaging
    @Override
    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    // Abstract Method to calculate the cost of the item
    public abstract double calculateCost();

    // Method to calculate the tax for the item
    public double calculateTax() {
        return (calculateCost() * taxPercent) / 100;
    }

    // Implement Comparable's compareTo method
    @Override
    public int compareTo(DessertItem other) {
        // Compare based on cost
        double thisCost = this.calculateCost();
        double otherCost = other.calculateCost();

        if (thisCost < otherCost) {
            return -1;
        } else if (thisCost > otherCost) {
            return 1;
        } else {
            return 0;
        }
    }
} // end of DessertItem class




