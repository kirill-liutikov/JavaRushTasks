package com.javarush.task.task04.task0442;


/* 
Суммирование

Вводить с клавиатуры числа.
Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
-1 должно учитываться в сумме.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int enterNumber = 0;
        int summ = 0;

        ArrayList<Integer> list = new ArrayList<>();

        while (enterNumber != -1) {
            enterNumber = Integer.parseInt(reader.readLine());
            list.add(enterNumber);
            }

            //list.add(-1);

            for (int o : list) {

                summ += o;
            }


        System.out.println(summ);


    }
}
