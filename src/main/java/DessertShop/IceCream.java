package DessertShop;

public class IceCream extends DessertItem {
    // Attributes
    private int scoopCount; // Number of scoops
    private double pricePerScoop; // Price per scoop

    // Default Constructor
    public IceCream() {
        super(); // Default constructor of DessertItem
        this.scoopCount = 0;
        this.pricePerScoop = 0.0;
    }

    // All-Argument Constructor
    public IceCream(String name, int scoopCount, double pricePerScoop) {
        super(name); // Call the all-argument constructor of DessertItem
        this.scoopCount = scoopCount;
        this.pricePerScoop = pricePerScoop;
    }

    // Getter for scoopCount
    public int getScoopCount() {
        return scoopCount;
    }

    // Setter for scoopCount
    public void setScoopCount(int scoopCount) {
        this.scoopCount = scoopCount;
    }

    // Getter for pricePerScoop
    public double getPricePerScoop() {
        return pricePerScoop;
    }

    // Setter for pricePerScoop
    public void setPricePerScoop(double pricePerScoop) {
        this.pricePerScoop = pricePerScoop;
    }

    // Implement calculateCost method from DessertItem
    @Override
    public double calculateCost() {
        return scoopCount * pricePerScoop; // Cost is number of scoops * price per scoop
    }

    // Override toString method for receipt generation
    @Override
    public String toString() {
        // First line with the ice cream name
        String line1 = String.format("%s Ice Cream", getName());
        // Second line with details: scoop count and price per scoop
        String line2Pt1 = String.format("%d scoops @ $%.2f/scoop:", getScoopCount(), getPricePerScoop());
        // Cost of the item
        String line2Pt2 = String.format("$%.2f", calculateCost());
        // Tax for the item
        String line2Pt3 = String.format("[Tax: $%.2f]", calculateTax());

        // Combine all parts into a formatted string
        return String.format("%s\n\t%-45s%s%17s", line1, line2Pt1, line2Pt2, line2Pt3);
    }
} // end of IceCream class



