package DessertShopTests;

import DessertShop.Sundae;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SundaeTest {

    @Test
    public void testGetToppingName() {
        Sundae sundae = new Sundae("Strawberry Sundae", 3, 2.50, "Hot Fudge", 1.25);
        assertEquals("Hot Fudge", sundae.getToppingName(), "getToppingName() should return the correct topping name");
    }

    @Test
    public void testSetToppingName() {
        Sundae sundae = new Sundae("Strawberry Sundae", 3, 2.50, "Hot Fudge", 1.25);
        sundae.setToppingName("Caramel");
        assertEquals("Caramel", sundae.getToppingName(), "setToppingName() should update the topping name correctly");
    }

    @Test
    public void testGetToppingPrice() {
        Sundae sundae = new Sundae("Strawberry Sundae", 3, 2.50, "Hot Fudge", 1.25);
        assertEquals(1.25, sundae.getToppingPrice(), "getToppingPrice() should return the correct topping price");
    }

    @Test
    public void testSetToppingPrice() {
        Sundae sundae = new Sundae("Strawberry Sundae", 3, 2.50, "Hot Fudge", 1.25);
        sundae.setToppingPrice(1.50);
        assertEquals(1.50, sundae.getToppingPrice(), "setToppingPrice() should update the topping price correctly");
    }

    @Test
    public void testGetPackaging() {
        Sundae sundae = new Sundae("Strawberry Sundae", 3, 2.50, "Hot Fudge", 1.25);
        assertEquals("Boat", sundae.getPackaging(), "getPackaging() should return the correct packaging type");
    }
} // end of sundae test

