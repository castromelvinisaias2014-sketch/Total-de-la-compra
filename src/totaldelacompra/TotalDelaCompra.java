/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package totaldelacompra;


/**
 * @author Melvin
 */
public class TotalDelaCompra {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
     
        double precio = 10;
        double cantidad = 3;
        double total = totaldecompras (precio, cantidad);
        System.out.println("El total de la compra es: "+ total);
        }
        

    public static double totaldecompras (double precio, double cantidad) {
        double tc= (precio*cantidad);
        
        
  
        return tc;
    }
}
    
        
  
    
    

