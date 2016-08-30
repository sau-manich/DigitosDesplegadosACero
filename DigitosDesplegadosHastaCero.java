/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package IIsemestre2014;
import java.io.*;

/**
 *
 * @author Juanito
 */
public class DigitosDesplegadosHastaCero {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader dato = new BufferedReader (new InputStreamReader(System.in));
    int x,d;
    System.out.println("ingrese numero");
    x=Integer.parseInt(dato.readLine());    
    while(x>0){
       d=x %10; 
       while(d>=0){
           System.out.print(","+d);
           d--;
       }
        System.out.println("");
       x=x/10;
    }
    
} 
}