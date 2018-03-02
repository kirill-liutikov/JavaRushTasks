package com.javarush.task.task15.task1529;

/**
 * Created by kirill on 19.02.2018.
 */
public class Plane implements Flyable {

    int countPassangers;

    public Plane(int countPassangers) {
        this.countPassangers = countPassangers;
    }

    @Override
    public void fly() {

    }
}
