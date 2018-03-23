package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double c;
        double p;
        Scanner lectureClavier = new Scanner(System.in);
        System.out.print("Enter one side of the square :");
        c = lectureClavier.nextDouble();
        p = (c * 4);
        System.out.print("Perimetre: "+ p );
    }
}
