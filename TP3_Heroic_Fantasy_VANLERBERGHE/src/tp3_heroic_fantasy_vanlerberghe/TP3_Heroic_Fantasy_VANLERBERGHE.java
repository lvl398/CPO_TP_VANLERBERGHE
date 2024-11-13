/*
 * TP3 
 * TDB
 * Novembre 2024
 */
package tp3_heroic_fantasy_vanlerberghe;

import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author louison_vl
 */
public class TP3_Heroic_Fantasy_VANLERBERGHE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Epee Excalibur = new Epee ("Exacalibur",7,5);
        Epee Durandal = new Epee ("Durandal",4,7);
        Baton Chene = new Baton ("Chene",4,5);
        Baton Charme = new Baton ("Charme",5,6);
        
        ArrayList <Arme> groupeArmes = new ArrayList <Arme> ();
        groupeArmes.add(Excalibur);
        groupeArmes.add(Durandal);
        groupeArmes.add(Chene);
        groupeArmes.add(Charme);
        
        int taille=groupeArmes.size();
        for (int i=0 ; i<taille ; i++) {
            System.out.println(groupeArmes.get(i));
        }
        
    }
    
}
