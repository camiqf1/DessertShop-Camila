package DessertShop;

public class Sundae extends IceCream {
    private String toppingName; // Name of the topping
    private double toppingPrice; // Price of the topping

    // Default Constructor
    public Sundae() {
        super(); // Call the default constructor of IceCream
        this.toppingName = "";
        this.toppingPrice = 0.0;
        setPackaging("Boat"); // Set default packaging
    }

    // All-Argument Constructor
    public Sundae(String name, int scoopCount, double pricePerScoop, String toppingName, double toppingPrice) {
        super(name, scoopCount, pricePerScoop); // Call IceCream's constructor
        this.toppingName = toppingName;
        this.toppingPrice = toppingPrice;
        setPackaging("Boat"); // Set packaging type for Sundae
    }

    // Getter for toppingName
    public String getToppingName() {
        return toppingName;
    }

    // Setter for toppingName
    public void setToppingName(String toppingName) {
        this.toppingName = toppingName;
    }

    // Getter for toppingPrice
    public double getToppingPrice() {
        return toppingPrice;
    }

    // Setter for toppingPrice
    public void setToppingPrice(double toppingPrice) {
        this.toppingPrice = toppingPrice;
    }

    // Override calculateCost to include topping price
    @Override
    public double calculateCost() {
        return super.calculateCost() + toppingPrice; // Add topping price to the cost of the ice cream
    }

    // Override toString method for receipt generation
    @Override
    public String toString() {
        // First line with the sundae name and packaging
        String line1 = String.format("%s %s Sundae (%s)", getToppingName(), getName(), getPackaging());
        // Second line with details: scoop count and price per scoop
        String line2Pt1 = String.format("%d scoops of %s ice cream @ $%.2f/scoop", getScoopCount(), getName(), getPricePerScoop());
        // Third line with topping details
        String line2Pt2 = String.format("%s topping @ $%.2f:", getToppingName(), getToppingPrice());
        // Cost of the item
        String line2Pt3 = String.format("$%.2f", calculateCost());
        // Tax for the item
        String line2Pt4 = String.format("[Tax: $%.2f]", calculateTax());

        // Combine all parts into a formatted string
        return String.format("%s\n\t%-45s\n\t%-45s%s%17s", line1, line2Pt1, line2Pt2, line2Pt3, line2Pt4);
    }
} // end of sundae class

