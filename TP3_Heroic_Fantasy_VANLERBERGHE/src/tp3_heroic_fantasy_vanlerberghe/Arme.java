/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_vanlerberghe;

/**
 *
 * @author louison_vl
 */
public class Arme {
    String nom;
    int niveauAttaque;

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

    @Override
    public String toString() {
        return "Arme{" + "nom=" + nom + ", niveauAttaque=" + niveauAttaque + '}';
    }
    
    
    
    
}
