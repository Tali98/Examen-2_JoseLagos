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
public class Usuario {
    private String name;
    private int edad;
    private String username;
    private String password;
    private ArrayList<playlist>playlist = new ArrayList();
    private ArrayList<cancion>favoritas = new ArrayList();

    public Usuario() {
    }

    public Usuario(String name, int edad, String username, String password) {
        this.name = name;
        this.edad = edad;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<playlist> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList<playlist> playlist) {
        this.playlist = playlist;
    }



    public ArrayList<cancion> getFavoritas() {
        return favoritas;
    }

    public void setFavoritas(ArrayList<cancion> favoritas) {
        this.favoritas = favoritas;
    }

    @Override
    public String toString() {
        return "Usuario{" + "name=" + name + ", edad=" + edad + ", username=" + username + ", password=" + password + ", playlist=" + playlist + ", favoritas=" + favoritas + '}';
    }
    
    
}
