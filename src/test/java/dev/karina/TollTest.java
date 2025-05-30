package dev.karina;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class TollTest {

    @Test
    public void testRegisterSingleVehicle() {
        Toll toll = new Toll("North Toll", "Oviedo");
        Vehicle car = new Car("ABC123");

        toll.registerVehicle(car);

        assertEquals(100, toll.getTotalAmount());
    }

    @Test
    public void testGetRegisteredVehicles() {
        Toll toll = new Toll("North Toll", "Oviedo");
        Vehicle car = new Car("ABC123");
        Vehicle car2 = new Car("XYZ456");

        toll.registerVehicle(car);
        toll.registerVehicle(car2);

        List<Vehicle> vehicles = toll.getVehicles();

        assertEquals(2, vehicles.size());
        assertEquals("ABC123", vehicles.get(0).getPlate());
        assertEquals("XYZ456", vehicles.get(1).getPlate());
    }

    @Test
    public void testEmptyTollStation() {
        Toll toll = new Toll("North Toll", "Oviedo");
        assertEquals(0, toll.getTotalAmount());
        assertEquals(0, toll.getVehicles().size());
    }

    @Test
    public void testPrintSummary() {
        Toll toll = new Toll("North Toll", "Oviedo");
        Vehicle car = new Car("ABC123");
        Vehicle truck = new Truck("ASJ092", 4);

        toll.registerVehicle(car);
        toll.registerVehicle(truck);

        assertEquals(300, toll.getTotalAmount());
        toll.printSummary();
    }
}
