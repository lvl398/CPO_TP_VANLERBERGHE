/*
 * TP2 Exercice 1
 * TDB
 * Octobre 2024
 */
package tp2_bieres_vanlerberghe;

/**
 *
 * @author louison_vl
 */
public class BouteilleBiere {
    String Nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;
    public void lireEtiquette(){
        System.out.println("Bouteille de "+Nom+" ("+degreAlcool+" degres) \nBrasserie : "+brasserie);
        }
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie){
        Nom=unNom;
        degreAlcool=unDegre;
        brasserie=uneBrasserie;
        ouverte=false;
    }
    public void Decapsuler() {
        if (ouverte==false){
            ouverte=true;
        } else if (ouverte==true){
            boolean reponse=false;
            System.out.println("erreur : biere déjà ouverte"+reponse);
        }
    }
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = Nom + " (" + degreAlcool + " degrés) Ouverte ? ";
        if (ouverte == true ) chaine_a_retourner += "oui" ;
        else chaine_a_retourner += "non" ;
        return chaine_a_retourner;
    }
    
}
