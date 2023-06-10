/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.estaciones.terrestres;

import Clases.Autobus;
import Clases.Estacion;
import Clases.Pasajero;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebastián
 */
public class Menu {

    private int opc;

    Pasajero MiPasajero = new Pasajero();

    Autobus MiAutobus = new Autobus();

    Estacion MiEstacion = new Estacion();

    public void MenuPrincipal() {

        do {

            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione una opción: "
                    + "\n 1. Estaciones. "
                    + "\n 2. Autobuses. "
                    + "\n 3. Pasajeros. "
                    + "\n 4. Estadísticas. "
                    + "\n 0. Salir. "));

            switch (opc) {
                case 1:
                    MiEstacion.MenuEstaciones();

                    break;
                case 2:
                    MenuAutobus();

                    break;
                case 3:
                    MenuPasajero();

                    break;
                case 4:

                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el software. ");

                    break;
                default:
                    throw new AssertionError();
            }

        } while (opc != 0);

    }

    //MENU PASAJERO
    public void MenuPasajero() {

        ArrayList<Pasajero> P = new ArrayList<>();

        int opc;

        do {

            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "PASAJEROS: "
                    + "\n 1. Subir Pasajero. "
                    + "\n 2. Bajar Pasajero. "
                    + "\n 3. Disponibilidad. "
                    + "\n 0. Regresar. "));

            switch (opc) {
                case 1:

                    String Nombre = JOptionPane.showInputDialog("Digite su nombre: ");
                    Integer Edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad: "));

                    Pasajero Pasajerooo = new Pasajero(Nombre, Edad);

                    MiAutobus.RegistrarPasajero(Pasajerooo);
                    P.add(Pasajerooo);

                    JOptionPane.showMessageDialog(null, "SUBIENDO PASAJERO...");

                    break;
                case 2:

                    int off;

                    for (int i = 0; i < 1; i++) {
                        JOptionPane.showMessageDialog(null, P);

                    }

                    off = Integer.parseInt(JOptionPane.showInputDialog("De la lista anterior, seleccione a quién desea bajar. "));

                    P.remove(off - 1);

                    JOptionPane.showMessageDialog(null, "BAJANDO PASAJERO...");

                    for (int i = 0; i < 1; i++) {
                        JOptionPane.showMessageDialog(null, P);

                    }

                    break;
                case 3:

                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Volviendo al menú principal... ");

                    break;
                default:
                    throw new AssertionError();

            }

        } while (opc != 0);

    }

    //MENU AUTOBUS
    public void MenuAutobus() {

        do {

            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "AUTOBUSES: "
                    + "\n 1. Crear Autobuses. "
                    + "\n 2. Modificar. "
                    + "\n 3. Borrar. "
                    + "\n 4. Listado de Autobuses. "
                    + "\n 0. Regresar. "));

            switch (opc) {
                case 1:

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
