/*
 * TD2 Exercice 3
 * TDB
 * Octobre 2024
 */
package tp2_maniip_vanlerberghe;

/**
 *
 * @author louison_vl
 */
public class TP2_maniip_VANLERBERGHE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ;
        
        System.out.println("nb de calories de Assiette 2 : " +
        assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +
        assiette3.nbCalories) ;
        
        // On échanges les valeurs entre l'assiette 1 et l'assiette 
        Tartiflette change=assiette1;
        assiette1=assiette2;
        assiette2=change;
        assiette3 = assiette2 ;
        
        System.out.println("nb de calories de Assiette 2 : " +
        assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +
        assiette3.nbCalories) ;
        
        // Les deux lignes ne sont pas corrects 
        //Mousaka assiette666 = assiette1 ;
        //Mousaka assiette667 = new Tartiflette() ;
        //Une référence objet ne peut pas référencer un autre type d'objet, ici assiette1 est un objet dans la classe Tartiflette et pas Mousaka
        Mousaka[] tableauMousaka = new Mousaka[10];
        
        // Création des 10 nouveaux objets qui sont ensuite placé dans le tableau 
        Mousaka assietteMousaka1=new Mousaka(100);
        tableauMousaka[0] = assietteMousaka1;
        
        Mousaka assietteMousaka2=new Mousaka(200);
        tableauMousaka[1] = assietteMousaka2;
        
        Mousaka assietteMousaka3=new Mousaka(300);
        tableauMousaka[2] = assietteMousaka3;
        
        Mousaka assietteMousaka4=new Mousaka(400);
        tableauMousaka[3] = assietteMousaka4;
        
        Mousaka assietteMousaka5=new Mousaka(500);
        tableauMousaka[4] = assietteMousaka5;
        
        Mousaka assietteMousaka6=new Mousaka(600);
        tableauMousaka[5] = assietteMousaka6;
        
        Mousaka assietteMousaka7=new Mousaka(700);
        tableauMousaka[6] = assietteMousaka7;
        
        Mousaka assietteMousaka8=new Mousaka(800);
        tableauMousaka[7] = assietteMousaka8;
        
        Mousaka assietteMousaka9=new Mousaka(900);
        tableauMousaka[8] = assietteMousaka9;
        
        Mousaka assietteMousaka10=new Mousaka(1000);
        tableauMousaka[9] = assietteMousaka10;
        
    }
    
}
