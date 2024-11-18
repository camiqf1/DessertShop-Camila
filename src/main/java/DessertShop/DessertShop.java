package DessertShop;

import java.util.Scanner;

public class DessertShop {
    public static void main(String[] args) {
        Order order = new Order(); // Create a new order
        Scanner sIn = new Scanner(System.in);
        String choice;
        DessertItem orderItem;

        boolean done = false;
        while (!done) {
            System.out.println("\n1: Candy");
            System.out.println("2: Cookie");
            System.out.println("3: Ice Cream");
            System.out.println("4: Sundae");

            System.out.print("\nWhat would you like to add to the order? (1-4, Enter for done): ");
            choice = sIn.nextLine();

            if (choice.equals("")) {
                done = true;
            } else {
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

        // Prompt for payment method
        System.out.println("Please select a payment method (CASH, CARD, PHONE): ");
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
        }

        // Replaced with a single line to print the receipt
        System.out.println(order);
    }

    // Method to prompt user for Candy details
    private static DessertItem userPromptCandy() {
        Scanner scanner = new Scanner(System.in);
        String name;
        double weight = 0.0;
        double pricePerPound = 0.0;

        System.out.print("Enter the name of the candy: ");
        name = scanner.nextLine();

        // Validate weight input
        while (true) {
            System.out.print("Enter the weight (in pounds): ");
            try {
                weight = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        // Validate price per pound input
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

    // Method to prompt user for Cookie details
    private static DessertItem userPromptCookie() {
        Scanner scanner = new Scanner(System.in);
        String name;
        int quantity = 0;
        double pricePerDozen = 0.0;

        System.out.print("Enter the name of the cookie: ");
        name = scanner.nextLine();

        // Validate quantity input
        while (true) {
            System.out.print("Enter the quantity (number of cookies): ");
            try {
                quantity = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        // Validate price per dozen input
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

    // Method to prompt user for Ice Cream details
    private static DessertItem userPromptIceCream() {
        Scanner scanner = new Scanner(System.in);
        String name;
        int scoops = 0;
        double pricePerScoop = 0.0;

        System.out.print("Enter the name of the ice cream: ");
        name = scanner.nextLine();

        // Validate scoops input
        while (true) {
            System.out.print("Enter the number of scoops: ");
            try {
                scoops = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        // Validate price per scoop input
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

    // Method to prompt user for Sundae details
    private static DessertItem userPromptSundae() {
        Scanner scanner = new Scanner(System.in);
        String name;
        int scoops = 0;
        double pricePerScoop = 0.0;
        String toppingName;
        double toppingPrice = 0.0;

        System.out.print("Enter the name of the ice cream: ");
        name = scanner.nextLine();

        // Validate scoops input
        while (true) {
            System.out.print("Enter the number of scoops: ");
            try {
                scoops = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        // Validate price per scoop input
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
        toppingName = scanner.nextLine();

        // Validate topping price input
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
} // end of DessertShop class



