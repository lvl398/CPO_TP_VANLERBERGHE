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
        if (choix==1){
            diff=n-nombre;
            if (diff>20)
        } else if (choix==2) {
            
        } else if (choix==3) {
            
        }
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
        }

}
