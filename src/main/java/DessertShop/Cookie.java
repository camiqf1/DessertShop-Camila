package DessertShop;

public class Cookie extends DessertItem {
    //Attributes and Properties
    private int cookieQty;//number of cookies
    private double pricePerDozen;//price for cookie

    public Cookie(String name, int cookieQty, double pricePerDozen) {
        super(name);
        this.cookieQty = cookieQty;
        this.pricePerDozen = pricePerDozen;
    }

    @Override

    public double calculatorCost() {
        return (cookieQty / 12.0) * pricePerDozen;
    }

    //Getter and Setter cookieqty
    public int getCookieQty() {
        return cookieQty;
    }

    public void setCookieQty(int cookieQty) {
        this.cookieQty = cookieQty;
    }

    //Getter and Setter price per dozen
    public double getPricePerDozen() {
        return pricePerDozen;
    }

    public void setPricePerDozen(double pricePerDozen) {
        this.pricePerDozen = pricePerDozen;
    }
}//end of cookie class

