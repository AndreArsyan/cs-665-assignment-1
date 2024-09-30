package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import edu.bu.met.cs665.assignment1.Espresso;
import org.junit.Test;
import edu.bu.met.cs665.assignment1.Coffee;

/**
 * Write some Unit tests for your program like the examples below.
 */

public class TestEspresso {

    public TestEspresso() {
    }

    @Test
    public void testCreateCoffee() {
        Espresso espresso = new Espresso(0,0);
        assertEquals(0, espresso.GetMilk());
    }

    @Test
    public void testPrice() {
        Espresso espresso = new Espresso(3,3);
        assertEquals(5.0, espresso.GetPrice(),0);
    }

    @Test
    public void testInvalidMilk() {
        Espresso espresso = new Espresso(3,0);
        espresso.AddMilk();
        assertEquals(3, espresso.GetMilk());
    }
}
