/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_10_formulas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_10_FORMULAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double Vo, Time, Aclr, Dist;
        Scanner captu = new Scanner (System.in);
        
        System.out.println("Formula para caluclar Distancia.-");
        System.out.println("Velocidad inicial:");
        Vo = captu.nextDouble();
        System.out.println("Tiempo:");
        Time = captu.nextDouble();
        System.out.println("Aceleracion:");
        Aclr = captu.nextDouble();
        Dist = Vo * Time + (Aclr * (Time * Time) / 2 ) ;
        System.out.println("Distancia=" + Dist );
    }
}