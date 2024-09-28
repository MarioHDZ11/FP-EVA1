/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_22_califas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_22_Califas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        Scanner cap = new Scanner(System.in);
        
        System.out.println("Calificacion con numeros a Letras");
        numero = cap.nextInt();
        
        if((numero >= 90) && (numero <= 100)){
            System.out.println("A");
        }else if((numero >= 80)&&(numero <= 89)){
             System.out.println("B");
        }else if((numero >= 70)&&(numero <= 79)){
             System.out.println("C");
        }else if((numero >= 60)&&(numero <= 69)){
             System.out.println("D");
        }else if((numero <= 0)&&(numero <= 59)){
             System.out.println("F");
        }
        else {
            System.out.println("Calificacion Invalida!!");
        }
        
        
    }
    
}
