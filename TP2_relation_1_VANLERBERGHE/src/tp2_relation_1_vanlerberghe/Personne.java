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
    int nbVoitures ;
    Voiture [] liste_voitures ;
    
//, int nbVoitures, Voiture[] liste_voitures
    
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        liste_voitures = new Voiture [3] ;
        nbVoitures=0;
    }
    
    @Override
    public String toString () {
        return "Personne : "+prenom+" "+nom;
    }
    
    public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
        boolean result;
        if (voiture_a_ajouter.Proprietaire!=null) {
            result=false;
        } else if (this.nbVoitures==3){
            result=false;
        } else {
            if (this.nbVoitures==0) {
                this.liste_voitures[0]=voiture_a_ajouter;
                this.nbVoitures++;
            } else if (this.nbVoitures==1) {
                this.liste_voitures[1]=voiture_a_ajouter;
                this.nbVoitures++;
            } else if (this.nbVoitures==2) {
                this.liste_voitures[2]=voiture_a_ajouter;
                this.nbVoitures++;
            }
            voiture_a_ajouter.Proprietaire = this ;
            result=true;
        }
        return result;
    }
}
