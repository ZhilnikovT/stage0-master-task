package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
        }

    public String getDescription(){
        String str = this.hasFur ? "a" : "no";
        String s = this.numberOfPaws == 1 ? "" : "s";
        return "This animal is mostly " + this.color + ". It has " + this.numberOfPaws + " paw" + s + " and " + str + " fur.";
    }

//    public static void main(String[] args) {
//        Animal a = new Animal("gray",1,true);
//        System.out.println(a.getDescription());
//    }  
}
