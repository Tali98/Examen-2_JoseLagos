/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication93;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author tali_
 */
public class playlist implements Serializable {
    private String nombre;
    private ArrayList<cancion>canciones1 = new ArrayList();
   private static final long SerialVersionUID = 777L;
    public playlist() {
    }

    public playlist(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
