package com.epam.loops;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for(int y = 1; y <= cathetusLength; y++){
            for(int x = cathetusLength; x >= 1; x--){
                if(y >= x) {     
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}

