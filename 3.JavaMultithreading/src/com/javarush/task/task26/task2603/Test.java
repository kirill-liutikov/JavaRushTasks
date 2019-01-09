package com.javarush.task.task26.task2603;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by карамба on 09.01.2019.
 */

class Product {
   private String name;
   private double price;
   private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}

class SortedByName implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        String s1 = o1.getName();
        String s2 = o1.getName();

        return s1.compareTo(s2);
    }
}

class SortedByPrice implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        Double d1 = o1.getPrice();
        Double d2 = o2.getPrice();
        return d1.compareTo(d2);
    }
}

class CustomizedComparator<T> implements Comparator<T> {

    private Comparator<T>[] comparators;

    public CustomizedComparator(Comparator... comparators) {
        this.comparators = comparators;
    }

    @Override
    public int compare(T o1, T o2) {
        int result =0;
        for (Comparator comparator : comparators) {
            result = comparator.compare(o1,o2);
            if (result != 0) {
            break;}
        }
        return result;
    }
}

public class Test {

    public static void main(String[] args) {
        Product[] prodArray = new Product[3];

        prodArray[0] = new Product("BMilk", 7.56, 56);

        prodArray[1] = new Product("AMilk", 17.00, 32);

        prodArray[2] = new Product("BTea", 12.50, 0);

        CustomizedComparator comparator = new CustomizedComparator<>(new SortedByName(), new SortedByPrice());

        Arrays.sort(prodArray, comparator);

        Arrays.stream(prodArray).forEach(x -> System.out.println(x));


    }
}
