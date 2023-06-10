package proyecto1sebastiánsandovalfallas;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebastián Sandoval Fallas
 *
 *
 */
public class Proyecto1SebastiánSandovalFallas {

    public static int globalV;
    public static String globalnom, globalape1, globalape2, corr, eda;

    //Juego Ahorcado
    public static void main(String[] args) {

        menu();

    }

//    public static void primeraParte(int a) {
//        List<String> palabras = Arrays.asList("programacion", "interfaz", "herramientas",
//                "codigos", "verificacion", "usb", "ventilacion", "grafica", "ciclos", "ram",
//                "random", "static", "void", "class", "string", "integer", "boolean", "array",
//                "sistema", "argumentos", "virus", "cyberseguridad", "cableado", "placa",
//                "tecnologia", "computacion", "array", "java", "gabinete", "fuente", "metodos",
//                "monitor", "operacion", "while", "base", "flujo", "conexiones", "audio", //37
//                "mensaje", "null", "double", "main", "validacion", "audifonos", "teclado", //44
//                "mouse", "programa", "paquetes", "true", "almacenamiento", "datos"); //50
//
//        int i = 0;
//
////        while (i < palabras.size()){
////            System.out.println(palabras.get(i));
////            i++;
////            
////        }
//        Random rand = new Random();
//        String palabraJuego = palabras.get(rand.nextInt(palabras.size()));
//
//        System.out.println(palabraJuego);
//
//        List<Character> jugadores = new ArrayList<>();
//
//        System.out.println();
//
//        int intentos = 0;
//
//        while (true) {
//            ahorcado(intentos);
//
//            if (intentos >= 6) {
//                JOptionPane.showMessageDialog(null, "Perdió!!! ");
//                break;
//            }
//            impresionPalabras(palabraJuego, jugadores);
//
//            if (!jugando(palabraJuego, jugadores));
//            {
//                intentos++;
//
//            }
//
//            if (impresionPalabras(palabraJuego, jugadores)) {
//                JOptionPane.showMessageDialog(null, "Ganó!!! ");
//                break;
//
//            }
//            String tmp = "";
//
//            do {
//                tmp = JOptionPane.showInputDialog("Digite la palabra completa si ya la conoce... ");
//                CANCELAR(tmp);
//
//                if (esSoloLetras(tmp)) {
//                } else {
//                    JOptionPane.showMessageDialog(null, tmp + " No es un dato válido ");
//                }
//
//            } while (!esSoloLetras(tmp));
//
//            if (palabraJuego.equalsIgnoreCase(tmp)) {
//                JOptionPane.showMessageDialog(null, "Ganó!!! " + "\n Total de intentos requeridos: " + intentos);
//                break;
//
//            } else {
//                JOptionPane.showMessageDialog(null, "Usted se ha equivocado, siga participando ");
//            }
//
//        }
//    }
    public static boolean jugando(String palabraJuego, List<Character> jugadores) {
        String letra;

        do {
            letra = JOptionPane.showInputDialog("Digite una letra (No mayúsculas) ");
            CANCELAR(letra);

            if (esSoloLetras(letra)) {
            } else {
                JOptionPane.showMessageDialog(null, letra + " No es un dato válido ");
            }

        } while (!esSoloLetras(letra));

        jugadores.add(letra.charAt(0));

        return palabraJuego.contains(letra);

    }

    public static boolean impresionPalabras(String palabraJuego, List<Character> jugadores) {
        String concatena = "";
        int correctas = 0;

        JOptionPane.showMessageDialog(null, "Su palabra es: ");
        for (int i = 0; i < palabraJuego.length(); i++) {
            if (jugadores.contains(palabraJuego.charAt(i))) {
                concatena = concatena + palabraJuego.charAt(i);

                correctas++;
            } else {
                concatena = concatena + " - ";

            }

        }
        JOptionPane.showMessageDialog(null, concatena);
        return (palabraJuego.length() == correctas);
    }

    public static void ahorcado(int intentos) {

        switch (intentos) {
            case 0: {
                JOptionPane.showMessageDialog(null, "Bienvenido al juego de ahorcado"
                        + "\n Tiene un total de 6 intentos ");
                break;
            }
            case 1: {
                JOptionPane.showMessageDialog(null, ""
                        + "Intento #1 "
                        + "_________ \n "
                        + "|      |\n"
                        + " .o\n");
                break;
            }
            case 2: {
                JOptionPane.showMessageDialog(null, ""
                        + "Intento #2 "
                        + "_________ \n "
                        + "|      |\n"
                        + " .o\n"
                        + "\\ ");
                break;
            }
            case 3: {
                JOptionPane.showMessageDialog(null, ""
                        + "Intento #3 "
                        + "_________ \n "
                        + "|      |\n"
                        + " .o\n"
                        + "\\_/\n");
                break;
            }
            case 4: {
                JOptionPane.showMessageDialog(null, ""
                        + "Intento #4 "
                        + "_________ \n "
                        + "|      |\n"
                        + " .o\n"
                        + "\\_/\n"
                        + "  | \n");
                break;
            }
            case 5: {
                JOptionPane.showMessageDialog(null, ""
                        + "Intento #5 "
                        + "_________ \n "
                        + "|      |\n"
                        + " .o\n"
                        + "\\_/\n"
                        + "  | \n"
                        + "/  \n");
                break;
            }
            case 6: {
                JOptionPane.showMessageDialog(null, ""
                        + "Intento #6 "
                        + "_________ \n "
                        + "|      |\n"
                        + " .o\n"
                        + "\\_/\n"
                        + "  | \n"
                        + "/   \\\n");
                break;
            }
            case 7: {
                JOptionPane.showMessageDialog(null, ""
                        + "_________ \n "
                        + "|      |\n"
                        + " .o\n"
                        + "\\_/\n"
                        + "  | \n"
                        + "/   \\\n"
                        + "LO SENTIMOS... ");
                break;
            }

        }

    }

    public static void datos() {
        String nombre, apellido1, apellido2, edad, correo;
        int continuar;
        int extra;
        String pal;

        do {

            do {

                nombre = JOptionPane.showInputDialog("Ingrese su nombre ");
                CANCELAR(nombre);
                globalnom = nombre;

                if (esSoloLetras(nombre)) {
                } else {
                    JOptionPane.showMessageDialog(null, nombre + " No es un dato válido ");
                }

            } while (!esSoloLetras(nombre));

            do {
                apellido1 = JOptionPane.showInputDialog("Ingrese su primer apellido ");
                CANCELAR(apellido1);
                globalape1 = apellido1;

                if (esSoloLetras(apellido1)) {
                } else {
                    JOptionPane.showMessageDialog(null, apellido1 + " No es un dato válido ");
                }

            } while (!esSoloLetras(apellido1));

            do {
                apellido2 = JOptionPane.showInputDialog("Ingrese su segundo apellido ");
                CANCELAR(apellido2);
                globalape2 = apellido2;

                if (esSoloLetras(apellido2)) {
                } else {
                    JOptionPane.showMessageDialog(null, apellido2 + " No es un dato válido ");
                }

            } while (!esSoloLetras(apellido2));

            continuar = JOptionPane.showConfirmDialog(null, "Su nombre completo es: "
                    + nombre + " " + apellido1 + " " + apellido2 + "?", "Confirmación", JOptionPane.YES_NO_OPTION);

        } while (continuar != 0);

        do {
            correo = JOptionPane.showInputDialog("Digite su correo electrónico ");
            CANCELAR(correo);
            corr = correo;

            if (esCorreo(correo)) {
            } else {
                JOptionPane.showMessageDialog(null, correo + " No es un dato válido ");
            }

        } while (!esCorreo(correo));

        do {

            edad = JOptionPane.showInputDialog("Digite su edad ");
            CANCELAR(edad);
            eda = edad;

            if (IsInteger(edad)) {
            } else {
                JOptionPane.showMessageDialog(null, edad + " No es un dato válido ");
            }

        } while (!IsInteger(edad));

        JOptionPane.showMessageDialog(null, "Su información es: "
                + "\n Nombre: " + nombre + " " + apellido1 + " " + apellido2
                + "\n Correo Electrónico: " + correo
                + "\n Edad: " + edad + " años ");

        extra = JOptionPane.showConfirmDialog(null, "Desea agregar una palabra "
                + "extra? ",
                "Confirmación", JOptionPane.YES_NO_OPTION);

        if (extra == 0) {
            do {
                pal = JOptionPane.showInputDialog("Ingrese la palabra extra ");
                CANCELAR(pal);

                if (esSoloLetras(pal)) {
                    JOptionPane.showMessageDialog(null, pal + " Palabra guardada ");
                } else {
                    JOptionPane.showMessageDialog(null, pal + " No es un dato válido ");
                }

            } while (!esSoloLetras(pal));
        }

    }

    //Menú funcional donde están todas las opciones
    public static void menu() { //Se ejecuta los datos y el menú

        String opc;
        int continuar;
        int extra;
        String pal;
        String info;

        JOptionPane.showMessageDialog(null, "Bienvenid@s al juego de AHORCADOx"
                + "\n Antes de empezar, favor ingresar la información personal que se le solicita: ");

        //DATOS************************************************************************
        datos();

        //MENÚ*************************************************************************
        do {
            opc = JOptionPane.showInputDialog("AHORCADOx "
                    + "\n ***Escoja una de las siguientes opciones para empezar "
                    + "\n 1 - Datos de usuario 1 "
                    + "\n 2 - "
                    + "\n 3 - Iniciar juego "
                    + "\n 4 - Resultados "
                    + "\n 5 - Salir"
                    + "\n 6 - Créditos");

            CANCELAR(opc);

            switch (opc) {
                case "1": {
                    //datos();
                    JOptionPane.showMessageDialog(null, "Su información es: "
                            + "\n Nombre: " + globalnom + " " + globalape1 + " " + globalape2
                            + "\n Correo Electrónico: " + corr
                            + "\n Edad: " + eda + " años ");

                }
                break;

                case "2": {
                    //PROXIMAMENTE

                }
                case "3": {
                    int conti, repdatos;
                    do {

                        List<String> palabras = Arrays.asList("programacion", "interfaz", "herramientas",
                                "codigos", "verificacion", "usb", "ventilacion", "grafica", "ciclos", "ram",
                                "random", "static", "void", "class", "string", "integer", "boolean", "array",
                                "sistema", "argumentos", "virus", "cyberseguridad", "cableado", "placa",
                                "tecnologia", "computacion", "array", "java", "gabinete", "fuente", "metodos",
                                "monitor", "operacion", "while", "base", "flujo", "conexiones", "audio", //37
                                "mensaje", "null", "double", "main", "validacion", "audifonos", "teclado", //44
                                "mouse", "programa", "paquetes", "true", "almacenamiento", "datos"); //50

                        int i = 0;

//        while (i < palabras.size()){
//            System.out.println(palabras.get(i));
//            i++;
//            
//        }
                        Random rand = new Random();
                        String palabraJuego = palabras.get(rand.nextInt(palabras.size()));

                        System.out.println(palabraJuego);

                        List<Character> jugadores = new ArrayList<>();

                        System.out.println();

                        int intentos = 0, total;

                        while (true) {
                            ahorcado(intentos);

                            if (intentos >= 6) {
                                JOptionPane.showMessageDialog(null, "Perdió!!! ");
                                break;
                            }
                            impresionPalabras(palabraJuego, jugadores);

                            if (!jugando(palabraJuego, jugadores));
                            {
                                intentos++;
                                total = intentos;
                                globalV = total;

                            }

                            if (impresionPalabras(palabraJuego, jugadores)) {
                                JOptionPane.showMessageDialog(null, "Ganó!!! ");
                                break;

                            }
                            String tmp = "";

                            do {
                                tmp = JOptionPane.showInputDialog("Digite la palabra completa si ya la conoce... ");
                                CANCELAR(tmp);

                                if (esSoloLetras(tmp)) {
                                } else {
                                    JOptionPane.showMessageDialog(null, tmp + " No es un dato válido ");
                                }

                            } while (!esSoloLetras(tmp));

                            if (palabraJuego.equalsIgnoreCase(tmp)) {
                                JOptionPane.showMessageDialog(null, "Ganó!!! " + "\n Total de intentos requeridos: " + intentos);

                                break;

                            } else {
                                JOptionPane.showMessageDialog(null, "Usted se ha equivocado, siga participando ");
                            }

                        }

                        conti = JOptionPane.showConfirmDialog(null, "Desea volver a jugar? ",
                                "Confirmación", JOptionPane.YES_NO_OPTION);

                        if (conti == 0) {
                            repdatos = JOptionPane.showConfirmDialog(null, "Desea volver a jugar con"
                                    + " los mismos datos del jugador original? ",
                                    "Confirmación", JOptionPane.YES_NO_OPTION);

                            if (repdatos == 1) {
                                datos();
                            }

                        }

                    } while (conti == 0);
                    break;

                }
                case "4": {
                    //resultados();
                    JOptionPane.showMessageDialog(null, globalnom + " " + globalape1 + " " + globalape2
                            + " Total de intentos: " + globalV);
                    break;

                }

                case "5": {
                    JOptionPane.showMessageDialog(null, "Gracias por usar el software ");
                    System.exit(0);
                    break;
                }
                case "6": {
                    Creditos();
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, opc + " No es una opción váilda ");
                }
            }
        } while (!opc.equalsIgnoreCase("5"));
    }
    
    //VALIDACIONES**************************************************************

    //Validar correo
    static boolean esCorreo(String correo) {
        Pattern patron = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mat = patron.matcher(correo);
        return mat.find();
    }

    //Validar que se ingrese un valor númerico 
    public static boolean IsInteger(String text) {
        int v;
        try {
            v = Integer.parseInt(text);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    //Validar que se ingrese un dato con solo letras
    static boolean esSoloLetras(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.toUpperCase().charAt(i);
            int valorASCII = (int) caracter;
            if (valorASCII != 165 && (valorASCII < 65 || valorASCII > 90) && !cadena.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    //Para al presionar la opción de CANCELAR evitar que le código se caiga
    public static void CANCELAR(String i) {
        if (i == null) {
            JOptionPane.showMessageDialog(null, "Gracias por usar el software ");
            System.exit(0);
        }
    }

    //Clase de los Créditos del juego
    public static void Creditos() {
        JOptionPane.showMessageDialog(null, "Créditos: "
                + "\n Sebastián Sandoval Fallas ");
    }

}
