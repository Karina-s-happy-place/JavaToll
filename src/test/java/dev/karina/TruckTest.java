package dev.karina;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TruckTest {
    @Test
    public void testTruckTollCalcultaion() {
        Vehicle truck = new Truck("GHI789", 4);
        assertEquals(200, truck.calculateToll(0));
    }
}
