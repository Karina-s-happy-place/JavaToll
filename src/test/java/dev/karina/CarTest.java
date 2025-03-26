package dev.karina;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    public void testCarTollCalculation() {
        Vehicle car = new Car("ADB123");
        assertEquals(100, car.calculateToll(100));
    }
}
