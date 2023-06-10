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
public class Estacion {

    private ArrayList<Terminal> Terminales;

    Archivo MiArchivo = new Archivo();

    private int opc;

    //CONSTRUCTOR
    public Estacion() {
        this.Terminales = new ArrayList<Terminal>();
    }

    //GET AND SET
    public ArrayList<Terminal> getTerminales() {
        return Terminales;
    }

    public void setTerminales(ArrayList<Terminal> Terminales) {
        this.Terminales = Terminales;
    }

    //MENU
    public void MenuEstaciones() {

        do {

            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "ESTACIONES: "
                    + "\n 1. Cargar Estaciones. "
                    + "\n 2. Modificar Estaciones. "
                    + "\n 3. Borrar Estaciones. "
                    + "\n 4. Listado de Estaciones. "
                    + "\n 0. Regresar. "));

            switch (opc) {
                case 1:
                    JOptionPane.showMessageDialog(null, "CARGANDO ESTACIONES...");

                    break;

                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Volviendo al menú principal... ");

                    break;
                default:
                    throw new AssertionError();
            }

        } while (opc != 0);

    }

}
