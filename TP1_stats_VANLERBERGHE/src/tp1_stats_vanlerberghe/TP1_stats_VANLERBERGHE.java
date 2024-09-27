/*
 * TP1 Exercice 4
 * TDB
 * Septembre 2024
 */
package tp1_stats_vanlerberghe;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author louison_vl
 */
public class TP1_stats_VANLERBERGHE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] tab=new int[6];
        Scanner nbr=new Scanner(System.in);
        System.out.println("Saisir un nombre entier");
        int m=nbr.nextInt();
        for (int i=0; i<m; i++) {
            Random generateurAleat = new Random ();
            int n = generateurAleat.nextInt(5);
            tab[n]++;
        }
        for (int k=0; k<6; k++) {
            System.out.println("cellule "+ k +" : "+tab[k]*100*1.0/m+"%");
        }
    }
    
}
