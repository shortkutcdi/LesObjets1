package com.m2i.lesobjets1;

import com.m2i.lesobjets1.classes.Personne;

public class Launcher {

    public static void main(String[] args) {
        // Un peu comme Scanner : Scanner scanner = new Scanner(System.in);
        // On cr�e une Personne.
        Personne personne = new Personne();
        personne.prenom = "Renaud";
        personne.nom = "Berthier";
        personne.age = 46;

        // On cr�e une deuxi�me personne
        Personne deuxiemePersonne = new Personne();
        deuxiemePersonne.prenom = "John";
        deuxiemePersonne.nom = "Doe";
        deuxiemePersonne.age = 34;

        // Cr�ation d'un tableau de personnes (pour l'exemple)
        Personne[] tableauDePersonnes = new Personne[2];
//		tableauDePersonnes[0] = personne;
//		tableauDePersonnes[1] = deuxiemePersonne;

        // Cr�ation d'un autre tableau (plus succinct, pour l'exemple)
        // Personne[] tableauDePersonnes2 = { personne, deuxiemePersonne };
        // Un peu comme : int[] tableauDeNombres = { 1, 2, 3 };

        System.out.println(personne.prenom + " dit bonjour � " +
                deuxiemePersonne.prenom + " !");

//		System.out.println("Dans la salle sont pr�sent(e)s :");
//		for (int i = 0; i < tableauDePersonnes.length; i++) {
//			Personne laPersonne = tableauDePersonnes[i];
//			System.out.println(laPersonne.prenom 
//					+ " " + laPersonne.nom);
        // Plus court : System.out.println(tableauDePersonnes[i].prenom);
    }

}
