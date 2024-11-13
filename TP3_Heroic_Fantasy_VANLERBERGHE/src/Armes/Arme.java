/*
 * TP3 Exercice 1
 * TDB
 * Novembre 2024
 */
package Armes;

/**
 *
 * @author louison_vl
 */
public abstract class Arme {
    String nom;
    protected int niveauAttaque;

    // Constructeur et conditions sur le niveau d'attaque qui est un entier entre 0 et 100
    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        if (niveauAttaque<=100 & niveauAttaque>=0) {
            this.niveauAttaque = niveauAttaque;
        } else if (niveauAttaque>100){
            this.niveauAttaque = 100;
        } else if (niveauAttaque<0){
            this.niveauAttaque = 5;
        }
    }

    public int getNiveauAttaque() {
        return niveauAttaque;
    }
    public void setNiveauAttaque(int niveauAttaque) {
        this.niveauAttaque = niveauAttaque;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    

    @Override
    public String toString() {
        return "Arme{" + "nom=" + nom + ", niveauAttaque=" + niveauAttaque + '}';
    }
    
    
    
    
}
