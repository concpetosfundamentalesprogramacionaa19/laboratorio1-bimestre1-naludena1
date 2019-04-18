/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import java.util.Scanner;

/**
 *
 * @author nali1
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String nota1;
        String nota2;
        String nota3;
        double prom;
        
        // Ingreso de datos
        System.out.println("Ingrese la primera nota");
        nota1 = entrada.nextLine();
        
        System.out.println("Ingrese la segunda nota");
        nota2 = entrada.nextLine();
        
        System.out.println("Ingrese la tercera nota");
        nota3 = entrada.nextLine();
        // Conversion de datos
        double notaUno = Double.parseDouble(nota1);
        double notaDos = Double.parseDouble(nota2);
        double notaTres = Double.parseDouble(nota3);
        // Calculo del promedio de las notas
        prom = ((notaUno+notaDos+notaTres)/3);
        // Resultados 
        String bandera = prom>=14 ? "Aprobado" : "No aprobado";
              
        System.out.println(bandera);   
    }
    
}
