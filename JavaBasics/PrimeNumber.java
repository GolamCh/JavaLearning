package com.sparta.golam;

public class PrimeNumber {

    public static boolean isPrime(int number) {
        boolean prime = false;
        if(number == 2) {
            prime = true;
        } else if (number < 2) {
            prime = false;
        } else {
            for (int i=2;i<number;i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                } else {
                    prime = true;
                }
            }
        }

        return prime;
    }

}
