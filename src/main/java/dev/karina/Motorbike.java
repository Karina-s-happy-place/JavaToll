package dev.karina;

public class Motorbike extends Vehicle {
    private static final int TOLL_AMOUNT = 50;

    public Motorbike(String plate) {
        super(plate);
    }

    @Override
    public int calculateToll(int distance) {
        return TOLL_AMOUNT;
    }
}
