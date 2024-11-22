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
    private String nom;
    private int niveauVie;
    private Arme Arme_en_Main;

    // Constructeur 
    public Personnage(String nom, int niveauVie, Arme Arme_en_Main) {
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

    public Arme getArme_en_Main() {
        return Arme_en_Main;
    }
    
    public void equiperPersonnage(Arme Arme) {
        for (int k=0; k<6; k++) {
            if (SacaDos.get(k)==Arme){
                this.Arme_en_Main=SacaDos.get(k);
                System.out.println("L'arme est bien dans l'inventaire, elle est équipée");
            }
        }
    }
    
}
