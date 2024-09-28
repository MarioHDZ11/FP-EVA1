/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_17_rangos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_17_Rangos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int calif;
        Scanner cap = new Scanner(System.in);
        
        System.out.println("¿Cual es la calificacion?");
        calif = cap.nextInt();
        
        if((calif >= 0) && (calif <= 100)){
            System.out.println("Calificacion valida");
            
        }else{
        System.out.println("calificacion NO valida");
                
    }
        if((calif >= 70) && (calif <= 100)){
            System.out.println("Calificacion Aprobada!!");
            
        }else{
        System.out.println("Reprobado!!");
                
    }
    
}
