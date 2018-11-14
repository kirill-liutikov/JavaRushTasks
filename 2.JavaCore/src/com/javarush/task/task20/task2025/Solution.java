package com.javarush.task.task20.task2025;

import java.util.ArrayList;

import static java.lang.Math.toIntExact;

/*
Алгоритмы-числа
*/
public class Solution {


    public static long[] getNumbers(long N) {

        //long p = 10;
        //int length = getLenght1(N);

        long armstrongCandidate = 0;

        ArrayList<Long> listArmstrong = new ArrayList<>();

        ArrayList<Long> listUniq = new ArrayList<>();

        for (long i = 0; i <= N; i++) {
            int digits[] = getDigits(i);
            if (digits.length > 2) {
                for (int j = 1; j < digits.length-1; j++) {
                    if (digits[j-1] >= digits[j] && digits[j] >= digits[j + 1]) {
                        listUniq.add(i);
                    }
                }
            }
        }

        //listUniq.forEach(e -> System.out.println(e+" "));


        for (Long temp : listUniq) {
            int digits[] = getDigits(temp);
                    for (int digit : digits) {
                        armstrongCandidate = armstrongCandidate + (long) Math.pow(digit, digits.length);
                    }
            int armstrongCandidateDigits[] = getDigits(armstrongCandidate);
            for (int i = 0; i <armstrongCandidateDigits.length ; i++) {

            }

            if (getLenght2(armstrongCandidate) == getLenght2(temp)) listArmstrong.add(armstrongCandidate);

            armstrongCandidate = 0;
        }

        //listArmstrong.forEach(System.out::println);

        long[] result = new long[listArmstrong.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = listArmstrong.get(i);
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

    public static int getLenght1(Long N) {
        return String.valueOf(N).length();
    }

    public static int getLenght2 (Long N) {
        long p = 10;
        for (int i = 0; i < 19 ; i++) {
            if (N<p) {
                return i;
            }
            p *=10;
        }
        return 19;
    }


    public static void main(String[] args) {
        long startTime = System.nanoTime();
        long n[] = getNumbers(200);
        long endTime = System.nanoTime();
        long total = endTime - startTime;
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]+" ");
        }
        double totalSec = (double) total/1_000_000_000.;
        System.out.println("\n\r"+totalSec);



    }
}
