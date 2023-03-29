package com.epam.langSyntax;

public class DigitsSumCalculator {
     public static void main(String[] args) {  
        DigitsSumCalculator n = new DigitsSumCalculator();
        n.calculateSum(100);
    }
    
    public void calculateSum(int number) {
        char[] chars = ("" + number).toCharArray();
        int rev = Integer.parseInt(String.valueOf(chars[3])) + Integer.parseInt(String.valueOf(chars[2]))
                + Integer.parseInt(String.valueOf(chars[1])) + Integer.parseInt(String.valueOf(chars[0]));
        System.out.println(rev);
    }
}
