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
        String oculta = null;
                      
        Categorias c1 = new Categorias (letra, aleatoria, intentos, categoria, oculta);
        c1.ElegirCategoria(categoria);
        c1.ObtenerOculta(aleatoria);
        c1.Juego();     
    }
    
}
