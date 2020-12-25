package com.epam.cycles;

import java.math.BigInteger;

public class Task34 {
    public static void main(String[] args) {
        BigInteger sum = BigInteger.valueOf(1);
        for(int i = 2; i <= 200; i++) {
            sum = sum.multiply(BigInteger.valueOf((long) i * i));
        }
        System.out.println(sum);
    }
}
