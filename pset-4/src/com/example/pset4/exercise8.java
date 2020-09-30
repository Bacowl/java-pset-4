package com.example.pset4;

import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Text : ");
        String text = in.nextLine().toUpperCase();

        String split1 = text.substring(0,text.length()/2);
        String split2 = text.substring(text.length()/2);

        System.out.println("\n" + split2 + split1 +".");
    }
}

