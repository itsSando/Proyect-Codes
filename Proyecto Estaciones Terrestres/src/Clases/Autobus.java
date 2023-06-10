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
public class Autobus {

    private String Nombre;
    private String Ruta;
    private int MaximoPasajeros;
    private int numeroPasajeros;
    private ArrayList<Pasajero> Pasajeros;

    private int opc;

    //CONSTRUCTOR
    public Autobus(String Nombre, String Ruta, int MaximoPasajeros, int numeroPasajeros, ArrayList<Pasajero> Pasajeros) {
        this.Nombre = Nombre;
        this.Ruta = Ruta;
        this.MaximoPasajeros = MaximoPasajeros;
        this.numeroPasajeros = numeroPasajeros;
        this.Pasajeros = Pasajeros;
    }

    public Autobus() {
        this.Nombre = "NT";
        this.Ruta = "NT";
        this.MaximoPasajeros = 0;
        this.numeroPasajeros = 0;
        this.Pasajeros = new ArrayList();

    }

    //GET AND SET
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRuta() {
        return Ruta;
    }

    public void setRuta(String Ruta) {
        this.Ruta = Ruta;
    }

    public int getMaximoPasajeros() {
        return MaximoPasajeros;
    }

    public void setMaximoPasajeros(int MaximoPasajeros) {
        this.MaximoPasajeros = MaximoPasajeros;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public ArrayList<Pasajero> getPasajeros() {
        return Pasajeros;
    }

    public void setPasajeros(ArrayList<Pasajero> Pasajeros) {
        this.Pasajeros = Pasajeros;
    }

    public void RegistrarPasajero(Pasajero a) {
        this.Pasajeros.add(a);

    }

}
