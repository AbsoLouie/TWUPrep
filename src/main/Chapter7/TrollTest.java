package main.Chapter7;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrollTest {
    @Test
    public void testCurrentHitPoints() {
        Monster troll = new Troll();
        assertEquals(40, troll.getCurrentHealth());
    }

    @Test
    public void testGetName() {
        Monster troll = new Troll();
        assertEquals("Troll", troll.getName());
    }

    @Test
    public void testTakeHalfDamage() {
        Monster troll = new Troll();
        troll.takeDamage(10);
        assertEquals(35, troll.getCurrentHealth());
    }
}