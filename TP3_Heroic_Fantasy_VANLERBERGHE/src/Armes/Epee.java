/*
 * TP3 Exercice 1
 * TDB
 * Novembre 2024
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author louison_vl
 */
public class Epee extends Arme {
    protected int finesse;

    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque);
        this.finesse = finesse;
        if (finesse<100 & finesse>=0) {
            this.finesse=finesse;
        } else if (finesse>=100){
            this.finesse = 99;
        } else if (finesse<0){
            this.finesse = 5;
        }
    }

    @Override
    public String toString() {
        return "Arme{" + "Epee: " + "nom=" + nom + ", niveauAttaque=" + niveauAttaque  + ", finesse=" + finesse + '}';
    }
    
    
}
