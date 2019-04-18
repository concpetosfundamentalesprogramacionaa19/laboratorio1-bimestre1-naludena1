/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

import java.util.Scanner;

/**
 *
 * @author nali1
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double sueldoMensual;
        double desc;
        double horas;
        double costoHoras;
        double valorPagar;
        
        // Ingreso de datos
        System.out.println("Ingrese el numero de horas trabajadas");
        horas = entrada.nextInt();
        
        System.out.println("Ingrese el costo por hora");
        costoHoras = entrada.nextDouble();
        
        // Cálculo del valor mensual
        sueldoMensual = (horas*costoHoras);
        desc = (sueldoMensual*0.10);
        valorPagar = (sueldoMensual-desc);
        // Salida de datos
        System.out.printf("El valor mensual a pagar es: %.2f$\n", valorPagar);
        System.out.printf("El descuento es: %.2f$\n", desc);
        
        
        
    }
    
}
