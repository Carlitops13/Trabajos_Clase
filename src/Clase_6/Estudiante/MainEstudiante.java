package Clase_6.Estudiante;

import javax.swing.JOptionPane;

public class MainEstudiante {

    public static void main(String[] args) {


        Estudiante est = new Estudiante("A001", "Juan Perez", "Desarrollo de Software", 3);

        int opcion = 0;

        do {

            String menu = "ESTUDIANTE: " + est.getNombre() + "\n\n" +
                    "1. Mostrar Información\n" +
                    "2. Modificar Estudiante\n" +
                    "3. Saludar\n" +
                    "4. Salir";
            String opcionStr = JOptionPane.showInputDialog(null, menu, "Menú de Estudiante", JOptionPane.PLAIN_MESSAGE);
            if (opcionStr == null) {
                opcion = 4;
            } else {
                try {
                    opcion = Integer.parseInt(opcionStr.trim());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Opción no válida. Ingrese un número del 1 al 4.", "Error", JOptionPane.ERROR_MESSAGE);
                    opcion = 0;
                }
            }

            switch (opcion) {
                case 1:
                    est.mostrarInformacion();
                    break;
                case 2:
                    est.modificarEstudiante();
                    break;
                case 3:
                    est.saludar();
                    est.saludar("Carlos");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "¡Hasta luego!", "Fin del Programa", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    if (opcion != 0) {
                        JOptionPane.showMessageDialog(null, "Opción no reconocida. Intente de nuevo.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    }
                    break;
            }

        } while (opcion != 4);
    }
}