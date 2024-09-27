/*
 * TP1 Exercice 3
`* TDB
 * Septembre 2024
 */
package tp1_guessmynumber_vanlerberghe;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author louison_vl
 */
public class TP1_guessMyNumber_VANLERBERGHE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random generateurAleat = new Random();
        int n=generateurAleat.nextInt(100);
        int nombre=0;
        int i=0;
        int diff=0;
        
        // Choix du mode de difficulté
        Scanner sc=new Scanner(System.in);
        System.out.println("Choisir un mode de difficulté "+"\n"+"1) facile"+"\n"+"2) normal"+"\n"+"3) difficile");
        int choix=sc.nextInt();
        
        // jeu mode facile 
        if (choix==1){
            while (nombre!=n) {
                System.out.println("Choisissez un nombre entre 0 et 100");
                nombre=sc.nextInt();
                diff=n-nombre;
                if (diff>30){
                    System.out.println("vraiment trop petit");
                    i=i+1;
                } else if (diff<-30) {
                    System.out.println("vraiment trop grand");
                    i=i+1;
                } else {
                    if (nombre>n) {
                        System.out.println("trop grand");
                    } else if (nombre<n) {
                        System.out.println("trop petit");
                    } else {
                        System.out.println("égal");
                    }
                    i=i+1;
                }
                
            }
            System.out.println("Le nombre de tentatives est "+i);
            
        // jeu mode normal
        } else if (choix==2) {
            while (nombre!=n) {
                System.out.println("Choisissez un nombre entre 0 et 100");
                nombre=sc.nextInt();
                if (nombre>n) {
                    System.out.println("trop grand");
                } else if (nombre<n) {
                    System.out.println("trop petit");
                } else {
                    System.out.println("égal");
                }
                i=i+1;
            }
            System.out.println("Le nombre de tentatives est "+i);
            
        // jeu mode difficile
        } else if (choix==3) {
            int tentative=5;
            while (nombre!=n) {
                System.out.println("Il vous reste "+tentative);
                System.out.println("Choisissez un nombre entre 0 et 100");
                nombre=sc.nextInt();
                if (nombre>n) {
                    System.out.println("trop grand");
                } else if (nombre<n) {
                    System.out.println("trop petit");
                } else {
                    System.out.println("égal");
                }
                i=i+1;
                tentative=tentative-1;
                if (tentative==0) {
                    System.out.println("Vous avez perdu!");
                    nombre=n;
                }
            }
        }
        System.out.println("Le nombre de tentatives est "+i);
        }

}
