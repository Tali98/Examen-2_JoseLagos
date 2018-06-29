/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication93;

import java.util.ArrayList;

/**
 *
 * @author tali_
 */
public class Albums {

    private String nombre;
    private String artista;
    private ArrayList<cancion> canciones1 = new ArrayList();

    public Albums(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public ArrayList<cancion> getCanciones1() {
        return canciones1;
    }

    public void setCanciones1(ArrayList<cancion> canciones1) {
        this.canciones1 = canciones1;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
