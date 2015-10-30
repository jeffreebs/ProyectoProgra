/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcadogame;

/**
 *
 * @author Jeffree BS producciones
 */
public class Ahorcadogame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String[] superheroes;
         String[] partesdelcuerpo;
         String[] animales;
        Categorias primercategoria = new Categorias (superheroes, partesdelcuerpo,animales);
        primercategoria.ObtenerOculta(null);
        primercategoria.Juego();
          
    }

}