package com.javarush.task.task20.task2025;

import java.util.ArrayList;

import static java.lang.Math.toIntExact;

/*
Алгоритмы-числа
*/
public class Solution {


    public static long[] getNumbers(long N) {

        long p = 10;
        int length = String.valueOf(N).length();

        long armstrongCandidate = 0;

        ArrayList<Long> listArmstrong = new ArrayList<>();

        for (long i = 10; i <= N; i++) {
            int digits[] = getDigits(i);
            for (int digit : digits) {
                armstrongCandidate = armstrongCandidate + (long) Math.pow(digit, digits.length);
            }
            if (armstrongCandidate == i) listArmstrong.add(armstrongCandidate);
            armstrongCandidate = 0;
        }

        //listArmstrong.forEach(System.out::println);

        long[] result = new long[listArmstrong.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = listArmstrong.get(i).longValue();
        }

        return result;
    }

    public static int[] getDigits(Long N) {
        int length = String.valueOf(N).length();
        int digits[] = new int[length];
        long temp = N;

        long p = 10;
        for (int i = 0; i < length; i++) {
            if (temp > p) {
                //System.out.println(N%p);
                digits[i] = toIntExact(temp % p);
                temp = temp / p;
            } else {
                digits[i] = toIntExact(temp);
            }
        }
        return digits;
    }


    public static void main(String[] args) {
        long startTime = System.nanoTime();
        long n[] = getNumbers(20000000);
        long endTime = System.nanoTime();
        long total = endTime - startTime;
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]+" ");
        }
        double totalSec = (double) total/1_000_000_000.;
        System.out.println("\n\r"+totalSec);
        System.out.println("\n\r"+total);
    }
}
