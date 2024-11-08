package DessertShop;

public abstract class DessertItem {
    private String name;

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
    public String setName(String name) {
        this.name = name;
        return this.name;
    }

    public abstract double calculatorCost();
}//end of dessert item class
