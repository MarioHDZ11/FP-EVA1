/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_23_bisiesto;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_23_Bisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Saber si es multiplo de 4. 
        //Residuo es 0 --> division exacta
        // modulo --> Calculo del residuo

        int year;
        Scanner cap = new Scanner(System.in);
        
        System.out.println("Introduce el Anio:");
        year = cap.nextInt();
        
        if(( year % 4 == 0 && year % 100 != 0 ) || ( year % 400 == 0)){
            System.out.println("El año es bisiesto"); 
        }
        else{
            System.out.println("El año no es bisiesto");
        }
    }
    
}
