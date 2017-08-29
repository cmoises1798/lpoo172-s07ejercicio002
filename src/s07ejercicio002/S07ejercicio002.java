/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package s07ejercicio002;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class S07ejercicio002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creando un objeto Scanner
        Scanner input = new Scanner(System.in);
        
        //Creando valor constante
        final double METROS_POR_PIES = 0.305;
        
        //Mostrar mensaje al usuario
        System.out.print("INGRESE UN VALOR EN PIES:");
        double feet = input.nextDouble();
        
        //Coenvertir pies en metros
        double meters = feet * METROS_POR_PIES;
        
        //Mostrar resultado
        System.out.println(feet + " pies son " + meters + " en metros.");
        
        
        

      
    }
}
