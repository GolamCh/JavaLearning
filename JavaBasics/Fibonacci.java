package com.sparta.golam;
import java.util.Arrays;
import java.util.ArrayList;


public class Fibonacci {

    public static ArrayList<Integer> fibonnaciSequence(int number) {
        ArrayList<Integer> zero = new ArrayList<Integer>();
        ArrayList<Integer> one = new ArrayList<Integer>();
        zero.add(0);
        one.add(0);
        one.add(1);

        if (number == 1) {
            return zero;
        } else if (number == 2) {
            return one;
        } else if (number > 2) {
            int counter = 0;
            while (counter < number - 2) {
                one.add(one.get(counter) + one.get(counter+1));
                counter += 1;
            }
        }
        return one;
    }
}
