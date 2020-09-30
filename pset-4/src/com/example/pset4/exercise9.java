package com.example.pset4;

import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("First name  : ");
        String first = in.nextLine().toUpperCase();
        System.out.println("Middle name : ");
        String middle = in.nextLine().toUpperCase();
        System.out.println("Last name   : ");
        String last = in.nextLine().toUpperCase();

        String firstInitial = first.substring(0,1);
        String middleInitial = middle.substring(0,1);
        String lastInitial = last.substring(0,1);

        System.out.println("\n" + firstInitial + middleInitial + lastInitial +".");
    }
}

