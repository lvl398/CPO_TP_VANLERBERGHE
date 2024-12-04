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
public class Magicien extends Personnage {
    private boolean confirme;
    private int comptageMagicien=0;

    public Magicien(String nom, int niveauVie, Arme Arme_en_Main, boolean confirme) {
        super(nom, niveauVie, Arme_en_Main);
        this.confirme = confirme;
        this.comptageMagicien=comptageMagicien+1;
    }
    
    public void finalize() {
        this.comptageMagicien=comptageMagicien-1;
    }
    
    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

    @Override
    public String toString() {
        return "Personnage{" + "Magicien: " + "nom=" +getNom() + ", niveauVie=" + getNiveauVie()  + ", confirme=" + confirme + "\n"+ "Arme en main="+getArme_en_Main().toString()+ '}';
    }
    
}
