package com.company;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	float taxe1 = 0.05f, taxe2 = 0.04f , total , prix;


	//Formatter + Currency
        DecimalFormat x = new DecimalFormat("#0.00$");

        Scanner prix1 = new Scanner(System.in);
        System.out.print("Prix: ");
        prix = prix1.nextFloat();
        taxe1 = prix * (taxe1);
        taxe2 = prix * (taxe2);
        total =  (prix + taxe1) + taxe2;

        System.out.println("Prix  |   TVQ   |  TPS  |  Total");
        System.out.println(x.format(prix) + "   " + x.format(taxe1)  + "    " + x.format(taxe2) + "   " + x.format(Math.round(total)));

    }
}
