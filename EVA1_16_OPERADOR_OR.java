/*O
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_16_operador_or;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_16_OPERADOR_OR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Km, Meses;
        Scanner cap = new Scanner(System.in);
        System.out.println("Cuanto kilometraje tiene el vehiculo:");
        Km = cap.nextInt();
        System.out.println("Cuanto kilometraje tiene el vehiculo:");
        Meses = cap.nextInt();
        //Con una de las dos comparaciones que se cumpla, el if es verdadero
        if(Km >= 5000 || Meses >= 6){
        System.out.println("Cambio de aceite!!");
    }else{
            System.out.println("Vehiculo en buenas condiocnes");
            }
    }
    
}
