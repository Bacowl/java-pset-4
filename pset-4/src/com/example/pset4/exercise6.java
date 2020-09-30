package com.example.pset4;

import java.util.Scanner;


public class exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Length    : ");
        double length = in.nextDouble();
        System.out.println("Width     : ");
        double width = in.nextDouble();

        double area = length*width;
        double perimeter = (length + width) *2;
        double diagonal = Math.pow( Math.pow(length, 2) + Math.pow(width, 2), 0.5);

        System.out.println("\nArea      : " + String.format("%.2f", area));
        System.out.println("Perimeter : " + String.format("%.2f", perimeter));
        System.out.println("Diagonal  : " + String.format("%.2f", diagonal));
    }
}

