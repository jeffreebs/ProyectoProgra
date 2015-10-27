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
    
    Scanner sc = new Scanner(System.in);
    
    String [] superheroes={"BATMAN", "SUPERMAN", "IRONMAN", "HULK", "URSA", "GOKU", "VEGUETA", "SPIDERMAN"};
    String [] partesdelcuerpo={"BRAZO", "PIERNA", "CABEZA", "PECHO", "TORSO", "ABDOMEN", "MANOS", "PIES"};
    String [] animales={"GATO", "PERRO", "VACA", "TORO", "PAJARO", "TIGRE", "CABALLO", "LEON", "HORMIGA"};
    private char letra;
    private String aleatoria;
    private int intentos; 
    private String categoria;
    
   
    StringBuilder oculta = new StringBuilder();
    StringBuilder errores = new StringBuilder("***********");
    
    public Categorias(char letra, String aleatoria, int intentos, String categoria) {
        this.intentos=intentos;
        this.letra = letra;
        this.aleatoria = aleatoria;
        this.categoria= categoria;
    }

   

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public String getAleatoria() {
        return aleatoria;
    }

    public void setAleatoria(String aleatoria) {
        this.aleatoria = aleatoria;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }
    
    public int RandomA(String []animales ){
        int posicion = (int) (Math.random() * animales.length);
        return posicion;
    }

    public int RandomSP(String []superheroes){
         int posicion = (int) (Math.random() * superheroes.length);
         return posicion;
    
    }
    public int RandomPC(String []partesdelcuerpo){
        int posicion = (int)(Math.random() * partesdelcuerpo.length);
        return posicion;
    }
    
    public String ElegirCategoria(String categoria){
        categoria = JOptionPane.showInputDialog(null, "Elija la categoría que desea jugar: a.Super Héroes b.Partes del cuerpo c.Animales");
        if(categoria.equalsIgnoreCase("A")){
            aleatoria= superheroes[this.RandomSP(superheroes)];
        }else if(categoria.equalsIgnoreCase("B")){
            aleatoria= partesdelcuerpo[this.RandomPC(partesdelcuerpo)];
        }else{
            aleatoria=animales[this.RandomA(animales)];     
        }    
        return aleatoria;
    }
    
    public String ObtenerOculta(String oculta){
        int i=0;
        while(i<aleatoria.length()){
        oculta= oculta + "*";
        i=i+1;
        }
        return oculta;  
    }
    
    public int Juego(String aleatoria, int intentos, StringBuilder oculta){
     while(aleatoria.equals(oculta.toString())==false && intentos<11){
    System.out.print("Intenta advinar la palabra. Digite una letra: \r");
    letra = sc.next().charAt(0);
    if(aleatoria.indexOf(letra)>=0){
        int posicion1= aleatoria.indexOf(letra);
        int posicion2= aleatoria.lastIndexOf(letra);
        JOptionPane.showMessageDialog(null, "Acertaste");
        oculta.setCharAt(posicion1, letra);
        oculta.setCharAt(posicion2, letra);
    }
    
     }              
    
    
    
    
    
    
    
    
    
}

    

    


