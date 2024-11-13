/*
 * TP3 
 * TDB
 * Novembre 2024
 */
package tp3_heroic_fantasy_vanlerberghe;

import Personnages.Guerrier;
import Personnages.Magicien;
import Personnages.Personnage;
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
        
        int taille1=groupeArmes.size();
        for (int i=0 ; i<taille1 ; i++) {
            System.out.println(groupeArmes.get(i));
        }
        
        
        Magicien Gandalf = new Magicien ("Gandalf",65,true);
        Magicien Garcimore = new Magicien ("Garcimore",44,false);
        Guerrier Conan = new Guerrier ("Conan",78,false);
        Guerrier Lannister = new Guerrier ("Lannister",45,true);
        
        ArrayList <Personnage> groupePersonnages = new ArrayList <Personnage> ();
        groupePersonnages.add(Gandalf);
        groupePersonnages.add(Garcimore);
        groupePersonnages.add(Conan);
        groupePersonnages.add(Lannister);
        
        
        int taille2=groupePersonnages.size();
        for (int i=0 ; i<taille2 ; i++) {
            System.out.println(groupePersonnages.get(i));
        }
        
        
    }
    
}
