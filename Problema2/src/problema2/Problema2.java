/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import java.util.Scanner;

/**
 *
 * @author nali1
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String x;
        String y;
        String z;
        double m;
        // Ingreso de datos
        System.out.println("Ingrese la primera variable");
        x = entrada.nextLine();
        
        System.out.println("Ingrese la segunda variable");
        y = entrada.nextLine();
        
        System.out.println("Ingrese la tercera variable");
        z = entrada.nextLine();
        // Conversion de datos
        double variablex = Double.parseDouble(x);
        double variabley = Double.parseDouble(y);
        double variablez = Double.parseDouble(z);
        // Calculo de datos
        m = (variablex+(variabley/variablez))/(variablex-(variabley/variablez));
        // Salida de datos
        System.out.printf("El valor de m, en base a las variables: \nx= %s "
                + "\n   y= %s \n\tz= %s \nda como resultado: \n\tm= %.2f\n ", 
                variablex, variabley, variablez, m);
       
    }
    
}

