/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 */
package Tools;

import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 53298857Z
 */
public class Fichero {
    
    private String nombre;
   
    public Fichero(String nombre) {
        this.nombre = nombre;
    }    
    public void grabar(Object o){
        try { 
            XMLEncoder codificador = new XMLEncoder(new FileOutputStream(new File(nombre)));
            codificador.writeObject(o);
        } catch (FileNotFoundException ex) {
            System.out.println("Error no se ha podido grabar: " + ex.getMessage());
        }
    }
}
