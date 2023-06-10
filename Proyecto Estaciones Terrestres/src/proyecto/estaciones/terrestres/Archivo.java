package proyecto.estaciones.terrestres;

import Clases.Terminal;
import javax.swing.JOptionPane;
import java.io.*;

/**
 *
 * @author Sebastián
 */
public class Archivo {

    public String[] LeerTXT(String direccion) {

        String[] texto = {};

        try {
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;

            while ((bfRead = bf.readLine()) != null) {
                temp = temp + bfRead;

                texto = temp.split(",");

            }

        } catch (Exception z) {
            JOptionPane.showMessageDialog(null, "No se encontró ningún archivo");

        }

        return texto;

    }

}
