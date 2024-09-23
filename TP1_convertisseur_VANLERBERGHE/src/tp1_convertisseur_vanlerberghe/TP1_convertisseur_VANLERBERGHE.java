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
        // On demande à l'utilisateur de saisir une valeur correspondant à une température
        Scanner temp=new Scanner(System.in);
        System.out.println("Bonjour, saisissez une valeur : ");
        double temperature;
        temperature=temp.nextDouble();
        
        // On demande à l'utilisateur une conversion qu'il souhaite faire
        Scanner conv=new Scanner(System.in);
        System.out.println("Saisissez la conversion que vous souhaiter effectuer :"+"\n"+"1) De Celcius vers Kelvin"+"\n"+"2) De Kelvin vers Celcius");
        System.out.println("3) De Celcius vers Farenheit"+"\n"+"4) De Farenheit vers Celcius"+"\n"+"5) De Kelvin vers Farenheit"+"\n"+"6) De Farenheit vers Kelvin");
        double conversion;
        conversion=conv.nextDouble();
        
        // On convertit la temperature 
        if (conversion==1){
            System.out.println(temperature+" degré Celcius est égal à "+CelciusVersKelvin(temperature)+" degrés Kelvin");
        } else if (conversion==2) {
            System.out.println(temperature+" degré Kelvin est égal à "+KelvinVersCelcius(temperature)+" degrés Celcius");
        } else if (conversion==3) {
            System.out.println(temperature+" degré Celcius est égal à "+CelciusVersFarenheit(temperature)+" degrés Farenheit");
        } else if (conversion==4) {
            System.out.println(temperature+" degré Farenheit est égal à "+FarenheitVersCelcius(temperature)+" degrés Celcius");
        } else if (conversion==5) {
            System.out.println(temperature+" degré Kelvin est égal à "+KelvinVersFarenheit(temperature)+" degrés Farenheit");
        } else if (conversion==6) {
            System.out.println(temperature+" degré Farenheit est égal à "+FarenheitVersKelvin(temperature)+" degrés Kelvin");
        }

        //System.out.println(CelciusVersKelvin(50));
    }
    
    public static double CelciusVersKelvin (double tCelcius) {
        tCelcius=tCelcius+273;
        return tCelcius;
    }
    public static double KelvinVersCelcius (double tKelvin) {
        tKelvin=tKelvin-273;
        return tKelvin;
    }
    public static double CelciusVersFarenheit (double tCelcius) {
        tCelcius=tCelcius*9/5+32;
        return tCelcius;
    }
    public static double FarenheitVersCelcius (double tFarenheit) {
        tFarenheit=(tFarenheit-32)*5/9;
        return tFarenheit;
    }
    public static double KelvinVersFarenheit (double tKelvin) {
        tKelvin=(tKelvin-273)*9/5+32;
        return tKelvin;
    }
    public static double FarenheitVersKelvin (double tFarenheit) {
        tFarenheit=((tFarenheit-32)*5/9)+273;
        return tFarenheit;
    }
    
}
