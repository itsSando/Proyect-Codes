/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import proyecto.estaciones.terrestres.Archivo;

/**
 *
 * @author Sebastián
 */
public class Terminal {

    private String Nombre;
    private String Ubicacion;
    private int MaximoAutobuses;
    private int numeroAutobuses;
    private ArrayList<Autobus> Buses;

    //CONSTRUCTOR
    public Terminal(String Nombre, String Ubicacion, int MaximoAutobuses, int numeroAutobuses, ArrayList<Autobus> Buses) {
        this.Nombre = Nombre;
        this.Ubicacion = Ubicacion;
        this.MaximoAutobuses = MaximoAutobuses;
        this.numeroAutobuses = numeroAutobuses;
        this.Buses = Buses;
    }

    public Terminal() {
        this.Nombre = "NT";
        this.Ubicacion = "NT";
        this.MaximoAutobuses = 0;
        this.numeroAutobuses = 0;
        this.Buses = new ArrayList<Autobus>();

    }

    //GET AND SET
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public int getMaximoAutobuses() {
        return MaximoAutobuses;
    }

    public void setMaximoAutobuses(int MaximoAutobuses) {
        this.MaximoAutobuses = MaximoAutobuses;
    }

    public int getNumeroAutobuses() {
        return numeroAutobuses;
    }

    public void setNumeroAutobuses(int numeroAutobuses) {
        this.numeroAutobuses = numeroAutobuses;
    }

    public ArrayList<Autobus> getBuses() {
        return Buses;
    }

    public void setBuses(ArrayList<Autobus> Buses) {
        this.Buses = Buses;
    }

}
