/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_14_tipo_hacienda;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_14_TIPO_HACIENDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char Tipo;
        Scanner cap = new Scanner(System.in);
        
        System.out.println("Captura el tipo de persona: F:Si es fisica, M:Si es moral");
        Tipo = cap.nextLine().charAt(0);
        System.out.println("El caracter es " + Tipo);
        //System.out.println("El caracter es " + tipo);
        if(Tipo == 'F')
            System.out.println("Persona Fisisca");
        else
            System.out.println("Persona Moral");
    
    }
    
}
