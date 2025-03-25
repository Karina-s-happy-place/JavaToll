package dev.karina;

public class Car extends Vehicle {
    private static final int TOLL_AMOUNT = 100;

    public Car(String plate) {
        super(plate);
    }

    @Override
    public int calculateToll(int distance) {
        return TOLL_AMOUNT;
    }
}
