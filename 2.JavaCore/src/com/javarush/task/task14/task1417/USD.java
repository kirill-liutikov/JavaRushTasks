package com.javarush.task.task14.task1417;

/**
 * Created by kirill on 16.02.2018.
 */
public class USD extends Money {

    public USD(double amount) {
        super(amount);
    }


    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
