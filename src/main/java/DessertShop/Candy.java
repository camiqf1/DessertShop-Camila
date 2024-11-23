package DessertShop;

// Candy class implementing DessertItem and SameItem<Candy>
public class Candy extends DessertItem implements SameItem<Candy> {
    private double weight; // Weight in pounds
    private double pricePerPound; // Price per pound

    // Constructor
    public Candy(String name, double weight, double pricePerPound) {
        super(name); // Call the superclass constructor to set the name
        this.weight = weight;
        this.pricePerPound = pricePerPound;
        setPackaging("Bag"); // Set the packaging type
    }

    // Implement isSameAs from SameItem interface
    @Override
    public boolean isSameAs(Candy otherCandy) {
        if (otherCandy == null) {
            return false;
        }
        return this.getName().equals(otherCandy.getName()) &&
                this.pricePerPound == otherCandy.pricePerPound;
    }

    // Override calculateCost method
    @Override
    public double calculateCost() {
        return weight * pricePerPound; // Cost is weight * price per pound
    }

    // Getter and Setter for weight
    public double getCandyWeight() {
        return weight;
    }

    public void setCandyWeight(double weight) {
        this.weight = weight;
    }

    // Getter and Setter for pricePerPound
    public double getPricePerPound() {
        return pricePerPound;
    }

    public void setPricePerPound(double pricePerPound) {
        this.pricePerPound = pricePerPound;
    }

    // Override toString method for receipt generation
    @Override
    public String toString() {
        // First line with the candy name and packaging
        String line1 = String.format("%s (%s)", getName(), getPackaging());
        // Second line with details: weight and price per pound
        String line2Pt1 = String.format("%.2f lbs. @ $%.2f/lb.:", getCandyWeight(), getPricePerPound());
        // Cost of the item
        String line2Pt2 = String.format("$%.2f", calculateCost());
        // Tax for the item
        String line2Pt3 = String.format("[Tax: $%.2f]", calculateTax());

        // Combine all parts into a formatted string
        return String.format("%s\n\t%-45s%s%17s", line1, line2Pt1, line2Pt2, line2Pt3);
    }
} // end of candy class






