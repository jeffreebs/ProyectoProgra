/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcadogame;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author Jeffree BS Producciones
 */
public class Categorias {

    Scanner sc = new Scanner(System.in);  // se utiliza para escanear las letras que seran ingresadas
    private String[] superheroes;      // se crea una variable llamada superheroes
    private String[] partesdelcuerpo;  // se crea una variable llamda partesdelcuerpo
    private String[] animales;         // se crea una variable llamdad animales
    public char letra;            // se utiliza el char para 1 sola letra que se introducira en el juego
    public String aleatoria;      // la String de tipo aleatoria se crea para  elegir al azar la palabra por adivinar
    private int intentos;        // Muestra los intentos que quedan para perder
    public String categoria;     // muestra las categorias de las palabras que quieren adivinar
    public String oculta;        // esconde la palabra para que no sepan cual es
    public int i = 0;
    StringBuffer ocultaMod = new StringBuffer(this.ObtenerOculta(oculta)); //StringBuffer me permite modificar la palabra,utilizada para que este oculta
    StringBuffer errores = new StringBuffer("***********"); // la palabra estara escondida mientras siga presentando errores
   
    
     public Categorias(String[] superheroes,String[]partesdelcuerpo,String[]animales) {
        this.superheroes=superheroes;
        this.partesdelcuerpo=partesdelcuerpo;
        this.animales=animales;
        // se crean los constructores
    }
    
    
  
    public int RandomA() {
        int posicion = (int) (Math.random() * animales.length);
        return posicion;
    }

    public int RandomSP() {
        int posicion = (int) (Math.random() * superheroes.length);
        return posicion;

    }

    public int RandomPC() {
        int posicion = (int) (Math.random() * partesdelcuerpo.length);
        return posicion;
    // metodos de Set and Get creados utilizando un int de Math.random para colocar la posicion de la letra
    }
    

    public String ElegirCategoria() { // se utiliza para elegir la categoria
        categoria = JOptionPane.showInputDialog(null, "Elija la categoría que desea jugar: a.Super Héroes b.Partes del cuerpo c.Animales");
       // se utiliza este metodo para la impresion en la pantalla y elegir la categoria
        if (categoria.equalsIgnoreCase("A")) { // utilizada para que ignore si es mayuscula o minuscula la letra que digitamos
            aleatoria = superheroes[this.RandomSP()]; // al elegir la categoria superheroes solo busca palabras de esa categoria
        } else if (categoria.equalsIgnoreCase("B")) {
            aleatoria = partesdelcuerpo[this.RandomPC()];
        } else {
            aleatoria = animales[this.RandomA()];
        }
        return aleatoria; // hace que vuelva a empezar de nuevo el juego
    }

    public String ObtenerOculta(String oculta) {

        for (i = 0; i >= aleatoria.length(); i++) { // obtiene la palabra oculta y conjuga el tamaño de ella para campatir con la opcion que digiten
            oculta = oculta + "*";
        }
        return oculta;// al fallar vuelve a retomar la palabra oculta
    }

    public int Juego() {

        while (intentos < 11 && this.ElegirCategoria().equals(ocultaMod.toString()) == false) {
            System.out.print("Intenta advinar la palabra. Digite una letra: \r"); // me muestra un mensaje en donde tengo que digitar una palabra
            letra = sc.next().charAt(0);
            if (aleatoria.indexOf(letra) >= 0) {
                JOptionPane.showMessageDialog(null, "Acertaste");// muestra un mensaje de felicitaciones
                int posicion1 = aleatoria.indexOf(letra);
                int posicion2 = aleatoria.lastIndexOf(letra);
                ocultaMod.setCharAt(posicion1, letra);
                ocultaMod.setCharAt(posicion2, letra);
            } else if (aleatoria.indexOf(letra) == -1) {
                errores.setCharAt(intentos, letra);
                JOptionPane.showMessageDialog(null, "Incorrecto, intenta de nuevo");
                intentos = intentos + 1;
            }

        }
        return intentos;
    }

}
