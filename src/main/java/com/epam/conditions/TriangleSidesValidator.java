package com.epam.conditions;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        boolean one = (firstSide + secondSide) > thirdSide;
        boolean two = (thirdSide + secondSide) > firstSide;
        boolean three = (firstSide + thirdSide) > secondSide;
        if (one && two && three){
            System.out.println("this is a valid triangle");
        }else{
            System.out.println("it's not a triangle");
        }
    }
    public static void main(String[] args) {
        TriangleSidesValidator a = new TriangleSidesValidator();
        a.validate(1, 7, 4);
    }  
}
