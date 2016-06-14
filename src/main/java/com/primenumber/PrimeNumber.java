package com.primenumber;

public class PrimeNumber {
    public static void main(String args[]) {
        for (int i = 5; i < 500; i++) {
//            primes(i, Math.ceil(Math.sqrt(i)));
            primes(i, i-1);
        }
    }

    public static int primes(int x, double i) {
        if (i == 1){
            System.out.println(x);
        }
        if (x % i == 0){
            return 0;
        } else{
            return primes(x, i-1);
        }

    }
}
