package com.example.pset4;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Inches : ");
        double total = in.nextDouble();

        double miles = total/63360 - (total%63360)/63360;
        total = total - miles*63360;
        double feet = total/12 - (total%12)/12;
        total = total - feet*12;


        System.out.println( "\nMiles  : " + String.format("%.0f",miles) + "\nFeet   : " + String.format("%.0f", feet) + "\nInches : " + String.format("%.0f", total));
    }
}
