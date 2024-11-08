package DessertShop;

public abstract class IceCream extends DessertItem {
    //Attributes and Properties
    private int scoopCount;//number of scoops
    private double pricePerScoop;//price for scoop

    public IceCream(String name, int scoopCount, double pricePerScoop) {
        super(name);
        this.scoopCount = scoopCount;
        this.pricePerScoop = pricePerScoop;
    }

    public IceCream() {

    }

    @Override

    public double calculatorCost() {
        return scoopCount *  pricePerScoop;
    }

    //Getter and Setter price per scoop
    public double getPricePerScoop() {
        return pricePerScoop;
    }

    public void setPricePerScoop(double pricePerScoop) {
        this.pricePerScoop = pricePerScoop;
    }

    //Getter and Setter scoop count
    public int getScoopCount() {
        return scoopCount;
    }
    public void setScoopCount(int scoopCount) {
        this.scoopCount = scoopCount;
    }

    // Override calculateCost to include topping price
    public abstract double calculateCost();
}//end of icecream class
