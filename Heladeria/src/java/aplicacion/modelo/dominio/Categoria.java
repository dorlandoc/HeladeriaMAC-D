/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

/**
 *
 * @author Win8
 */
public class Categoria {
    
    private String palitos;
    private String bombones;
    private String tortas;
    private String helados;

    public Categoria(String palitos, String bombones, String tortas, String helados) {
        this.palitos = palitos;
        this.bombones = bombones;
        this.tortas = tortas;
        this.helados = helados;
    }

    public Categoria() {
    }

    /**
     * @return the palitos
     */
    public String getPalitos() {
        return palitos;
    }

    /**
     * @param palitos the palitos to set
     */
    public void setPalitos(String palitos) {
        this.palitos = palitos;
    }

    /**
     * @return the bombones
     */
    public String getBombones() {
        return bombones;
    }

    /**
     * @param bombones the bombones to set
     */
    public void setBombones(String bombones) {
        this.bombones = bombones;
    }

    /**
     * @return the tortas
     */
    public String getTortas() {
        return tortas;
    }

    /**
     * @param tortas the tortas to set
     */
    public void setTortas(String tortas) {
        this.tortas = tortas;
    }

    /**
     * @return the helados
     */
    public String getHelados() {
        return helados;
    }

    /**
     * @param helados the helados to set
     */
    public void setHelados(String helados) {
        this.helados = helados;
    }
    
   
    
    
}
