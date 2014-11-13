LABBEN
======
package skoluppgift;


 import java.util.Scanner; 
 import java.lang.Math; 
 import java.text.NumberFormat; 
 import javax.swing.JOptionPane; 

/**
 *
 * @author h14kalun
 */
public class Skoluppgift {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
  
   NumberFormat Decimal = NumberFormat.getInstance();     
          
  Scanner in = new Scanner(System.in); 
   
  String value1 = JOptionPane.showInputDialog("Mata in cirkelns radie i cm"); // Skriver in radien på cirkeln
      
   
  
    double Diameter = Integer.parseInt(value1) * 2; //Beräkna värdet från användarens input
    double Omkrets = Math.PI * 2 * Integer.parseInt(value1); // Beräkna värdet från användarens input
    double Area = Math.pow(Integer.parseInt(value1),2) * Math.PI; //Beräkna värdet från användarens input
              
    JOptionPane.showMessageDialog(null,  "Arean för cirkeln är: " + Decimal.format(Area)+ "cm"+ " Omkretsen är: " + Decimal.format(Omkrets) +"cm"+ " Diametern är: "+ Decimal.format(Diameter)+"cm"); //Skriver ut svaret i decimalform

     
    
         
         
              }  
 
}
