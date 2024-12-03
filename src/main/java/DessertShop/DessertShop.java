package DessertShop;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class DessertShop {
    private static HashMap<String, Customer> customerDB = new HashMap<>();
    private static int orderNumber = 1;

    public static void main(String[] args) {
        Scanner sIn = new Scanner(System.in);
        boolean closed = false;

        System.out.println("Welcome to the Dessert Shop!");

        while (!closed) { // Continuous loop for starting new orders
            System.out.println("\n1: Candy");
            System.out.println("2: Cookie");
            System.out.println("3: Ice Cream");
            System.out.println("4: Sundae");
            System.out.println("5: Admin Module");

            System.out.print("\nWhat would you like to add to the order? (1-5, Enter for done): ");
            String menuChoice = sIn.nextLine();

            if (menuChoice.equals("")) {
                closed = true; // Exit the shop
            } else {
                switch (menuChoice) {
                    case "1":
                    case "2":
                    case "3":
                    case "4":
                        startNewOrder(sIn);
                        break;
                    case "5":
                        adminModule(sIn);
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                }
            }
        }

        sIn.close();
    }

    private static void startNewOrder(Scanner sIn) {
        Order order = new Order(); // Create a new order
        boolean done = false;

        System.out.println("\nStarting a new order...");

        while (!done) {
            System.out.println("\n1: Candy");
            System.out.println("2: Cookie");
            System.out.println("3: Ice Cream");
            System.out.println("4: Sundae");
            System.out.println("Enter to finish order");

            System.out.print("\nWhat would you like to add to the order? (1-4, Enter for done): ");
            String choice = sIn.nextLine();

            if (choice.equals("")) {
                done = true; // User finishes order
            } else {
                DessertItem orderItem;
                switch (choice) {
                    case "1":
                        orderItem = userPromptCandy();
                        order.add(orderItem);
                        break;
                    case "2":
                        orderItem = userPromptCookie();
                        order.add(orderItem);
                        break;
                    case "3":
                        orderItem = userPromptIceCream();
                        order.add(orderItem);
                        break;
                    case "4":
                        orderItem = userPromptSundae();
                        order.add(orderItem);
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                }
            }
        }

        // Prompt for customer name
        System.out.print("\nEnter customer name: ");
        String customerName = sIn.nextLine();

        // Get or create the customer
        Customer customer = customerDB.computeIfAbsent(customerName, name -> new Customer(name));

        // Add the order to the customer's history
        customer.addToHistory(order);

        // Prompt for payment method
        System.out.println("\nWhat form of payment will be used? (CASH, CARD, PHONE): ");
        String paymentMethod = sIn.nextLine().toUpperCase();

        boolean validPayment = false;
        for (Payable.PayType type : Payable.PayType.values()) {
            if (paymentMethod.equals(type.name())) {
                order.setPayType(Payable.PayType.valueOf(paymentMethod));
                validPayment = true;
                break;
            }
        }

        if (!validPayment) {
            System.out.println("Invalid payment method! Defaulting to CASH.");
            order.setPayType(Payable.PayType.CASH);
        }

        // Sort the items in the order by cost before printing the receipt
        Collections.sort(order.getOrderList());

        // Print the receipt
        System.out.println(order);

        // Add customer details to the receipt
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Customer Name: " + customer.getName() + "     Customer ID: " + customer.getID() +
                "     Total Orders: " + customer.getOrderHistory().size());

        System.out.println("\nPress Enter to return to the main menu...");
        sIn.nextLine();
    }

    private static void adminModule(Scanner sIn) {
        boolean exit = false;
        while (!exit) { // Continuous loop for Admin Module
            System.out.println("\n1: Shop Customer List");
            System.out.println("2: Customer Order History");
            System.out.println("3: Best Customer");
            System.out.println("4: Exit Admin Module");

            System.out.print("\nWhat would you like to do? (1-4): ");
            String choice = sIn.nextLine();

            switch (choice) {
                case "1":
                    shopCustomerList();
                    break;
                case "2":
                    System.out.print("Enter the name of the customer: ");
                    String name = sIn.nextLine();
                    customerOrderHistory(name);
                    break;
                case "3":
                    bestCustomer();
                    break;
                case "4":
                    exit = true; // Exit Admin Module
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private static void shopCustomerList() {
        System.out.println("\nCustomer List:");
        for (String name : customerDB.keySet()) {
            Customer customer = customerDB.get(name);
            System.out.println("Customer Name: " + customer.getName() + "     Customer ID: " + customer.getID());
        }
    }

    private static void customerOrderHistory(String name) {
        if (!customerDB.containsKey(name)) {
            System.out.println("Customer not found.");
            return;
        }
        Customer customer = customerDB.get(name);
        System.out.println("\nCustomer Name: " + customer.getName() + "     Customer ID: " + customer.getID());
        int orderNumber = 1;

        if (customer.getOrderHistory().isEmpty()) {
            System.out.println("No orders found for this customer.");
            return;
        }

        for (Order order : customer.getOrderHistory()) {
            System.out.println("\nOrder #: " + orderNumber++);
            System.out.println(order); // Assuming the Order class has a meaningful toString() method.
        }
    }

    private static void bestCustomer() {
        String bestCustomer = null;
        int maxOrders = 0;

        for (String name : customerDB.keySet()) {
            int orders = customerDB.get(name).getOrderHistory().size();
            if (orders > maxOrders) {
                maxOrders = orders;
                bestCustomer = name;
            }
        }

        if (bestCustomer != null) {
            System.out.println("\n---------------------------------------------------------------");
            System.out.println("The Dessert Shop's most valued customer is: " + bestCustomer + "!");
            System.out.println("---------------------------------------------------------------");
        } else {
            System.out.println("No customers found.");
        }
    }

    private static DessertItem userPromptCandy() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the candy: ");
        String name = scanner.nextLine();

        double weight = 0.0;
        while (true) {
            System.out.print("Enter the weight (in pounds): ");
            try {
                weight = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        double pricePerPound = 0.0;
        while (true) {
            System.out.print("Enter the price per pound: ");
            try {
                pricePerPound = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        return new Candy(name, weight, pricePerPound);
    }

    private static DessertItem userPromptCookie() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the cookie: ");
        String name = scanner.nextLine();

        int quantity = 0;
        while (true) {
            System.out.print("Enter the quantity (number of cookies): ");
            try {
                quantity = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        double pricePerDozen = 0.0;
        while (true) {
            System.out.print("Enter the price per dozen: ");
            try {
                pricePerDozen = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        return new Cookie(name, quantity, pricePerDozen);
    }

    private static DessertItem userPromptIceCream() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the ice cream: ");
        String name = scanner.nextLine();

        int scoops = 0;
        while (true) {
            System.out.print("Enter the number of scoops: ");
            try {
                scoops = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        double pricePerScoop = 0.0;
        while (true) {
            System.out.print("Enter the price per scoop: ");
            try {
                pricePerScoop = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        return new IceCream(name, scoops, pricePerScoop);
    }

    private static DessertItem userPromptSundae() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the ice cream: ");
        String name = scanner.nextLine();

        int scoops = 0;
        while (true) {
            System.out.print("Enter the number of scoops: ");
            try {
                scoops = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        double pricePerScoop = 0.0;
        while (true) {
            System.out.print("Enter the price per scoop: ");
            try {
                pricePerScoop = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        System.out.print("Enter the name of the topping: ");
        String toppingName = scanner.nextLine();

        double toppingPrice = 0.0;
        while (true) {
            System.out.print("Enter the price of the topping: ");
            try {
                toppingPrice = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        return new Sundae(name, scoops, pricePerScoop, toppingName, toppingPrice);
    }


}// end of DessertShop







