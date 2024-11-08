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
            public double calculatorCost() {
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
            public double calculatorCost() {
                return 0;
            }
        };

        // Set a new name and check if it updates correctly
        String updatedName = item.setName("Cake");
        assertEquals("Cake", updatedName, "setName() should return the updated name");
        assertEquals("Cake", item.getName(), "setName() should update the name correctly");
    }

}//end of dessert item test

