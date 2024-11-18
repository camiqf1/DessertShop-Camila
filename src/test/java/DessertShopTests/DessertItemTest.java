package DessertShopTests;

import DessertShop.DessertItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DessertItemTest {

    @Test
    public void testGetName() {
        // Create an instance using the all-argument constructor
        DessertItem item = new DessertItem("Ice Cream") {
            @Override
            public double calculateCost() {
                return 0;
            }
        };

        // Assert that the name matches the expected value
        assertEquals("Ice Cream", item.getName(), "getName() should return the correct name");
    }

    @Test
    public void testSetName() {
        // Create an instance using the default constructor
        DessertItem item = new DessertItem() {
            @Override
            public double calculateCost() {
                return 0;
            }
        };

        // Set a new name and check if it updates correctly
        item.setName("Cake");
        assertEquals("Cake", item.getName(), "setName() should update and return the correct name");
    }

    @Test
    public void testGetTaxPercent() {
        // Create an instance with a default tax percent
        DessertItem item = new DessertItem("Candy") {
            @Override
            public double calculateCost() {
                return 0;
            }
        };

        // Assert the default tax percent
        assertEquals(7.25, item.getTaxPercent(), 0.01, "getTaxPercent() should return the default tax percent");
    }

    @Test
    public void testSetTaxPercent() {
        // Create an instance
        DessertItem item = new DessertItem("Cookie") {
            @Override
            public double calculateCost() {
                return 0;
            }
        };

        // Set a new tax percent and verify
        item.setTaxPercent(8.5);
        assertEquals(8.5, item.getTaxPercent(), 0.01, "setTaxPercent() should update and return the new tax percent");
    }

    @Test
    public void testSetPackaging() {
        // Create an instance
        DessertItem item = new DessertItem("Brownie") {
            @Override
            public double calculateCost() {
                return 0;
            }
        };

        // Set packaging and verify
        item.setPackaging("Tray");
        assertEquals("Tray", item.getPackaging(), "setPackaging() should update and return the correct packaging");
    }
} // end of DessertItemTest class



