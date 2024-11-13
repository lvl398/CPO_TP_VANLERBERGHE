/*
 * TP3 Exercice 2
 * TDB
 * Novembre 2024
 */
package tp3_heroic_fantasy_vanlerberghe;

/**
 *
 * @author louison_vl
 */
public class Magicien extends Personnage {
    private boolean confirme;

    public Magicien(String nom, int niveauVie, boolean confirme) {
        super(nom, niveauVie);
        this.confirme = confirme;
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

    @Override
    public String toString() {
        return "Personnage{" + "Magicien: " + "nom=" + nom + ", niveauVie=" + niveauVie  + "confirme=" + confirme + '}';
    }
    
    
    
}
