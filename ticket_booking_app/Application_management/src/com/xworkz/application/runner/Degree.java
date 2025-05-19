package com.xworkz.application.runner;

public class Degree {
    public static void main(String[]args){
        String degreeNames[] = {"BCA","BBA","MCA","MBA","MSE"};
        System.out.println("accessing array elements using index number");
        System.out.println(degreeNames[0]);
        System.out.println("length of array elements:"+degreeNames.length);
        System.out.println("accessing array element  using for loop");
                for(int i = degreeNames.length -1;i>=0 ; i--) {
                    System.out.println(degreeNames[i]);
        }
    }
}
