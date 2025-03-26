package dev.karina;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TollTest {

    @Test
    public void testRegisterSingleVehicle() {
        Toll toll = new Toll("North Toll", "Oviedo");
        Vehicle car = new Car("ABC123");

        toll.registerVehicle(car);

        assertEquals(100, toll.getTotalAmount());
    }
}
