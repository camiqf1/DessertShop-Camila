package DessertShopTests;

import DessertShop.Cookie;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CookieTest {

    @Test
    public void testGetCookieQty() {
        Cookie cookie = new Cookie("Chocolate Chip", 24, 5.99);
        assertEquals(24, cookie.getCookieQty(), "getCookieQty() should return the correct quantity");
    }

    @Test
    public void testSetCookieQty() {
        Cookie cookie = new Cookie("Chocolate Chip", 24, 5.99);
        cookie.setCookieQty(12);
        assertEquals(12, cookie.getCookieQty(), "setCookieQty() should update the quantity correctly");
    }

    @Test
    public void testGetPricePerDozen() {
        Cookie cookie = new Cookie("Chocolate Chip", 24, 5.99);
        assertEquals(5.99, cookie.getPricePerDozen(), "getPricePerDozen() should return the correct price per dozen");
    }

    @Test
    public void testSetPricePerDozen() {
        Cookie cookie = new Cookie("Chocolate Chip", 24, 5.99);
        cookie.setPricePerDozen(6.99);
        assertEquals(6.99, cookie.getPricePerDozen(), "setPricePerDozen() should update the price per dozen correctly");
    }

    @Test
    public void testGetPackaging() {
        Cookie cookie = new Cookie("Chocolate Chip", 24, 5.99);
        assertEquals("Box", cookie.getPackaging(), "getPackaging() should return the correct packaging type");
    }

    // Test cases for isSameAs(Cookie)

    @Test
    public void testIsSameAsTrue() {
        Cookie cookie1 = new Cookie("Chocolate Chip", 24, 5.99); // Same name, price per dozen
        Cookie cookie2 = new Cookie("Chocolate Chip", 12, 5.99); // Different quantities
        assertTrue(cookie1.isSameAs(cookie2), "isSameAs() should return true for cookies with the same name and price per dozen but different quantities");
    }

    @Test
    public void testIsSameAsFalseDifferentPrice() {
        Cookie cookie1 = new Cookie("Chocolate Chip", 24, 5.99); // Same name, different price per dozen
        Cookie cookie2 = new Cookie("Chocolate Chip", 24, 6.99); // Same quantities
        assertFalse(cookie1.isSameAs(cookie2), "isSameAs() should return false for cookies with the same name but different price per dozen");
    }

    @Test
    public void testIsSameAsFalseDifferentName() {
        Cookie cookie1 = new Cookie("Chocolate Chip", 24, 5.99); // Different name, same price per dozen
        Cookie cookie2 = new Cookie("Oatmeal Raisin", 24, 5.99); // Same quantities
        assertFalse(cookie1.isSameAs(cookie2), "isSameAs() should return false for cookies with different names but the same price per dozen");
    }

    @Test
    public void testIsSameAsFalseNull() {
        Cookie cookie1 = new Cookie("Chocolate Chip", 24, 5.99);
        assertFalse(cookie1.isSameAs(null), "isSameAs() should return false when comparing with null");
    }
}// end of cookie test


