/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcadogame;

/**
 *
 * @author Jeffree BS Producciones
 */
public class clasesahorcado {
    private String [] Superheroes;
    private String [] Partesdelcuerpo;
    private String [] Animales;
    private String [] Partesdelosmusculos;
    private String [] Sistemasoperativos;
    private String palabras;
    private String [] resultado;
    private int intentos=0; 

    public clasesahorcado(String[] Superheroes, String[] Partesdelcuerpo, String[] Animales, String[] Partesdelosmusculos, String[] Sistemasoperativos, String palabras, String[] resultado) {
        this.Superheroes = Superheroes;
        this.Partesdelcuerpo = Partesdelcuerpo;
        this.Animales = Animales;
        this.Partesdelosmusculos = Partesdelosmusculos;
        this.Sistemasoperativos = Sistemasoperativos;
        this.palabras = palabras;
        this.resultado = resultado;
    }

    public String[] getSuperheroes() {
        return Superheroes;
    }

    public void setSuperheroes(String[] Superheroes) {
        this.Superheroes = Superheroes;
    }

    public String[] getPartesdelcuerpo() {
        return Partesdelcuerpo;
    }

    public void setPartesdelcuerpo(String[] Partesdelcuerpo) {
        this.Partesdelcuerpo = Partesdelcuerpo;
    }

    public String[] getAnimales() {
        return Animales;
    }

    public void setAnimales(String[] Animales) {
        this.Animales = Animales;
    }

    public String[] getPartesdelosmusculos() {
        return Partesdelosmusculos;
    }

    public void setPartesdelosmusculos(String[] Partesdelosmusculos) {
        this.Partesdelosmusculos = Partesdelosmusculos;
    }

    public String[] getSistemasoperativos() {
        return Sistemasoperativos;
    }

    public void setSistemasoperativos(String[] Sistemasoperativos) {
        this.Sistemasoperativos = Sistemasoperativos;
    }

    public String getPalabras() {
        return palabras;
    }

    public void setPalabras(String palabras) {
        this.palabras = palabras;
    }

    public String[] getResultado() {
        return resultado;
    }

    public void setResultado(String[] resultado) {
        this.resultado = resultado;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

}



    


