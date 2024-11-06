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
public class Epee extends Arme {
    protected int indice;

    public Epee(String nom, int niveauAttaque, int indice) {
        super(nom, niveauAttaque);
        this.indice = indice;
        if (indice<100 & indice>=0) {
            this.indice=indice;
        } else if (indice>=100){
            this.indice = 99;
        } else if (indice<0){
            this.indice = 5;
        }
    }
    
}
