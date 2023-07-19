
package lavadoraa;

import javax.swing.JOptionPane;

public class Lavadoraa {
  
  
  public static void main(String[]args){
  Lavados la = new Lavados();
  
      int peso = Integer.parseInt(JOptionPane.showInputDialog("Digite el peso en lbs de la ropa "));
  
      if (peso > 12 && peso <= 16) {
          
         la.alto();
 
      }
        
      if (peso > 8 && peso <= 12) {
          
          la.medio();
      }
      
      if (peso > 0 && peso <= 8) {
          
          la.bajo();
      }
      
      if (peso > 16 || peso < 0){
          System.out.println("Pusiste un peso incorrecto, por favor compruebe el peso de la ropa");
          
          System.out.println("Apagando");
      }
      
  }
  
}
