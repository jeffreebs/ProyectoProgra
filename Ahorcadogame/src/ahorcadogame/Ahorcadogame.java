/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcadogame;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeffree BS producciones
 */
public class Ahorcadogame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char letra = 0;
        String aleatoria="";
        int intentos=0;
        String categoria="";
        
              
        Categorias c1 = new Categorias (letra, aleatoria, intentos, categoria);
        
        categoria = JOptionPane.showInputDialog(null, "Elija la categoría que desea jugar: a.Super Héroes b.Partes del cuerpo c.Animales");
    
    
      
        
        
                        
    }
    
}
