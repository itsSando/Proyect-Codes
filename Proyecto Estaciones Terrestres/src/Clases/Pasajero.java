/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebastián
 */
public class Pasajero {

    private String Nombre;
    private int Edad;

    Autobus MiAutobus = new Autobus();

    //CONSTRUCTOR
    public Pasajero(String Nombre, int Edad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public Pasajero() {
        this.Nombre = "NT";
        this.Edad = 0;

    }

    //GET AND SET
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "Nombre=" + Nombre + ", Edad=" + Edad + '}';
    }
    
    

    
}
