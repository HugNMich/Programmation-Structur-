package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
    double canadien = 1.30, nbr_euro, total;

    NumberFormat y = new DecimalFormat("#0.00");
        Scanner lecture =  new Scanner(System.in);
        System.out.print("CAD : ");
        total =  lecture.nextFloat();
        nbr_euro = (total/canadien);

      System.out.print("USD: " + y.format(nbr_euro));
    }
}
