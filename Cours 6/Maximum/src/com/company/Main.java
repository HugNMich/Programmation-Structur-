package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                int premiere, deuxieme, laPlusGrande ;

                Scanner lectureClavier = new Scanner(System.in);

                System.out.print("Entrer une valeur :") ;
                premiere =  lectureClavier.nextInt();
                System.out.print("Entrer une deuxieme valeur :") ;
                deuxieme =  lectureClavier.nextInt();
                if (premiere > deuxieme)    {
                    System.out.println(deuxieme + "  " + premiere) ;
                    laPlusGrande = premiere ;
                }
                else   {

                    if (premiere == deuxieme) {
                        System.out.println("Vos valeur sont egaux");
                        System.out.println("Les valeurs sont :" +  premiere + " et " + deuxieme);
                    }

                            laPlusGrande = deuxieme;


                }

                System.out.println("La plus grande valeur est : " + laPlusGrande) ;
            } // Fin du main ()
        } // Fin de la classe Maximum
