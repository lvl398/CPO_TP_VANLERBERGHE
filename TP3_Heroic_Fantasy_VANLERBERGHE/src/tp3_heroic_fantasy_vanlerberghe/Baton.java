/*
 * TP3 Exercice 1
 * TDB
 * Novembre 2024
 */
package tp3_heroic_fantasy_vanlerberghe;

/**
 *
 * @author louison_vl
 */
public class Baton extends Arme {
    private int age;

    public Baton(int age, String nom, int niveauAttaque) {
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
    
}
