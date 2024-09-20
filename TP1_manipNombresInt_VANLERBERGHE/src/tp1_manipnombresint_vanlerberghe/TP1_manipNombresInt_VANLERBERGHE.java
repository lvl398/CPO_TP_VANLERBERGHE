/*
 * TP1 Exercice 1
 * TDB
 * Septembre 2024
 */
package tp1_manipnombresint_vanlerberghe;

import java.util.Scanner;

/**
 *
 * @author louison_vl
 */
public class TP1_manipNombresInt_VANLERBERGHE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner val1=new Scanner(System.in);
        System.out.println("Saisir une première valeur");
        int valeur1;
        valeur1=val1.nextInt();
        
        Scanner val2=new Scanner(System.in);
        System.out.println("Saisir une deuxième valeur");
        int valeur2;
        valeur2=val2.nextInt();
        
        System.out.println("Les deux valeurs sont "+ valeur1 +" et "+ valeur2);
        
        int addition=valeur1+valeur2;
        int soustraction=valeur1-valeur2;
        int produit=valeur1*valeur2;
        
        System.out.println("La somme des valeurs est "+addition);
        System.out.println("La différence des valeurs est "+soustraction);
        System.out.println("Le produit des valeurs est "+produit);
        
        int division=valeur1/valeur2;
        int modulo=valeur1%valeur2;
        
        System.out.println("Le quotient entier de la division est "+division+" et le reste de la division est "+modulo);
    }
    
}
