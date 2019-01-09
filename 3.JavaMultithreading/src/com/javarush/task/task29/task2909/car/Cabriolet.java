package com.javarush.task.task29.task2909.car;

/**
 * Created by карамба on 29.12.2018.
 */
public class Cabriolet extends Car {
    public Cabriolet(int numberOfPassengers) {
        super(2, numberOfPassengers);
    }

    @Override
    public int getMaxSpeed() {
        return Car.MAX_CABRIOLET_SPEED;
    }
}
