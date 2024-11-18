package DessertShopTests;

import DessertShop.IceCream;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IceCreamTest {

    @Test
    public void testGetScoopCount() {
        IceCream iceCream = new IceCream("Vanilla", 3, 2.50) {
            @Override
            public double calculateCost() {
                return 0;
            }
        };
        assertEquals(3, iceCream.getScoopCount(), "getScoopCount() should return the correct scoop count");
    }

    @Test
    public void testSetScoopCount() {
        IceCream iceCream = new IceCream("Vanilla", 3, 2.50) {
            @Override
            public double calculateCost() {
                return 0;
            }
        };
        iceCream.setScoopCount(4);
        assertEquals(4, iceCream.getScoopCount(), "setScoopCount() should update the scoop count correctly");
    }

    @Test
    public void testGetPricePerScoop() {
        IceCream iceCream = new IceCream("Vanilla", 3, 2.50) {
            @Override
            public double calculateCost() {
                return 0;
            }
        };
        assertEquals(2.50, iceCream.getPricePerScoop(), "getPricePerScoop() should return the correct price per scoop");
    }

    @Test
    public void testSetPricePerScoop() {
        IceCream iceCream = new IceCream("Vanilla", 3, 2.50) {
            @Override
            public double calculateCost() {
                return 0;
            }
        };
        iceCream.setPricePerScoop(3.00);
        assertEquals(3.00, iceCream.getPricePerScoop(), "setPricePerScoop() should update the price per scoop correctly");
    }

    @Test
    public void testGetPackaging() {
        IceCream iceCream = new IceCream("Vanilla", 3, 2.50) {
            @Override
            public double calculateCost() {
                return 0;
            }
        };
        assertEquals("Bowl", iceCream.getPackaging(), "getPackaging() should return the correct packaging type");
    }
} // end of ice cream test


