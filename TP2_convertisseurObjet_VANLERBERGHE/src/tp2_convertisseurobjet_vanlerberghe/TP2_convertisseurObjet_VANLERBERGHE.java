/*
 * TP2 Exercice 2
 * TDB
 * Octobre 
 */
package tp2_convertisseurobjet_vanlerberghe;

import java.util.Scanner;

/**
 *
 * @author louison_vl
 */
public class TP2_convertisseurObjet_VANLERBERGHE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // On demande à l'utilisateur d'indiquer la température qu'il souhaite convertir
        Scanner temp=new Scanner(System.in);
        System.out.println("Bonjour, saisissez une valeur : ");
        double nombre;
        nombre=temp.nextDouble();
        
        // Crétaion d'un nouvel objet et conversion de la température indiquer précédemment
        Convertisseur temperature=new Convertisseur();
        temperature.CelciusVersKelvin(nombre);
        temperature.KelvinVersFarenheit(nombre);
        temperature.FarenheitVersCelcius(nombre);
        System.out.println(temperature);
        
        while 
        // On demande à l'utilisateur une conversion qu'il souhaite faire
        Scanner conv=new Scanner(System.in);
        System.out.println("Saisissez la conversion que vous souhaiter effectuer :"+"\n"+"1) De Celcius vers Kelvin"+"\n"+"2) De Kelvin vers Celcius");
        System.out.println("3) De Celcius vers Farenheit"+"\n"+"4) De Farenheit vers Celcius"+"\n"+"5) De Kelvin vers Farenheit"+"\n"+"6) De Farenheit vers Kelvin"+"\n"+"0) Plus besoin de convertir");
        double conversion;
        conversion=conv.nextDouble();
    }
    
}
