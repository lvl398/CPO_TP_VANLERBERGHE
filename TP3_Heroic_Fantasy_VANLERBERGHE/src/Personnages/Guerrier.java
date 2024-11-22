/*
 * TP3 Exercice 2
 * TDB
 * Novembre 2024
 */
package Personnages;

import Armes.Arme;

/**
 *
 * @author louison_vl
 */
public class Guerrier extends Personnage {
    private boolean cheval;


    public Guerrier(String nom, int niveauVie, Arme Arme_en_Main, boolean cheval) {
        super(nom, niveauVie, Arme_en_Main);
        this.cheval = cheval;
    }
    
    

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }
    
    @Override
    public String toString() {
        return "Personnage{" + "Guerrier: " + "nom=" + getNom() + ", niveauVie=" + getNiveauVie() + ", cheval=" + cheval + "\n"+ "Arme en main="+getArme_en_Main().toString()+'}';
    }
    
    
}
