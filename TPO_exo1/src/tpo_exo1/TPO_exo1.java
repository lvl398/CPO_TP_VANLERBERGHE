/*
 * TPO Exercice 1
 * TDB
 * Septembre 2024
 */
package tpo_exo1;

import java.util.Scanner;

/**
 *
 * @author louison_vl
 */
public class TPO_exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bonjour");
        System.out.println("Au revoir");
        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour,quel est votre prénom?");
        prenom=sc.nextLine();
        System.out.println("Bonjour "+prenom +"!");
    }
    
}
