package dev.karina;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TruckTest {
    @Test
    public void testTruckTollCalcultaion() {
        Vehicle truck = new Truck("GHI789", 4);
        assertEquals(200, truck.calculateToll(0));
    }

    @Test
    public void testTruckWithZeroAxles() {
        assertThrows(IllegalStateException.class, () -> {
            Vehicle truck = new Truck("JKL012", 0);
            truck.calculateToll(0);
        });
    }
}
