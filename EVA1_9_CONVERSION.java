/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_9_conversion;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_9_CONVERSION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double fahr, cent, kelv;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Temperatura en grados fahrenheit a centigrados:");
        fahr = captu.nextDouble();
        cent = (fahr - 32) / 1.8;
        System.out.println("°c =" + cent);
        System.out.println("Temperatura en grados centigrados a fahrenheit:");
        cent = captu.nextDouble();
        fahr = cent * 1.8 + 32;
        System.out.println("°F =" + fahr);
        System.out.println("Temperatura en grados centigrados a kelvin:");
        cent = captu.nextDouble();
        kelv = cent + 273.15;
        System.out.println("°K =" + kelv);
        System.out.println("Temperatura en grados kelvin a centigrados:");
        kelv = captu.nextDouble();
        cent = kelv - 273.15;
        System.out.println("°c =" + cent);
         System.out.println("Temperatura en grados kelvin a fahrenheit:");
        kelv = captu.nextDouble();
        fahr = 1.8 * (kelv - 237.15) + 32 ;
        System.out.println("°F =" + fahr);
        System.out.println("Temperatura en grados fahrenheit kelvin:");
        fahr = captu.nextDouble();
        kelv = 5/9 * (fahr - 32) + 273.15 ;
        System.out.println("°K =" + kelv);
       
    }
    
}
