package DessertShopTests;

import DessertShop.Candy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CandyTest {

    @Test
    public void testGetCandyWeight() {
        Candy candy = new Candy("Gummy Bears", 1.5, 4.99);
        assertEquals(1.5, candy.getCandyWeight(), "getCandyWeight() should return the correct weight");
    }

    @Test
    public void testSetCandyWeight() {
        Candy candy = new Candy("Gummy Bears", 1.5, 4.99);
        candy.setCandyWeight(2.0);
        assertEquals(2.0, candy.getCandyWeight(), "setCandyWeight() should update the weight correctly");
    }

    @Test
    public void testGetPricePerPound() {
        Candy candy = new Candy("Gummy Bears", 1.5, 4.99);
        assertEquals(4.99, candy.getPricePerPound(), "getPricePerPound() should return the correct price per pound");
    }

    @Test
    public void testSetPricePerPound() {
        Candy candy = new Candy("Gummy Bears", 1.5, 4.99);
        candy.setPricePerPound(5.99);
        assertEquals(5.99, candy.getPricePerPound(), "setPricePerPound() should update the price per pound correctly");
    }

    @Test
    public void testGetPackaging() {
        Candy candy = new Candy("Gummy Bears", 1.5, 4.99);
        assertEquals("Bag", candy.getPackaging(), "getPackaging() should return the correct packaging type");
    }
} // end of candy test


