package dev.karina;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MotorbikeTest {
    @Test
    public void testMotorbikeTollCalculation() {
        Vehicle motorbike = new Motorbike("EFD456");
        assertEquals(50, motorbike.calculateToll(0));
    }
}
