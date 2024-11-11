package DessertShop;

public class Sundae extends IceCream {
    private String toppingName; // Name of the topping
    private double toppingPrice; // Price of the topping

    // Default Constructor
    public Sundae() {
        super(); // Call the default constructor of IceCream
        this.toppingName = "";
        this.toppingPrice = 0.0;
    }

    // All-Argument Constructor
    public Sundae(String name, int scoopCount, double pricePerScoop, String toppingName, double toppingPrice) {
        super(name, scoopCount, pricePerScoop); // Call IceCream's constructor
        this.toppingName = toppingName;
        this.toppingPrice = toppingPrice;
    }

    // Getter for toppingName
    public String getToppingName() {
        return toppingName;
    }

    // Setter for toppingName
    public String setToppingName(String toppingName) {
        this.toppingName = toppingName;
        return this.toppingName;
    }

    // Getter for toppingPrice
    public double getToppingPrice() {
        return toppingPrice;
    }

    // Setter for toppingPrice
    public double setToppingPrice(double toppingPrice) {
        this.toppingPrice = toppingPrice;
        return this.toppingPrice;
    }

    // Override calculateCost to include topping price
    @Override
    public double calculateCost() {
        return super.calculateCost() + toppingPrice; // Add topping price to the cost of the ice cream
    }
} // end of sundae class