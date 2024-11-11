package DessertShop;

public class DessertShop {
    public static void main(String[] args) {
        //new order
        Order order = new Order();

        //Add items
        order.add(new Candy("Candy Corn", 1.5, 0.25));
        order.add(new Candy("Gummy Bears", 0.25, 0.35));
        order.add(new Cookie("Chocolate Chip", 6, 3.99));
        order.add(new IceCream("Pistachio", 2, 0.79) {
            @Override
            public double calculateCost() {
                return 0;
            }
        });
        order.add(new Sundae("Vanilla", 3, 0.69, "Hot Fudge", 1.29));
        order.add(new Cookie("Oatmeal Raisin", 2, 3.45));

        //Print the names of all items
        System.out.println("Items in the order:");
        for (DessertItem item : order.getOrderList()) {
            System.out.println(item.getName());
        }

        //Print the total number of items
        System.out.println("\nTotal items: " + order.itemCount());
    }
}//end of dessert shop class
