package com.company;

import java.time.Year;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Variable
	String nom;
	int age;
	int date;

	//Demander les infos
	int year = Year.now().getValue();
        Scanner lectureNom = new Scanner(System.in);
        System.out.print("Entrez votre prénom: ");
        nom = lectureNom.next();
        Scanner lectureAge =  new Scanner(System.in);
        System.out.print("Quel est votre age: ");
        age = lectureAge.nextInt();
        date = year - age;
        //Afficher les infos
        System.out.println("Votre nom est " + nom + " et vous avez " + age + " ans" + " ainsi votre annee de naissance est " + date + " ou " + (date - 1));

    }
}
