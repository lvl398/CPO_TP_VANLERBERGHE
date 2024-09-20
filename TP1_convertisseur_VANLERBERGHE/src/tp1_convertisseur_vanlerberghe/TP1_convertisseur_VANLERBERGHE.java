/*
 * TP1 Exercice 2 
 * TDB
 * Septembre 2024
 */
package tp1_convertisseur_vanlerberghe;

import java.util.Scanner;

/**
 *
 * @author louison_vl
 */
public class TP1_convertisseur_VANLERBERGHE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // On demande une valeur à l'utilisateur
        Scanner val=new Scanner(System.in);
        System.out.println("Saisir une première valeur");
        double celcius;
        celcius=val.nextDouble();
        System.out.println("La température en celcius est "+celcius);
        
        // La valeur 1 est une température en celcius, on la change en Kelvin
        double kelvin=celcius+273;
        System.out.println("La température en kelvin est "+kelvin);
    }
    
    
}
