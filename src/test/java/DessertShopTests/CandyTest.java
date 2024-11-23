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

    // Test cases for isSameAs(Candy)

    @Test
    public void testIsSameAsTrue() {
        Candy candy1 = new Candy("Gummy Bears", 1.5, 4.99); // Same name, price per pound
        Candy candy2 = new Candy("Gummy Bears", 2.0, 4.99); // Different weights
        assertTrue(candy1.isSameAs(candy2), "isSameAs() should return true for candies with the same name and price per pound but different weights");
    }

    @Test
    public void testIsSameAsFalseDifferentPrice() {
        Candy candy1 = new Candy("Gummy Bears", 1.5, 4.99); // Same name, different price per pound
        Candy candy2 = new Candy("Gummy Bears", 1.5, 5.99); // Same weight
        assertFalse(candy1.isSameAs(candy2), "isSameAs() should return false for candies with the same name but different price per pound");
    }

    @Test
    public void testIsSameAsFalseDifferentName() {
        Candy candy1 = new Candy("Gummy Bears", 1.5, 4.99); // Different name, same price per pound
        Candy candy2 = new Candy("Sour Worms", 1.5, 4.99); // Same weight
        assertFalse(candy1.isSameAs(candy2), "isSameAs() should return false for candies with different names but the same price per pound");
    }

    @Test
    public void testIsSameAsFalseNull() {
        Candy candy1 = new Candy("Gummy Bears", 1.5, 4.99);
        assertFalse(candy1.isSameAs(null), "isSameAs() should return false when comparing with null");
    }
}// end of candy test



