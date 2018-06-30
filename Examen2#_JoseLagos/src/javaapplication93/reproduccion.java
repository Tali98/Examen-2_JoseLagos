/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication93;

import javafx.scene.control.ProgressBar;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author tali_
 */
public class reproduccion extends Thread{
    private int time;
    private String nombre;
    private String artist;
     Repo p = new Repo();

    public reproduccion(int time, String nombre, String artist) {
        this.time = time;
        this.nombre = nombre;
        this.artist = artist;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Repo getP() {
        return p;
    }

    public void setP(Repo p) {
        this.p = p;
    }

   

     
  
public void run(){
    p.setVisible(true);
    p.jl_name.setText(nombre);
    p.jl_artist.setText(artist);
    p.br.setMaximum(time);
    for (int a = 0 ; a < time ; a++){
        p.jl_hora.setText(Integer.toString(a));
        p.br.setValue(a);
           try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
    }
    p.setVisible(false);
}

}
