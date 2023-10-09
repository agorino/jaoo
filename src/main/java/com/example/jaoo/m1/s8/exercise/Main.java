/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m1.s8.exercise;

/**
 * Exercise
 */
public class Main {
    /**
     * TODO: let this code work correctly
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        Square square = new Square(3.0);

        System.out.println("Area s is: " + square.area());
        System.out.println("Perimeter s is: " + square.perimeter());

        Circle circle = new Circle(4.0);
        System.out.println("Area c is: " + circle.area());
        System.out.println("Perimeter c is: " + circle.perimeter());
    }
}
