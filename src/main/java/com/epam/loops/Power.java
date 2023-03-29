package com.epam.loops;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int number = 1;
        for(int p = 1; p <= power; p++){
            number *= numberToPrint;
        }
        System.out.println(number);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
