package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public class Beach implements Comparable<Beach>{
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    @Override
    public synchronized int  compareTo(Beach beach) {
        return (int)((this.quality - beach.quality)+(beach.distance-this.distance));
    }

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String  getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {
        Beach b1 = new Beach("first", 5, 3);
        Beach b2 = new Beach("second", 6, 4);

        System.out.println(b1.compareTo(b2));
    }
}
