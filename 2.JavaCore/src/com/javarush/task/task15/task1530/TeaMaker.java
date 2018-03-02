package com.javarush.task.task15.task1530;

/**
 * Created by kirill on 19.02.2018.
 */
public class TeaMaker extends DrinkMaker {

    public void getRightCup() {
        System.out.println("Берем чашку для чая");
    }

    @Override
    public void putIngredient() {
        System.out.println("Насыпаем чай");
    }

    @Override
    public void pour() {
        System.out.println("Заливаем кипятком");
    }
}
