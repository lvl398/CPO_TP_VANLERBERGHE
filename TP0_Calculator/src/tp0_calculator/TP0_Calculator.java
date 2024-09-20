/*
 * TP0 Partie 3
 * TDB
 * Septembre 2024
 */
package tp0_calculator;

import java.util.Scanner;

/**
 *
 * @author louison_vl
 */
public class TP0_Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // On récupere une valeur correspondant à un opérateur
        Scanner op = new Scanner(System.in);
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        int operator;
        operator=op.nextInt();
        
        if (operator>5){
            System.out.println("Sorry, there are no operators corresponding to "+operator);
        }
        else if (operator<1){
            System.out.println("Sorry, there are no operators corresponding to "+operator);
        }
        else {
            // On demande à l'utilisateur une première valeur 
            Scanner val1 = new Scanner(System.in);
            System.out.println("Please enter the first number");
            int operande1;
            operande1=val1.nextInt();
        
            // On demande à l'utilisateur une deuxième valeur
            Scanner val2 = new Scanner(System.in);
            System.out.println("Please enter the secand number");
            int operande2;
            operande2=val2.nextInt();
        
            int result;
                result=0;
            if (operator==1){
                result=operande1+operande2;
            }
            else if (operator==2){
                result=operande1-operande2;
            }
            else if (operator==3){
                result=operande1*operande2;
            }
            else if (operator==4){
                result=operande1/operande2;
            }
            else if (operator==5){
                result=operande1%operande2;
            }
        
            System.out.println("The result is : "+result);

        }
        
    }
    
}
