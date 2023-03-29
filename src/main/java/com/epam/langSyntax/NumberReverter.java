package com.epam.langSyntax;

public class NumberReverter {
    public static void main(String[] args) {  
        NumberReverter n = new NumberReverter();
       
    }
    
    public void revert(int number) {
        char[] chars = ("" + number).toCharArray();
        String rev = String.valueOf(chars[2]) + String.valueOf(chars[1]) + String.valueOf(chars[0]) ;
       
        System.out.println(Integer.parseInt(rev));
    }
}
