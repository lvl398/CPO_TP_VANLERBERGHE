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
        
        String degre="";
        double conversion=1;
        while (conversion!=0) {
            // On demande à l'utilisateur une conversion qu'il souhaite faire
            Scanner conv=new Scanner(System.in);
            System.out.println("Saisissez la conversion que vous souhaiter effectuer :"+"\n"+"1) De Celcius vers Kelvin"+"\n"+"2) De Kelvin vers Celcius");
            System.out.println("3) De Celcius vers Farenheit"+"\n"+"4) De Farenheit vers Celcius"+"\n"+"5) De Kelvin vers Farenheit"+"\n"+"6) De Farenheit vers Kelvin"+"\n"+"0) Plus besoin de convertir");
            conversion=conv.nextDouble();
            
            // En fonction de la conversion choisis, une conversion va être effectué
            if (conversion==1) {
                nombre=temperature.CelciusVersKelvin(nombre);
                degre="Kelvin";
                System.out.println(nombre);
            } else if (conversion==2) {
                nombre=temperature.KelvinVersCelcius(nombre);
                degre="Celcius";
                System.out.println(nombre);
            } else if (conversion==3) {
                nombre=temperature.CelciusVersFarenheit(nombre);
                degre="Farenheit";
                System.out.println(nombre);
            } else if (conversion==4) {
                nombre=temperature.FarenheitVersCelcius(nombre);
                degre="Celcius";
                System.out.println(nombre);
            } else if (conversion==5) {
                nombre=temperature.KelvinVersFarenheit(nombre);
                degre="Farenheit";
                System.out.println(nombre);
            } else if (conversion==6) {
                nombre=temperature.FarenheitVersKelvin(nombre);
                degre="Kelvin";
                System.out.println(nombre);
            }
        }
        System.out.println(nombre+degre);
        System.out.println(temperature);
        
        
    }
    
}
