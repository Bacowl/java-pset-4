package com.example.pset4;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Temperature : ");
        double temp = in.nextDouble();
        System.out.println("Wind speed  : ");
        double wind = in.nextDouble();

        double ans = 35.74 + 0.6215*temp + (0.4275*temp - 35.75) * Math.pow(wind, 0.16);

        System.out.println( "\nWind Chill  : " + String.format("%.2f", ans));
    }
}
