package main.Chapter7;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrcTest {
    @Test
    public void testCurrentHitPoints() {
        Monster orc = new Orc();
        assertEquals(20, orc.getCurrentHealth());
    }

    @Test
    public void testGetName() {
        Monster orc = new Orc();
        assertEquals("Orc", orc.getName());
    }

    @Test
    public void testTakeDamage() {
        Monster orc = new Orc();
        orc.takeDamage(10);
        assertEquals(10, orc.getCurrentHealth());
    }
}