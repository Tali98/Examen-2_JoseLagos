/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication93;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
  

/**
 *
 * @author tali_
 */
public class adminUsuarios implements Serializable{
        private File archivo = null;
    private ArrayList<Usuario>listaUsuarios= new ArrayList();
    

   private static final long SerialVersionUID = 777L;
  
   public adminUsuarios(String path){
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }


    @Override
    public String toString() {
        return "adminUsuarios{" + "archivo=" + archivo + ", listaUsuarios=" + listaUsuarios + '}';
    }
       public void setUsuario(Usuario a){
        listaUsuarios.add(a);
    }
  public void cargarArchivo(){
        try {
            Usuario temp;
            listaUsuarios = new ArrayList();
            if(archivo.exists()){
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((temp=(Usuario)objeto.readObject())!=null){
                        listaUsuarios.add(temp);
                    }
                } catch (EOFException e) {
                    e.printStackTrace();
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for(Usuario t : listaUsuarios){
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        }finally{
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
    
}
