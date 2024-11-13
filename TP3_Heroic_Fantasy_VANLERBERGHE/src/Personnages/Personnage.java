/*
 * TP3 Exercice 2
 * TDB
 * Novembre 2024
 */
package Personnages;

/**
 *
 * @author louison_vl
 */
public abstract class Personnage {
    protected String nom;
    protected int niveauVie;

    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
    }

    @Override
    public String toString() {
        return "Personnage{" + "nom=" + nom + ", niveauVie=" + niveauVie + '}';
    }

    public String getNom() {
        return nom;
    }

    public int getNiveauVie() {
        return niveauVie;
    }
    
}
