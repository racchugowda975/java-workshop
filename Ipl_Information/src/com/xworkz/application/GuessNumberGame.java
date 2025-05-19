package com.xworkz.application;

import java.util.Random;
import java.util.Scanner;



public class GuessNumberGame {
    public static void main(String[] args) {
        Random random = new Random ();
        int systemNumber =random.nextInt(10);
        System.out.println("Welcome to Number Guessing Game");
        System.out.println("Hello user Enter the number of your choice between 1 to 100");
        Scanner scanner = new Scanner(System.in);
        int UserNumber = scanner.nextInt();
        if(systemNumber == UserNumber) {
            System.out.println("Number is matching:!!");
            System.out.println("system number is:" + systemNumber);
            System.out.println("user number is:" + UserNumber);
        }else {
            System.out.println("you Guess the wrong Number");
            System.out.println("system number is:" + systemNumber);
            System.out.println("user number is:" + UserNumber);
        }
    }
}
