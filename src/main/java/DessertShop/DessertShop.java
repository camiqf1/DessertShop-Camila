package DessertShop;

public class DessertShop {
    public static void main(String[] args) {
        //new order
        Order order = new Order();

        //Add items
        order.add(new Candy("Candy Corn", 1.5, 0.25));
        order.add(new Candy("Gummy Bears", 0.25, 0.35));
        order.add(new Cookie("Chocolate Chip", 6, 3.99));
        order.add(new IceCream("Pistachio", 2, 0.79));
        order.add(new Sundae("Vanilla", 3, 0.69, "Hot Fudge", 1.29));
        order.add(new Cookie("Oatmeal Raisin", 2, 3.45));

        //Print the names of all items
        System.out.println("Items in the order:");
        double subtotal = 0.0;
        double totalTax = 0.0;

        for (DessertItem item : order.getOrderList()) {
            double itemCost = item.calculateCost();
            double itemTax = item.calculateTax();
            subtotal += itemCost;
            totalTax += itemTax;

            //print item details in tabular format
            System.out.printf("%-25s$%-8.2f[Tax: $%.2f]\n", item.getName(), itemCost, itemTax);
        }

        //Calculate totals
        double totalCost = subtotal + totalTax;

        //Print the total number of items
        System.out.printf("\nSubtotal: $%.2f\n", subtotal);
        System.out.printf("Total Tax: $%.2f\n", totalTax);
        System.out.printf("Total Cost: $%.2f\n", totalCost);
        System.out.printf("Total Items: %d\n", order.itemCount());
    }
}//end of dessert shop class

