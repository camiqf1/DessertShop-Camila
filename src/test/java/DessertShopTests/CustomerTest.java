package DessertShopTests;

import DessertShop.Customer;
import DessertShop.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {

    @Test
    public void testGetName() {
        Customer customer = new Customer("Alice");
        assertEquals("Alice", customer.getName(), "getName() should return the correct name");
    }

    @Test
    public void testSetName() {
        Customer customer = new Customer("Alice");
        customer.setName("Bob");
        assertEquals("Bob", customer.getName(), "setName() should update the customer's name correctly");
    }

    @Test
    public void testGetID() {
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");
        assertNotEquals(customer1.getID(), customer2.getID(), "Each customer should have a unique ID");
    }

    @Test
    public void testAddToHistory() {
        Customer customer = new Customer("Alice");
        Order order = new Order();
        customer.addToHistory(order);
        assertTrue(customer.getOrderHistory().contains(order), "addToHistory() should add the order to the order history");
    }

    @Test
    public void testGetOrderHistory() {
        Customer customer = new Customer("Alice");
        Order order1 = new Order();
        Order order2 = new Order();
        customer.addToHistory(order1);
        customer.addToHistory(order2);
        assertEquals(2, customer.getOrderHistory().size(), "getOrderHistory() should return all orders placed by the customer");
    }
}// end of costumerTest class
