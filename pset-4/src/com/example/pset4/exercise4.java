package com.example.pset4;

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Centimeters : ");
        double total = in.nextDouble();

        double kilometers = total/100000 - (total%100000)/100000;
        total = total - kilometers*100000;
        double meters = total/100 - (total%100)/100;
        total = total - meters*100;


        System.out.println( "\nKilometers  : " + String.format("%.0f",kilometers) + "\nMeters      : " + String.format("%.0f", meters) + "\nCentimeters : " + String.format("%.0f", total));
    }
}
