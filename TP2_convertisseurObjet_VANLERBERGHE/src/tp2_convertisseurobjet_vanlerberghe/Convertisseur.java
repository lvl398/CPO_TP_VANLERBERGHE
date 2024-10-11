/*
 * TP2 Exercice 2
 * TDB
 * Octobre 2024
 */
package tp2_convertisseurobjet_vanlerberghe;

/**
 *
 * @author louison_vl
 */
public class Convertisseur {
    int nbConversions=0;
    @Override
    public String toString () {
        return "nb de conversions : "+ nbConversions;
    }
    
    public double CelciusVersKelvin (double tCelcius) {
        tCelcius=tCelcius+273;
        nbConversions=nbConversions+1;
        return tCelcius;
    }
    public double KelvinVersCelcius (double tKelvin) {
        tKelvin=tKelvin-273;
        nbConversions=nbConversions+1;
        return tKelvin;
    }
    public double CelciusVersFarenheit (double tCelcius) {
        tCelcius=tCelcius*9/5+32;
        nbConversions=nbConversions+1;
        return tCelcius;
    }
    public double FarenheitVersCelcius (double tFarenheit) {
        tFarenheit=(tFarenheit-32)*5/9;
        return tFarenheit;
    }
    public double KelvinVersFarenheit (double tKelvin) {
        tKelvin=(tKelvin-273)*9/5+32;
        nbConversions=nbConversions+1;
        return tKelvin;
    }
    public double FarenheitVersKelvin (double tFarenheit) {
        tFarenheit=((tFarenheit-32)*5/9)+273;
        nbConversions=nbConversions+1;
        return tFarenheit;
    }
    
    
}
