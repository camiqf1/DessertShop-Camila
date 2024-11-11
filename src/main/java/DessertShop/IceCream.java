package DessertShop;

public class IceCream extends DessertItem {
    // Attributes
    private int scoopCount; //Number of scoops
    private double pricePerScoop; //Price per scoop

    // Default Constructor
    public IceCream() {
        super(); //default constructor of DessertItem
        this.scoopCount = 0;
        this.pricePerScoop = 0.0;
    }

    //All-Argument Constructor
    public IceCream(String name, int scoopCount, double pricePerScoop) {
        super(name); //Call the all-argument constructor of DessertItem
        this.scoopCount = scoopCount;
        this.pricePerScoop = pricePerScoop;
    }

    // Getter for scoopCount
    public int getScoopCount() {
        return scoopCount;
    }

    // Setter for scoopCount
    public int setScoopCount(int scoopCount) {
        this.scoopCount = scoopCount;
        return this.scoopCount;
    }

    // Getter for pricePerScoop
    public double getPricePerScoop() {
        return pricePerScoop;
    }

    // Setter for pricePerScoop
    public double setPricePerScoop(double pricePerScoop) {
        this.pricePerScoop = pricePerScoop;
        return this.pricePerScoop;
    }

    // Override calculateCost method
    @Override
    public double calculateCost() {
        return scoopCount * pricePerScoop; // Cost is number of scoops * price per scoop
    }
}// end of ice cream class

