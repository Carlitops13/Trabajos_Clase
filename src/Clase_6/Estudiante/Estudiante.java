package Clase_6.Estudiante;

import javax.swing.JOptionPane;

public class Estudiante {
    // Es mejor no inicializar con valores predeterminados si se usa un constructor
    private String codigo;
    private String nombre;
    private String carrera;
    private int semestre;

    // Constructor
    public Estudiante(String codigo, String nombre, String carrera, int semestre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    // Getters y Setters (ya estaban correctos)
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    // Método para mostrar información (sustituyendo toString para mostrar en una ventana)
    public void mostrarInformacion() {
        String info = "CÓDIGO: " + this.codigo + "\n" +
                "NOMBRE: " + this.nombre + "\n" +
                "CARRERA: " + this.carrera + "\n" +
                "SEMESTRE: " + this.semestre;
        JOptionPane.showMessageDialog(null, info, "Información del Estudiante", JOptionPane.INFORMATION_MESSAGE);
    }

    // Método solicitado: MODIFICAR ESTUDIANTE
    public void modificarEstudiante() {
        // Modificar Nombre
        String nuevoNombre = JOptionPane.showInputDialog(
                null,
                "Modificar Nombre (Actual: " + this.nombre + "):",
                "Modificar Datos",
                JOptionPane.QUESTION_MESSAGE
        );
        if (nuevoNombre != null && !nuevoNombre.trim().isEmpty()) {
            this.setNombre(nuevoNombre.trim());
        }

        // Modificar Carrera
        String nuevaCarrera = JOptionPane.showInputDialog(
                null,
                "Modificar Carrera (Actual: " + this.carrera + "):",
                "Modificar Datos",
                JOptionPane.QUESTION_MESSAGE
        );
        if (nuevaCarrera != null && !nuevaCarrera.trim().isEmpty()) {
            this.setCarrera(nuevaCarrera.trim());
        }

        // Modificar Semestre
        String nuevoSemestreStr = JOptionPane.showInputDialog(
                null,
                "Modificar Semestre (Actual: " + this.semestre + "):",
                "Modificar Datos",
                JOptionPane.QUESTION_MESSAGE
        );

        if (nuevoSemestreStr != null && !nuevoSemestreStr.trim().isEmpty()) {
            try {
                int nuevoSemestre = Integer.parseInt(nuevoSemestreStr.trim());
                if (nuevoSemestre > 0) { // Validación simple
                    this.setSemestre(nuevoSemestre);
                } else {
                    JOptionPane.showMessageDialog(null, "El semestre debe ser un número positivo.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada no válida para Semestre. Debe ser un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        JOptionPane.showMessageDialog(null, "Datos modificados con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }


    public void saludar() {
        JOptionPane.showMessageDialog(null, "Hola que tal " + this.nombre + "!", "Saludo", JOptionPane.PLAIN_MESSAGE);
    }

    public void saludar(String nombre) {
        System.out.println("Hola que tal " + nombre + "!");
       // JOptionPane.showMessageDialog(null, "Hola como estás "+ nombre);
    }


    @Override
    public String toString() {
        return "Estudiante[Código=" + codigo + ", Nombre=" + nombre + ", Carrera=" + carrera + ", Semestre=" + semestre + "]";

    }
}
