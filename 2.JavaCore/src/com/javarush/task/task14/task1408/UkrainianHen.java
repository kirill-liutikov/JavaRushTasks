package com.javarush.task.task14.task1408;

/**
 * Created by kirill on 15.02.2018.
 */
public class UkrainianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 4;
    }

    public String getDescription() {
        //String s = (String) System.out.printf("%s Моя страна - %s. Я несу %d яиц в месяц.", super.getDescription(), Country.BELARUS, getCountOfEggsPerMonth());
        return super.getDescription() + " Моя страна - Ukraine. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
