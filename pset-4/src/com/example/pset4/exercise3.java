package com.example.pset4;

import java.util.Scanner;
import java.text.DecimalFormat;

public class exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pattern = "###,###.##";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        System.out.println("Length       : ");
        double length = in.nextDouble();
        System.out.println("Width        : ");
        double width = in.nextDouble();
        System.out.println("Diameter     : ");
        double diameter = in.nextDouble();

        double ans = length*width - (Math.pow(diameter/2, 2) * Math.PI);

        System.out.println("\nSurface area : " + decimalFormat.format(ans));

    }
}

