package DessertShop;

public class Candy extends DessertItem {
    //Attributes and Properties
    private double weight;// pounds
    private double pricePerPound;

    public Candy(String name, double weight, double pricePerPound) {
        super(name);
        this.weight = weight;
        this.pricePerPound = pricePerPound;
    }

    @Override

    public double calculatorCost() {
        return weight * pricePerPound;
    }

    //Getter and Setter weight
    public double getCandyWeight() {
        return weight;
    }

    public void setCandyWeight(double weight) {
        this.weight = weight;
    }

    //Getter and Setter price per pound
    public double getPricePerPound() {
        return pricePerPound;
    }
    public void setPricePerPound(double pricePerPound) {
        this.pricePerPound = pricePerPound;
    }
}//end of candy class
