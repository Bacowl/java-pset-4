package com.example.pset4;

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Diameter      : ");
        double radius = in.nextDouble()/2;

        double area = Math.PI * Math.pow(radius,2);
        double circumference = Math.PI*2*radius;

        System.out.println("\nArea          : " + String.format("%.2f",area) + "\nCircumference : " + String.format("%.2f",circumference));
    }
}
