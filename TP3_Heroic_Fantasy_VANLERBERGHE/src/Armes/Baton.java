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
public class Baton extends Arme {
    private int age;

    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque);
        this.age = age;
        if (age<100 & age>=0) {
            this.age = age;
        } else if (age>=100){
            this.age = 99;
        } else if (age<0){
            this.age = 5;
        }
    }

    @Override
    public String toString() {
        return "Arme{" +"Baton: "+ "nom=" + nom + ", niveauAttaque=" + niveauAttaque + ", age=" + age + '}';
    }
    
    
    
}
