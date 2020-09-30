package com.example.pset4;

import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("What\'s your favorite city? ");
        String city = in.nextLine();

        double length = city.length();
        String upper = city.toUpperCase();
        String lower = city.toLowerCase();

        System.out.println("\nText   : " + city);
        System.out.println("Length : " + String.format("%.0f", length));
        System.out.println("Upper  : " + upper);
        System.out.println("Lower  : " + lower);
    }
}

