package com.example.pset4;

import java.util.Scanner;


public class exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Side      : ");
        double length = in.nextDouble();

        double area = (3*Math.pow(3,0.5)/2)*Math.pow(length, 2);
        double perimeter = length *6;

        System.out.println("\nArea      : " + String.format("%.2f", area));
        System.out.println("Perimeter : " + String.format("%.2f", perimeter));

    }
}

