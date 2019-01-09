package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by карамба on 25.12.2018.
 */
public class StreamTest {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,3,7,9);

        int a = list.stream().max(Integer::compareTo).get();

        System.out.println(a);
    }
}
