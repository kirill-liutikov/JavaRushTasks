package com.javarush.task.task25.task2506;


/**
 * Created by kirill on 18.12.2018.
 */
public class LoggingStateThread extends Thread {

    Thread thread;

    public LoggingStateThread(Thread t) {
        this.thread = t;
    }

    @Override
    public void run() {
        State state = null;
        State lastState = null;
        while (state != State.TERMINATED) {
            state = thread.getState();
            if (state != lastState) {
                System.out.println(state);
                lastState = state;
            }
        }
        Thread.interrupted();
    }
}
