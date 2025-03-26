package dev.karina;

import java.util.ArrayList;
import java.util.List;

public class Toll {
    private final String name;
    private final String city;
    private int totalAmount;
    private final List<Vehicle> vehicles;

    public Toll(String name, String city) {
        this.name = name;
        this.city = city;
        this.totalAmount = 0;
        this.vehicles = new ArrayList<>();
    }

    public void registerVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        totalAmount += vehicle.calculateToll(0);
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

}
