/*
 * TP2 Exercice 4
 * TDB
 * Octobre 2024
 */
package tp2_relation_1_vanlerberghe;

/**
 *
 * @author louison_vl
 */
public class Personne {
    String nom;
    String prenom;
    int nbVoitures;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    @Override
    public String toString () {
        return "Personne : "+prenom+" "+nom;
    }
}
