/*
 * TP3 Exercice 2
 * TDB
 * Novembre 2024
 */
package Personnages;

import Personnages.Personnage;

/**
 *
 * @author louison_vl
 */
public class Guerrier extends Personnage {
    private boolean cheval;

    public Guerrier(String nom, int niveauVie, boolean cheval) {
        super(nom, niveauVie);
        this.cheval = cheval;
    }

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }
    
    @Override
    public String toString() {
        return "Personnage{" + "Guerrier: " + "nom=" + nom + ", niveauVie=" + niveauVie + ", cheval=" + cheval + '}';
    }
    
    
}
