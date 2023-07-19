
package lavadoraa;
import java.util.Scanner;

// Clase Lavadora
public class Lavados {
    
    public void alto(){
    
       for (int i = 8; i > 0; i--) {
             System.out.println("Se esta llenando, faltan: "+i+" segundos"); 
             esperarUnSegundo();
          }
       
        System.out.println("");
        
       for (int i = 8; i > 0; i--) {
             System.out.println("Se esta lavando, faltan: "+i+" segundos"); 
             esperarUnSegundo();
                     
          }
       
       System.out.println("");
       
       for (int i = 8; i > 0; i--) {
             System.out.println("Se esta enjuagando, faltan: "+i+" segundos");
             esperarUnSegundo();
          }
       
       System.out.println("");
       
       for (int i = 8; i > 0; i--) {
             System.out.println("Se esta exprimiendo, faltan: "+i+" segundos"); 
             esperarUnSegundo();
          }
       System.out.println("");
       System.out.println("Apagando");
    }
    
    public void medio(){
            
        for (int i = 6; i > 0; i--) {
             System.out.println("Se esta llenando, faltan: "+i+" segundos"); 
             esperarUnSegundo();
          }
        
        System.out.println("");
        
        for (int i = 6; i > 0; i--) {
             System.out.println("Se esta lavando, faltan: "+i+" segundos"); 
             esperarUnSegundo();
          }
        
        System.out.println("");
        
        for (int i = 6; i > 0; i--) {
             System.out.println("Se esta enjuagando, faltan: "+i+" segundos");
             esperarUnSegundo();
          }
        
        System.out.println("");
        
        for (int i = 6; i > 0; i--) {
             System.out.println("Se esta exprimiendo, faltan: "+i+" segundos"); 
             esperarUnSegundo();
          }
        System.out.println("");
        System.out.println("Apagando");
    }
    
    public void bajo(){
        
       for (int i = 4; i > 0; i--) {
              
           System.out.println("Se esta llenando, faltan: "+i+" segundos");
           esperarUnSegundo();
          }
       
        System.out.println("");
        
       for (int i = 4; i > 0; i--) {
             System.out.println("Se esta lavando, faltan: "+i+" segundos"); 
             esperarUnSegundo();
          }
       
       System.out.println("");
       
       for (int i = 4; i > 0; i--) {
             System.out.println("Se esta enjuagando, faltan: "+i+" segundos");
             esperarUnSegundo();
          }
       
       System.out.println("");
       
       for (int i = 4; i > 0; i--) {
             System.out.println("Se esta exprimiendo, faltan: "+i+" segundos"); 
             esperarUnSegundo();
          }
          System.out.println("");
        System.out.println("Apagando");
    }
    
    public static void esperarUnSegundo() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    
}
