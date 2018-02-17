package com.javarush.task.task14.task1421;

/**
 * Created by kirill on 16.02.2018.
 */
public class NotSingleton {

    private static NotSingleton instance;

    private NotSingleton() {
    }

    public static NotSingleton getInstance() {
        return new NotSingleton();
    }
}
