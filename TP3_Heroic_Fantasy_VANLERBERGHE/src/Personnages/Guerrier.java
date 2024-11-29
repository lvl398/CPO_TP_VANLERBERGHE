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
    private int comptageGuerrier=0;


    public Guerrier(String nom, int niveauVie, Arme Arme_en_Main, boolean cheval) {
        super(nom, niveauVie, Arme_en_Main);
        this.cheval = cheval;
        this.comptageGuerrier=comptageGuerrier+1;
    }
    
    public void finalize () {
        this.comptageGuerrier=comptageGuerrier-1;
    }

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }
    
    @Override
    public String toString() {
        return "Personnage{" + "Guerrier: " + "nom=" + getNom() + ", niveauVie=" + getNiveauVie() + ", cheval=" + cheval + "\n"+ "Arme en main="+getArme_en_Main().toString()+'}';
    }
    
    @Override 
    public void seFatiguer() {
        this.getNiveauVie()=;
        
    }
    
    @Override
    public boolean estVivant() {
        boolean result;
        if (this.getNiveauVie()==0) {
            result=false;
        } else {
            result=true;
        }
        return result;
    }
    
    @Override
    public void estAttaquer (int points) {
        this.getNiveauVie()=this.getNiveauVie()-points;
    }
    
}
