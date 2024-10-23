/*
 * TP2 Exercice 4
 * TDB
 * Octobre 2024
 */
package tp2_relation_1_vanlerberghe;

/**
 *
 * @author louison_vl
 */
public class Voiture {
    String modele;
    String marque;
    int PuissanceCV;
    Personne Proprietaire ;
    
    public Voiture(String modele, String marque, int PuissanceCV) {
        this.modele = modele;
        this.marque = marque;
        this.PuissanceCV = PuissanceCV;
    }
    
    @Override
    public String toString () {
        return marque+" "+modele+" "+PuissanceCV;
    }
}
