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
public class TP2_Bieres_VANLERBERGHE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere=new BouteilleBiere("Cuvée des trolls",7.0,"Dubuisson");
        uneBiere.ouverte=false;
        uneBiere.lireEtiquette();
        BouteilleBiere deuxBiere=new BouteilleBiere("Leffe",6.6,"Abbaye de Leffe");
        deuxBiere.ouverte=false;
        deuxBiere.lireEtiquette();
        BouteilleBiere troisBiere=new BouteilleBiere("Trois",3.0,"Troisième");
        troisBiere.ouverte=false;
        troisBiere.lireEtiquette();
        BouteilleBiere quatreBiere=new BouteilleBiere("Quatre",4.0,"Quatrième");
        quatreBiere.ouverte=false;
        quatreBiere.lireEtiquette();
        BouteilleBiere cinqBiere=new BouteilleBiere("Cinq",5.0,"Cinquième");
        cinqBiere.ouverte=false;
        cinqBiere.lireEtiquette();
        
        uneBiere.Decapsuler();
        System.out.println(uneBiere.ouverte);
        
        troisBiere.Decapsuler();
        System.out.println(troisBiere.ouverte);
        
        System.out.println(uneBiere);
        
        BouteilleBiere sixBiere=new BouteilleBiere("Six",6.0,"Sixième");
        sixBiere.ouverte=false;
        sixBiere.lireEtiquette();
        BouteilleBiere septBiere=new BouteilleBiere("Sept",7.0,"Septième");
        septBiere.ouverte=false;
        septBiere.lireEtiquette();
        BouteilleBiere huitBiere=new BouteilleBiere("Huit",3.0,"Huitième");
        huitBiere.ouverte=false;
        huitBiere.lireEtiquette();
        BouteilleBiere neufBiere=new BouteilleBiere("Neuf",4.0,"Neuvième");
        neufBiere.ouverte=false;
        neufBiere.lireEtiquette();
        
        sixBiere.Decapsuler();
        System.out.println(sixBiere);
        septBiere.Decapsuler();
        System.out.println(septBiere);
        huitBiere.Decapsuler();
        System.out.println(huitBiere);

        
    }
    
}
