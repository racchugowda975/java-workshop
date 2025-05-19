package com.xworkz.ipl.random;

import java.util.Random;

public class GenerateOtp {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt( 1000,9999 );
        System.out.println("number:"+number);
    }
}
