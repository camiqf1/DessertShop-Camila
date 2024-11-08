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

}//end of cookie test
