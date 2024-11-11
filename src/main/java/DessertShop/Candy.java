package DessertShop;

public class Candy extends DessertItem {
    // Attributes and Properties
    private double weight; // Weight in pounds
    private double pricePerPound; // Price per pound

    // Constructor
    public Candy(String name, double weight, double pricePerPound) {
        super(name); // Call the superclass constructor to set the name
        this.weight = weight;
        this.pricePerPound = pricePerPound;
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
} // end of candy class

