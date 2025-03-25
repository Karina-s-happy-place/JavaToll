package dev.karina;

public class Truck extends Vehicle {
    private final int numAxles;

    public Truck(String plate, int numAxles) {
        super(plate);
        this.numAxles = numAxles;
    }

    @Override
    public int calculateToll(int i) {
        if (numAxles <= 0) {
            throw new IllegalStateException("Number of axles must be greater than 0");
        }
        return numAxles * 50;
    }
}
