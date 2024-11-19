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

    // Test cases for compareTo(DessertItem)

    @Test
    public void testCompareTo_LessThan() {
        // Create two DessertItem instances with different costs
        DessertItem item1 = new DessertItem("Candy") {
            @Override
            public double calculateCost() {
                return 5.0;
            }
        };

        DessertItem item2 = new DessertItem("Ice Cream") {
            @Override
            public double calculateCost() {
                return 10.0;
            }
        };

        // Assert that compareTo returns -1 when the first item's cost is less
        assertEquals(-1, item1.compareTo(item2), "compareTo() should return -1 when the first item costs less");
    }

    @Test
    public void testCompareTo_GreaterThan() {
        // Create two DessertItem instances with different costs
        DessertItem item1 = new DessertItem("Candy") {
            @Override
            public double calculateCost() {
                return 15.0;
            }
        };

        DessertItem item2 = new DessertItem("Ice Cream") {
            @Override
            public double calculateCost() {
                return 10.0;
            }
        };

        // Assert that compareTo returns 1 when the first item's cost is greater
        assertEquals(1, item1.compareTo(item2), "compareTo() should return 1 when the first item costs more");
    }

    @Test
    public void testCompareTo_Equal() {
        // Create two DessertItem instances with the same cost
        DessertItem item1 = new DessertItem("Candy") {
            @Override
            public double calculateCost() {
                return 10.0;
            }
        };

        DessertItem item2 = new DessertItem("Ice Cream") {
            @Override
            public double calculateCost() {
                return 10.0;
            }
        };

        // Assert that compareTo returns 0 when the costs are equal
        assertEquals(0, item1.compareTo(item2), "compareTo() should return 0 when both items cost the same");
    }
} // end of DessertItemTest class




