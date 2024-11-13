/*
 * TP3 Exercice 2
 * TDB
 * Novembre 2024
 */
package Personnages;

import Armes.Arme;
import static java.lang.constant.ConstantDescs.NULL;
import java.util.ArrayList;

/**
 *
 * @author louison_vl
 */
public abstract class Personnage {
    protected String nom;
    protected int niveauVie;
    protected Arme Arme_en_Main;

    // Constructeur 
    public Personnage(String nom, int niveauVie, Arme armePorter) {
        this.nom = nom;
        this.niveauVie = niveauVie;
        this.Arme_en_Main = (Arme) NULL;
    }

    // Méthode toString()
    @Override
    public String toString() {
        return "Personnage{" + "nom=" + nom + ", niveauVie=" + niveauVie + '}';
    }

    // Pour avoir accès au nom et au niveau de vie 
    public String getNom() {
        return nom;
    }

    public int getNiveauVie() {
        return niveauVie;
    }
    
    // Tableau qui regroupe toutes les armes du personnage (pouvant aller jusqu'à 5)
    ArrayList <Arme> SacaDos = new ArrayList <Arme> ();
    public void ajouterArme(Arme arme) {
        int nombre=SacaDos.size();
        if (nombre<6) {
            SacaDos.add(arme);
        }         
    }
    
}
